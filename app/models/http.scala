package models

import play.api.libs.ws._
import scala.concurrent._

object http extends http
class http {
	def get(path: String): Future[Response] = {
	    WS.url(path).get
	}
	def post(path: String, data: Map[String, Seq[String]]): Future[Response] = {
	    WS.url(path).post(data)
	}
}