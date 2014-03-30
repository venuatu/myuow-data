package controllers

import play.api._
import play.api.mvc._
import scala.collection.JavaConversions._
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.libs.json.Json
import scala.util.matching.Regex
import scala.async.Async.{async, await}
import helpers.Extractors
import play.api.libs.json.JsValue

object Subject extends Subject(models.http)
class Subject(http: models.http) extends Controller with Extractors {
  def get(code: String, year: String) = Action.async {
    async {
      val search = await(http.post("https://solss.uow.edu.au/owa/sid/Timetable_All.Process_Search",
          Map("p_subject_code" -> Seq(code.toUpperCase),
            "p_subject_name" -> Seq(""),
            "p_subject_level" -> Seq("-1"),
            "p_session" -> Seq("-1"),
            "p_unit_abb" -> Seq("-1"),
            "p_year" -> Seq(year),
            "p_campus_id" -> Seq("1"),
            "p_draft" -> Seq(""),
            "p_publish_date" -> Seq("27 Sep, 2013 12:55:46pm"),
            "p_type" -> Seq("a"))
      )).body
      if (search.contains("No Subjects were found")) {
        NotFound(Json.toJson(Map("error" -> "No subject found")))
      } else {
        val identifier = regexPullFirst(SUBJECT_IDENTIFIER_REGEX, search)
        val subject = await(http.post("https://solss.uow.edu.au/owa/sid/Timetable_All.search_result_timetable",
          Map("p_year" -> Seq(year),
            "p_campus_id" -> Seq("1"),
            "p_draft" -> Seq(""),
            "p_publish_date" -> Seq("27 Sep, 2013 12:55:46pm"),
            "p_type" -> Seq("a"),
            "p_sub_instid_varray" -> Seq("-1", identifier))
        )).body
        Ok(parseSubject(subject))
      }
    }
  }

  def parseSubject(document: String): JsValue = {
    val doc = domParse(document)
    val data = SUBJECT_FIELDS.zip(doc.select("table tr").get(2).children.iterator.map{a => (a.html, a.text)}.toList).toMap
    def extractStaff(staff: Array[String]) = {
      var curr: String = "Lecturer"
      for (member <- staff
          if (!(member == "<b>Lecturer</b>" || member == "<b>Coordinator</b>") || { curr = member.replaceAll("</?b>", ""); false }) 
      ) yield {
        (curr, member)
      }
    }
    val staff = extractStaff(
        data("staff")._1.split("&nbsp;").flatMap{_.split("<br />")}.filter{a => !(a.isEmpty || a == " ")}.map{_.trim}
      ).groupBy(_._1).map{case (k, v) => (k, v.map{_._2}.toList)}
    val timetable = doc.select("table table > tbody > tr").iterator.drop(1).map{ item =>
      var fields = item.children.iterator.toList
      if (fields.length == SUBJECT_TIME_FIELDS.length + 1)
        fields = fields.drop(1)// extra and/or column
      val data = fields.map{_.text}
      val info = data(0) -> Class(data(1), data(2), data(3), data(4), data(5))
      info
    }.toList.groupBy(_._1).map{case (k, v) => (k, v.map{_._2}.toList)}
    //println(doc)
    Json.toJson(new Subject(data.map{a => (a._1, a._2._2)}, staff, timetable))
  }
  def pull(data: Map[String, String], name: String): String = data.getOrElse(name, "")
  case class Class(day: String, start: String, finish: String, location: String, week: String)
  case class Subject(code: String, name: String, year: String, session: String, campus: String,
      points: String, hours: String, coordinators: List[String], lecturers: List[String],
      classes: Map[String, List[Class]]) {
    def this(data: Map[String, String], staff: Map[String, List[String]], classes: Map[String, List[Class]]) = 
      this(pull(data, "code"),
       pull(data, "name"),
       pull(data, "year"),
       pull(data, "session"),
       pull(data, "campus"),
       pull(data, "points"),
       pull(data, "hours"),
       staff.get("Coordinator").getOrElse(List()),
       staff.get("Lecturer").getOrElse(List()),
       classes
      )
  }
  implicit val classFmt = Json.format[Class]
  implicit val subjectFmt = Json.format[Subject]

  val SUBJECT_IDENTIFIER_REGEX = """NAME="p_sub_instid_varray" VALUE="([0-9]*)"""".r
  val SUBJECT_FIELDS = Array("code", "name", "year", "session", "campus", "points", "staff", "hours");
  val SUBJECT_TIME_FIELDS = Array("activity", "day", "start", "finish", "location", "week")
}
