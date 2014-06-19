package controllers

import play.api.mvc._
import scala.collection.JavaConversions._
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.libs.json.Json
import scala.async.Async.{async, await}
import helpers.Extractors

object Subjects extends Subjects(models.http)
class Subjects(http: models.http) extends Controller with Extractors {
  def enrolled(number: String, sid: String, cs: String) = Action.async {
    async {
      val resp = await(http.get("https://solss.uow.edu.au/sid/timetable_student.call_main?" +
          s"P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}")).body
      if (Account.invalidSession(resp))
         Status(401)("Invalid session")
      else
        Ok(Json.toJson(domParse(resp).select("td > a").iterator.map{_.text}.toList))
    }
  }
  
  def enrolledTimetable(number: String, sid: String, cs: String) = Action.async {
    async {// TODO: make Subject.parseSubject more general
      val resp = await(http.get("https://solss.uow.edu.au/sid/timetable_student.call_main?" +
          s"P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}")).body
      def wrap(str: String) = "<table>" + str + "</table>"
      val subjects = domParse(resp).select("div > table.t_b").map{a => wrap(a.toString)}
        //.map{Timetable.parseSubject(_)}
      InternalServerError("NYI")
    }
  }
}