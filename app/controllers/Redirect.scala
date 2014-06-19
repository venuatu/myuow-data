package controllers

import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.async.Async.{async, await}
import helpers.Extractors

object Redirect extends Redirect(models.http)
class Redirect(http: models.http) extends Controller with Extractors {
  
  def moodle(number: String, sid: String, cs: String) = Action.async {
    async {
      val resp = await(http.get("https://solss.uow.edu.au/sid/sols_to_lms.do_lms_SSO?" + 
          s"p_student_number=${number}&p_session_id=${sid}&p_cs=${cs}")).body
      val redirect = regexPullFirst(MOODLE_REGEX, resp)
      if (redirect.length > 0)
        SeeOther(redirect)
      else if (Account.invalidSession(resp))
        Status(401)("Invalid session")
      else
        InternalServerError(resp)
    }
  }
    
  val MOODLE_REGEX = "URL=([0-9a-zA-Z:\\/\\.?=&]*)\"".r
}