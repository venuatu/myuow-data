package models
import play.api.libs.ws._
import scala.concurrent._
import play.api.Play.current
import java.net.{URLDecoder, URLEncoder}

object http extends http
class http {
  def get(path: String): Future[WSResponse] = {
    WS.url(path).get()
  }
  def post(path: String, data: Map[String, Seq[String]]): Future[WSResponse] = {
    WS.url(path).post(data)
  }

  protected def encodeComponent(str: String): String = URLEncoder.encode(str, "UTF-8")
  protected def decodeComponent(str: String): String = URLDecoder.decode(str, "UTF-8")

  def formEncode(data: (String, Seq[String])*): String = {
    data.flatMap{case (key, values) => values.map{key +"="+ encodeComponent(_)}}.mkString("&")
  }
  def formDecode(str: String): Map[String, Seq[String]] = {
    str.split("&").map{_.split("=").map(decodeComponent)}.map{kv => (kv(0), if (kv.size > 1) kv(1) else "")}
      .groupBy(_._1).map{case (key, values) => (key, values.map{_._2}.toList)}.toMap
  }
}