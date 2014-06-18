import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import org.specs2.specification.BeforeExample
import play.api.test.PlaySpecification
import org.specs2.mock.Mockito
import Responses.TestResponse
import scala.concurrent.Future

@RunWith(classOf[JUnitRunner])
class UnitSpec extends PlaySpecification with Mockito with BeforeExample {
  var http = mock[models.http]
  var defaultresp = TestResponse(200, "abcdef")

  override def before = {
    http = mock[models.http]
    http.get(any[String]) returns Future { failure("default http get"); defaultresp }
    //http.post(any[String], any[Map[String, Seq[String]]]) returns Future { failure("default http post"); defaultresp }
  }
}