package models

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.async.Async.{async, await}
import scala.collection.JavaConversions._
import play.api.libs.json._
import helpers.Extractors
import helpers.JsonHelpers.CacheAsJson
import org.jsoup.nodes.Element

object Timetable {
  def apply(instanceId: Int)(implicit http: models.http): Future[Subject] = CacheAsJson(s"timetable.$instanceId") {
    async {
      val data = await(http.post("https://solss.uow.edu.au/owa/sid/Timetable_All.search_result_timetable",
        Map("p_year" -> Seq("2014"),
          "p_campus_id" -> Seq("1"),
          "p_draft" -> Seq(""),
          "p_publish_date" -> Seq("27 Sep, 2013 12:55:46pm"),
          "p_type" -> Seq("a"),
          "p_sub_instid_varray" -> Seq("-1", instanceId.toString)) // This allows for more than one subject per page
      )).body

      val doc = Extractors.domParse(data).select("table").get(1)
      parseTimetable(doc)
    }
  }

  private def parseTimetable(doc: Element): Subject = {
    val fields: Map[String, Element] = SUBJECT_FIELDS.zip(doc.select("tr").get(1).children.iterator.toList).toMap

    val staff: Map[String, Seq[String]] = Extractors.kvTuplesToMap(extractStaff(
      fields("staff").html().split("&nbsp;").flatMap{_.split("<br />")}
        .map{_.trim}.filterNot{a => a.isEmpty || a == " "}
    ))

    val classes: Map[String, Seq[Class]] = Extractors.kvTuplesToMap(
      doc.select("table tr").iterator.drop(1).map{ item =>
        var fields = item.children.iterator.toList
        if (fields.length == SUBJECT_TIME_FIELDS.length + 1)
          fields = fields.drop(1)// the and/or column
        val data = fields.map{_.text}
        val info = data(0) -> Class(data(1), data(2), data(3), data(4), data(5))
        info
    }.toSeq)

    val data: Map[String, String] = fields.map{case (name, elem) => (name, elem.text())}

    Subject(data("code"), data("name"), data("year").toInt, data("session"), data("campus"), data("points"), data("hours"),
      pullStaff(staff, "Coordinator"), pullStaff(staff, "Lecturer"), pullStaff(staff, "Tutor"), classes)
  }

  val STAFF_FIELDS = Seq("<b>Lecturer</b>", "<b>Coordinator</b>", "<b>Tutor</b>")
  private def extractStaff(staff: Array[String]): Seq[(String, String)] = {
    var curr: String = "Lecturer"
    for (member <- staff
      if !STAFF_FIELDS.exists{_ == member} || { curr = member.replaceAll("</?b>", ""); false }
    ) yield (curr, member)
  }

  private def pullStaff(staff: Map[String, Seq[String]], staffType: String) = staff.get(staffType).getOrElse(Seq())

  case class Class(day: String, start: String, finish: String, location: String, week: String)
  case class Subject(code: String, name: String, year: Int, session: String, campus: String,
                     points: String, hours: String, coordinators: Seq[String], lecturers: Seq[String],
                     tutors: Seq[String], classes: Map[String, Seq[Class]])
  implicit val classFmt = Json.format[Class]
  implicit val subjectFmt = Json.format[Subject]

  val SUBJECT_IDENTIFIER_REGEX = """NAME="p_sub_instid_varray" VALUE="([0-9]*)"""".r
  val SUBJECT_FIELDS = Seq("code", "name", "year", "session", "campus", "points", "staff", "hours")
  val SUBJECT_TIME_FIELDS = Seq("activity", "day", "start", "finish", "location", "week")
}
