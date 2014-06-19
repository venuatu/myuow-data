package controllers

import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import models.{Timetable, TimetableSearch}
import org.joda.time.LocalDate

object Timetables extends BaseController {
  def search(code: String, year: Int, campus: Int) = Action.async {implicit request =>
    val realYear = if (year != 0) year else LocalDate.now().getYear
    TimetableSearch(code, realYear, campus).map {items =>
      prettyResult(200, items.map{item =>
        jsonWithUrl(item, routes.Timetables.get(item.id).absoluteURL())
      }).withHeaders(CACHE_AWHILE)
    }
  }

  def get(id: Int) = Action.async {
    Timetable(id).map{subject =>
      prettyResult(200, subject).withHeaders(CACHE_AWHILE)
    }
  }

  def campuses = Action {
    prettyResult(200, Map(
      "Wollongong Campus"   -> 1,
      "Shoalhaven"          -> 3,
      "Bega"                -> 4,
      "Batemans Bay"        -> 5,
      "Southern Highlands"  -> 34,
      "Southern Sydney"     -> 38,
      "Innovation Campus"   -> 52
    ))
  }
}
