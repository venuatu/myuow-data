package controllers

import play.api.mvc.Action
import play.api.libs.json._
import play.api.libs.json.JsObject

object Documentation extends BaseController {

  def doc() = Action {implicit request =>
    val routes = play.api.Play.current.routes.map{_.documentation}.get
    prettyResult(200, jso(
      "name" -> "MyUOW apis",
      "source" -> "https://github.com/venuatu/myuow-data",
      "routes" -> routes.map{
        case (method, route, function) =>
          s"$method $route" -> function.replace("controllers.", "")
      }.sortBy{_._1}
    ))
  }

  // 3 lines of awesome:
  def jso(items: (String, JsValue)*): JsValue = items.toSeq
  implicit def writesToJsValue[T: Writes](data: T): JsValue = Json.toJson(data)
  implicit def seqWritesToJsObject[T: Writes](data: Seq[(String, T)]): JsValue =
    JsObject(data.map{case (a, b) => a -> Json.toJson(b)})
}
