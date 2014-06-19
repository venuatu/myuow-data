package controllers

import play.api.mvc._
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.libs.json.Json
import scala.async.Async.{async, await}
import helpers.Extractors

object Account extends Account(models.http)
class Account(http: models.http) extends Controller with Extractors {
  def login(username: String, password: String) = Action.async {
    async {
      val loginres = await(http.post("https://solss.uow.edu.au/sid/sols_logon.validate_sols_logon", 
      Map("p_username" -> Seq(username), "p_password" -> Seq(password)))).body
      if (loginres.contains("Invalid Username and Password"))
        Status(403)("Invalid Username and Password")
      else if (loginres.contains("SOLS has been locked until"))
        Status(429)("Your account has been locked out of sols until " + regexPullFirst(Regex.locked, loginres))
      else {
        val number = regexPullFirst(Regex.number, loginres).toInt
        val sid = regexPullFirst(Regex.session, loginres)
        val menures = await(http.get("https://solss.uow.edu.au/sid/sols_menu.display_sols_menu?p_system=STUDENT&p_menu_name=MAIN_MENU" +
              s"&p_student_number=$number&p_session_id=$sid")).body
        val cs = regexPullFirst(Regex.cs, menures)// The p_cs in loginres is not used anywhere afaics
        Ok(Json.toJson(AccountData(number, sid, cs)))
      }
    }
  }
  
  def loginPost() = Action.async { req =>
    req.body.asJson.map { data =>
      login((data \ "username").as[String], (data \ "password").as[String])(req)
    } getOrElse {
      Future { BadRequest("Missing username or password") }
    }
  }
  
  def checkAuth(number: String, sid: String, cs: String) = Action.async {
    async {
      val resp = await(http.get("https://solss.uow.edu.au/sid/sols_to_lms.call_main?" +
            s"P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}")).body
       if (invalidSession(resp))
         Status(401)("Invalid session")
       else
         Ok("All is good")
    }
  }

  val INVALID_SESSION_STRINGS = Array("Your session has timed out.", "Parameter Mismatch",
      "You are not currently logged on to the SOLS system")

  case class AccountData (number: Int, session: String, cs: String)
  def invalidSession(str: String) = INVALID_SESSION_STRINGS.exists(str.contains(_))
      
  implicit val accountDataFmt = Json.format[AccountData]
  object Regex {
    var number = "student_number=([0-9]*)".r
    var session = "p_session_id=([0-9a-zA-Z]*)".r
    var cs = "p_cs=([0-9a-zA-Z]*)".r
    var locked = raw"SOLS has been locked until ([^\<]*)".r
  }
}
