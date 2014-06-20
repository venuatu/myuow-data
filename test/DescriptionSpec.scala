import models.{DescriptionSearch, Description, TimetableSearch, Timetable}
import play.mvc.Result
import Responses.TestResponse
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import org.specs2.specification._
import play.api.libs.ws.Response
import play.api.test.WithApplication
import org.mockito.Matchers
import play.api.libs.json.Json

class DescriptionSpec extends UnitSpec {

  "description" should {
    "search" in new WithApplication {
      http.get(any[String]) returns Future { Responses.Descriptions.searchResponse }
      val result = Await.result(DescriptionSearch("", 42)(http), 1 second)

      Json.toJson(result) must beEqualTo(Json.parse("""[{
        "id": 149742,
        "code": "CSCI342",
        "year": 2014,
        "name": "Mobile Applications",
        "points": "6"
      }, {
        "id": 149743,
        "code": "CSCI346",
        "year": 2014,
        "name": "Game Development",
        "points": "6"
      }]"""))
    }

    "parse" in new WithApplication {
      http.get(any[String]) returns Future { Responses.Descriptions.descResponse }
      val result = Await.result(Description(42, "", 42, 42), 1 second)

      Json.toJson(result).toString must beEqualTo("""{}""")
    }.pendingUntilFixed("unstable api")
  }
}
