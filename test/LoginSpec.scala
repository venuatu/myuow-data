import scala.concurrent._
import scala.concurrent.duration.DurationInt
import scala.concurrent.ExecutionContext.Implicits.global
import org.specs2.specification._
import play.api.libs.ws.Response
import play.api.test.FakeRequest

class LoginSpec extends UnitSpec with BeforeExample {
  var http = mock[models.http]
  var defaultresp = mock[Response]

  override def before = {
    http = mock[models.http]
    defaultresp = mock[Response]
    defaultresp.status returns 200
    defaultresp.body returns "abcdef"
    http.get(any[String]) returns Future { failure("default http get"); defaultresp }
    //http.post(any[String], any[Map[String, Seq[String]]]) returns Future { failure("default http post"); defaultresp }
  }

  "http mock" should {
    "work" in {
      http.get("http://fake.com") returns Future { defaultresp }
      val res = Await.result(http.get("http://fake.com"), 1 seconds)
      res.body must equalTo("abcdef")
    }
  }
  //TODO: Find a way to match against an equal credential map
  "/login" should {
    "403 when login fails" in {
      //"https://solss.uow.edu.au/sid/" val credentials = Map("p_username" -> Seq("uname"), "p_password" -> Seq("pass"))
      http.post(any[String], any[Map[String, Seq[String]]]) returns Future { Responses.Logon.invalidCredentials }

      val controller = new controllers.Account(http)
      val result = controller.login("uname", "pass")(FakeRequest())

      status(result) must equalTo(403)
      contentAsString(result) must equalTo("Invalid Username and Password")
    }
    
    "sucessfully login" in {
      http.post(any[String], any[Map[String, Seq[String]]]) returns Future { Responses.Logon.success }
      http.get("https://solss.uow.edu.au/sid/sols_menu.display_sols_menu?p_system=STUDENT&p_menu_name=MAIN_MENU" + 
        s"&p_student_number=${Responses.Logon.number}&p_session_id=${Responses.Logon.session}") returns 
          Future { Responses.Menu.response }
      val controller = new controllers.Account(http)
      val result = controller.login("uname", "pass")(FakeRequest())
      
      status(result) must equalTo(200)
      val json = contentAsJson(result)
      (json \ "number").as[Int] must equalTo(Responses.Logon.number)
      (json \ "session").as[String] must equalTo(Responses.Logon.session)
      (json \ "cs").as[String] must equalTo(Responses.Menu.cs)
    }
  }
}
