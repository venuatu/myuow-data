package filters

import play.api.mvc._
import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import controllers.Default
import play.api.libs.iteratee.Enumerator
import play.Logger

object CorsFilter extends Filter {
  def isPreFlight(req: RequestHeader) = (
    req.method.toLowerCase().equals("options") && req.headers.get("Access-Control-Request-Method").nonEmpty)
  
  override def apply(next: RequestHeader => Future[SimpleResult])(request: RequestHeader): Future[SimpleResult] = {
    if (isPreFlight(request)) {
      Future { Default.Ok.withHeaders(
        "Access-Control-Allow-Origin" -> request.headers.get("Origin").getOrElse("*"),
        "Access-Control-Allow-Methods" -> request.headers.get("Access-Control-Request-Method").getOrElse("*"),
        "Access-Control-Allow-Headers" -> request.headers.get("Access-Control-Request-Headers").getOrElse("")
        //"Access-Control-Allow-Credentials" -> "true" 
      )}
    } else {
      next(request).map {
        _.withHeaders(
          "Access-Control-Allow-Origin" -> request.headers.get("Origin").getOrElse("*"),
          "Access-Control-Allow-Methods" -> request.headers.get("Access-Control-Request-Method").getOrElse("*"),
          "Access-Control-Allow-Headers" -> request.headers.get("Access-Control-Request-Headers").getOrElse("")
          //"Access-Control-Allow-Credentials" -> "true"
        )
      }
    }
  }
}