package models

import scala.concurrent.ExecutionContext.Implicits.global
import scala.collection.JavaConversions._
import scala.concurrent.Future
import play.api.libs.json.Json
import helpers.Extractors
import helpers.JsonHelpers.CacheAsJson
import org.jsoup.nodes.{Node, Element}
import org.jsoup.select.NodeVisitor

object Description {
  def apply(id: Int, code: String, year: Int)(implicit http: models.http): Future[Description] = {
    CacheAsJson(s"description.$year|${code.toUpperCase}|$id") {
      http.get("https://sols.uow.edu.au/sid/CAL.USER_SUBJECTINFO_SCREEN?" + http.formEncode(
        "p_faccde" -> Seq(""),
        "p_depabb" -> Seq(""),
        "p_subcode" -> Seq(code.toUpperCase),
        "p_cal_subject_id" -> Seq(id.toString),
        "p_year" -> Seq(year.toString),
        "p_cal_type" -> Seq("U"),
        "p_cal_types" -> Seq("UP"),
        "p_breadcrumb_type" -> Seq("")
      )).map {resp =>
        parseDescription(resp.body)
      }
    }
  }

  def parseDescription(document: String): Description = {
    val doc = Extractors.domParse(document).select("table")
    val entries = doc.subList(0, doc.size -1)

    val data: Map[String, Seq[Seq[Element]]] = Extractors.kvTuplesToMap(entries.map{entry =>
      val rows = entry.child(0).children()
      rows.first().text() -> rows.drop(1).toVector
    })

    val info: Information = data("Subject Information").map {rows =>
      val data = definitionsToKeyVals(rows)
      Information(data("Subject Code"), data("Subject Name"), data("Credit Points"), data("Pre-Requisites"),
        data("Co-Requisites"), data("Restrictions"), data("Equivalence"), data("Assessment"))
    }.head

    val availability: Seq[Availability] = data("Subject Availability").map{rows =>
      val data = definitionsToKeyVals(rows)
      val rootNode = rows(0).parent()
      val sessionData = EXTRACT_SESSION.findFirstMatchIn(data("Session")).get.subgroups.map{toIsoDate}
      val session = Session(sessionData(0), sessionData(1), sessionData(2), toIsoDate(data("Census Date")))

      Availability(session, data("Campus"), data("Course Restrictions"), data("Contact Hours"),
        getTeacherInfo(rootNode, "Lecturer"), getTeacherInfo(rootNode, "Coordinator"))
    }

    def extractFreeText(elements: Seq[Seq[Element]]): Seq[String] = elements.flatMap{_.flatMap{getFreeText}}

    val description = extractFreeText(data("Subject Description")).mkString("\n").trim
    val extra = extractFreeText(data.getOrElse("Extra Information", Seq(Seq())))
    // "Textbook Information" needs the scraping of the unishop page to be useful

    Description(info, availability, description, extra)
  }

  private def definitionsToKeyVals(row: Seq[Element]): Map[String, String] = {
    row.map{_.children().toVector.map{_.text().trim}}
      .map{a => (a(0), if (a.length > 1) a(1) else "")}.toMap
  }


  private def getTeacherInfo(elem: Element, teacherType: String): Seq[String] = {
    try {
      elem.select(s"td:contains($teacherType)").first().parent().child(1).textNodes()
        .map{_.toString.trim}.filterNot{str => str.isEmpty || str == "&nbsp;"}
    } catch {
      case e: IndexOutOfBoundsException => Seq()
    }
  }

  private def getFreeText(elem: Element): Seq[String] = {
    val data = collection.mutable.ArrayBuffer[String]()
    elem.childNodes().foreach{node =>
      node.traverse(new NodeVisitor {
        override def head(node: Node, depth: Int) {
          if (node.nodeName() == "#text")
            data += node.toString.trim
        }
        override def tail(node: Node, depth: Int) {}
      })
    }
    return data.filterNot{str => str.isEmpty || str == "&nbsp;"}.toSeq
  }
  // "Spring  (28-07-2014 to 20-11-2014)"
  private val EXTRACT_SESSION = """^(.+)  \(([0-9-]+) to ([0-9-]+)\)$""".r

  def toIsoDate(date: String): String = date.split('-').reverse.mkString("-")

  sealed trait DescriptionTables
  case class Information(code: String, name: String, points: String, prerequisites: String, corequisites: String,
                restrictions: String, equiv: String, assessment: String) extends DescriptionTables
  case class Session(name: String, start: String, end: String, census: String)
  case class Availability(session: Session, campus: String, restrictions: String, hours: String,
                          lecturers: Seq[String], coordinators: Seq[String]) extends DescriptionTables
  case class Details(text: String) extends DescriptionTables

  case class Description(information: Information, availability: Seq[Availability], description: String, extra: Seq[String])
  implicit val informationFmt = Json.format[Information]
  implicit val sessionFmt = Json.format[Session]
  implicit val availabilityFmt = Json.format[Availability]
  implicit val descriptionFmt = Json.format[Description]
}
