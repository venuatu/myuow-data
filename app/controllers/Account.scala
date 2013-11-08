package controllers

import play.api._
import play.api.mvc._
import scala.concurrent._
import scala.concurrent.duration.DurationInt
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.libs.json.Json
import scala.util.matching.Regex
import scala.async.Async.{async, await}

object Account extends Account(models.http)
class Account(http: models.http) extends Controller {
	def login(username: String, password: String) = Action.async {
	    async {
	        val loginres = await(http.post("https://solss.uow.edu.au/sid/sols_logon.validate_sols_logon", 
    			Map("p_username" -> Seq(username), "p_password" -> Seq(password)))).body
	    	if (loginres.contains("Invalid Username and Password"))
		    	Status(403)("Invalid Username and Password")
		    else if (loginres.contains("SOLS has been locked until"))
		        Status(429)("Your account has been locked out of sols until " + Regex.extract(Regex.locked, loginres))
		    else {
		        val number = Regex.extract(Regex.number, loginres).toInt
		        val sid = Regex.extract(Regex.session, loginres)
		        val menures = await(http.get("https://solss.uow.edu.au/sid/sols_menu.display_sols_menu?p_system=STUDENT&p_menu_name=MAIN_MENU" +
		    	        s"&p_student_number=$number&p_session_id=$sid")).body
	            val cs = Regex.extract(Regex.cs, menures)// The p_cs in loginres is not used anywhere afaics
	            Ok(Json.toJson(AccountData(number, sid, cs)))
		    }
    	}
	}

    implicit val accountDataFmt = Json.format[AccountData]
	object Regex {
		var number = "student_number=([0-9]*)".r
		var session = "p_session_id=([0-9a-zA-Z]*)".r
		var cs = "p_cs=([0-9a-zA-Z]*)".r
		var locked = raw"SOLS has been locked until ([^\<]*)".r

		def extract(regex: Regex, input: String): String = {
		    regex.findFirstMatchIn(input) match {
		        case Some(item) => item.subgroups(0)
		        case None => ""
		    }
		}
	}
}

case class AccountData (number: Int, session: String, cs: String)
