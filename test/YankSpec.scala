import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import org.specs2.specification._
import play.api.libs.ws.Response
import play.api.test.FakeRequest
import play.api.libs.json.Json

class YankSpec extends UnitSpec with BeforeExample {
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
  
  "/menu" should {// sols menu always responds with a menu
    "work" in {
      http.get(any[String]) returns Future { Responses.Menu.response }

      val controller = new controllers.Yank(http)
      val result = controller.menu("", "")(FakeRequest())

      status(result) must equalTo(200)
      contentAsJson(result) must equalTo(Json.parse("""[{
    "title": "Main Menu",
    "links": [{
        "title": "eLearning",
        "links": "https://solss.uow.edu.au/sid/sols_to_lms.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121"
      }, {
        "title": "Assignment Results",
        "links": "https://solss.uow.edu.au/sid/Assignment_Result.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121"
  }]}, {
    "title": "Timetable Menu",
    "links": [{
        "title": "Exam Timetable",
        "links": "https://solss.uow.edu.au/sid/er_exam_timetable.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121"
      }, {
        "title": "Subject Timetable",
        "links": "https://solss.uow.edu.au/sid/timetable_student.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121"
  }]}, {
    "title": "Other Information",
    "links": [
      { "title": "View IT Policies", "links": "http://www.uow.edu.au/about/policy/it/index.html" },
      { "title": "Find out what's happening at UOW - UOWnow", "links": "http://now.uow.edu.au/" }
]}]"""))
     }
  }
}