package models

import play.api.libs.json.Json
import helpers.Extractors
import helpers.JsonHelpers.CacheAsJson
import scala.concurrent.Future
import scala.collection.JavaConversions._
import scala.async.Async._
import scala.concurrent.ExecutionContext.Implicits.global

object TimetableSearch {
  def apply(code: String, year: Int, campus: Int)(implicit http: models.http): Future[List[InstanceDetails]] = {
    CacheAsJson(s"timetablesearch.$year|${code.toUpperCase}") { async {
      val search = await(http.post("https://solss.uow.edu.au/owa/sid/Timetable_All.Process_Search",
        Map("p_subject_code" -> Seq(code.toUpperCase),
          "p_subject_name" -> Seq(""),
          "p_subject_level" -> Seq("-1"),
          "p_session" -> Seq("-1"),
          "p_unit_abb" -> Seq("-1"),
          "p_year" -> Seq(year.toString),
          "p_campus_id" -> Seq(campus.toString),
          "p_draft" -> Seq(""),
          "p_publish_date" -> Seq("27 Sep, 2013 12:55:46pm"),
          "p_type" -> Seq("a"))
      )).body

      parseInstances(search)
    }}
  }

  protected def parseInstances(document: String): List[InstanceDetails] = {
    val doc = Extractors.domParse(document)
    doc.select("input[type=checkbox][name=p_sub_instid_varray]").iterator.toList.map{e =>
      val row = e.parent().parent().children().iterator().toList.map{_.text()}
      InstanceDetails(e.attr("value").toInt, row(1), row(2), row(3), row(4), row(5))
    }.toList
  }

  case class InstanceDetails(id: Int, code: String, name: String, session: String, credits: String, faculty: String)
  implicit val instanceDetailsfmt = Json.format[InstanceDetails]
}
