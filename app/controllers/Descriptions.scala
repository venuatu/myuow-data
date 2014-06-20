package controllers

import scala.concurrent.ExecutionContext.Implicits.global
import play.api.mvc.Action
import org.joda.time.LocalDate
import models.{Description, DescriptionSearch}

object Descriptions extends BaseController {

  def search(code: String, year: Int) = Action.async {implicit request =>
    val realYear = if (year != 0) year else LocalDate.now().getYear
    DescriptionSearch(code, realYear).map{descriptions =>
      prettyResult(200, descriptions.map{desc =>
        jsonWithUrl(desc, routes.Descriptions.get(desc.id, desc.code, desc.faculty_id, desc.year).absoluteURL())
      }).withHeaders(CACHE_AWHILE)
    }
  }

  def get(id: Int, code: String, facultyId: Int, year: Int) = Action.async {
    val realYear = if (year != 0) year else LocalDate.now().getYear
    Description(id, code, facultyId, realYear).map{
      case Some(subject) =>
        prettyResult(200, subject).withHeaders(CACHE_AWHILE)
      case None =>
        prettyResult(404, Map("error" -> "Subject not found"))
    }
  }
}
