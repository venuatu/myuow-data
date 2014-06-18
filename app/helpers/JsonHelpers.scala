package helpers

import play.api.libs.json._
import play.api.Play.current
import scala.concurrent.duration._
import scala.concurrent.{Promise, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.libs.json.JsObject
import play.api.libs.json.JsString
import scala.Some
import play.api.cache.Cache

object JsonHelpers extends JsonHelpers
trait JsonHelpers {
  /**
   * A play.api.cache.Cached inspired function that supports futures (rather than just results)
   * This supports caching any type with a json Reads and Writes
   */
  def CacheAsJson[T](key: String, timeoutSeconds: Int = 1.day.toSeconds.toInt)(getter: => Future[T])
                    (implicit reads: Reads[T], writes: Writes[T]): Future[T] = {
    val prom = Promise[T]()
    Cache.get(key) match {
      case Some(data) =>
        prom.success(Json.parse(data.asInstanceOf[String]).as[T])
      case None =>
        getter.map{value =>
          Cache.set(key, Json.toJson(value).toString(), timeoutSeconds)
          prom.success(value)
        } recover {
          case e: Throwable => prom.failure(e)
        }
    }
    prom.future
  }

  /** Takes a T then serializes that to json and adds a @url property */
  def jsonWithUrl[T](item: T, url: String)(implicit wr: Writes[T]): JsObject = {
    Json.toJson(item).as[JsObject] ++ JsObject(Seq("url" -> JsString(url)))
  }

  // TODO: find out if this can be done through configuration to be site wide
  def jsonPretty[T](item: T)(implicit writes: Writes[T]) = Json.prettyPrint(Json.toJson(item))
}
