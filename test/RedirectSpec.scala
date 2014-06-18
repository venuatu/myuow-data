import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import org.specs2.specification._
import play.api.libs.ws.Response
import play.api.test.FakeRequest

class RedirectSpec extends UnitSpec {

  "/moodle" should {
    "redirect me" in {
      http.get(any[String]) returns Future { Responses.Moodle.good }

      val controller = new controllers.Redirect(http)
      val result = controller.moodle("", "", "")(FakeRequest())

      status(result) must equalTo(303)
      header("Location", result) must beSome(Responses.Moodle.uri)
    }
    
    "say when the session is invalid" in {
      http.get(any[String]) returns Future { Responses.CheckAuth.timedOut }

      val controller = new controllers.Redirect(http)
      val result = controller.moodle("", "", "")(FakeRequest())

      contentAsString(result) must contain("Invalid session")
      status(result) must equalTo(401)
    }
  }
}