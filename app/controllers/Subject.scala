package controllers

import play.api._
import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.async.Async.{async, await}
import helpers.{JsonHelpers, Extractors}
import play.api.libs.json._
import play.api.cache._
import java.util.Calendar
import scala.util.{Success, Failure}
import models.{Description, DescriptionSearch, Timetable, TimetableSearch}
import play.api.http.ContentTypes
import org.joda.time.LocalDate

object Subject extends Controller with JsonHelpers {
  implicit val http = models.http

  def searchTimetables(code: String, year: Int, campus: Int) = Action.async {implicit request =>
    val realYear = if (year != 0) year else LocalDate.now().getYear
    TimetableSearch(code, realYear, campus).map {items =>
      Ok(jsonPretty(items.map{item =>
        jsonWithUrl(item, routes.Subject.getTimetable(item.id).absoluteURL())
      })).as(ContentTypes.JSON)
    }
  }

  def searchDescriptions(code: String, year: Int) = Action.async {implicit request =>
    val realYear = if (year != 0) year else LocalDate.now().getYear
    DescriptionSearch(code, realYear).map{descriptions =>
      Ok(jsonPretty(descriptions.map{desc =>
        jsonWithUrl(desc, routes.Subject.getDescription(desc.id, desc.code, desc.year).absoluteURL())
      })).as(ContentTypes.JSON)
    }
  }

  def getTimetable(id: Int) = Action.async {
    Timetable(id).map{subject =>
      Ok(jsonPretty(subject)).as(ContentTypes.JSON)
    }
  }

  def getDescription(id: Int, code: String, year: Int) = Action.async {
    val realYear = if (year != 0) year else LocalDate.now().getYear
    Description(id, code, realYear).map{subject =>
      Ok(jsonPretty(subject)).as(ContentTypes.JSON)
    }
  }

  def campuses = Action {
    Ok(jsonPretty(Map(
      "Wollongong Campus"   -> 1,
      "Shoalhaven"          -> 3,
      "Bega"                -> 4,
      "Batemans Bay"        -> 5,
      "Southern Highlands"  -> 34,
      "Southern Sydney"     -> 38,
      "Innovation Campus"   -> 52
    ))).as(ContentTypes.JSON)
  }
}
