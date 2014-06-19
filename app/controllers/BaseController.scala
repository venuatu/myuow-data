package controllers

import scala.concurrent.duration.DurationInt
import play.api.libs.json.Writes
import play.api.mvc.{Controller, Result}
import play.api.http.ContentTypes
import helpers.JsonHelpers

class BaseController extends Controller with JsonHelpers {
  def prettyResult[T](code: Int, data: T)(implicit writes: Writes[T]): Result = {
    Status(code)(jsonPretty(data)).as(ContentTypes.JSON)
  }

  val CACHE_AWHILE = (CACHE_CONTROL, "public, max-age="+ 1.day.toSeconds)
  implicit val http = models.http
}
