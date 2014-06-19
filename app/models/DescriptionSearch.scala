package models

import scala.concurrent.ExecutionContext.Implicits.global
import scala.collection.JavaConversions._
import scala.concurrent.Future
import helpers.Extractors
import helpers.JsonHelpers.CacheAsJson
import play.api.libs.json.Json

object DescriptionSearch {

  def apply(code: String, year: Int)(implicit http: models.http): Future[Seq[DescriptionDetails]] = {
    CacheAsJson(s"descriptionSearch.$year|${code.toUpperCase}") {
      http.get("https://sols.uow.edu.au/sid/CAL.USER_SEARCHRESULTS_FORM?" + http.formEncode(
        "p_cal_types" -> Seq("UP"),
        "p_breadcrumb_type" -> Seq("0"),
        "p_searchstring" -> Seq(code.toUpperCase),
        "p_subj_lvl" -> Seq("All Subject Levels"),
        "p_dptname" -> Seq("All departments"),
        "p_session" -> Seq("All sessions"),
        "p_campus" -> Seq("All campuses"),
        "p_method" -> Seq("All delivery methods"),
        "p_subject" -> Seq("All subjects"),
        "p_year" -> Seq(year.toString),
        "p_cal_type" -> Seq("U")
      )).map {resp =>
        parseDescription(resp.body)
      }
    }
  }

  protected def parseDescription(document: String): Seq[DescriptionDetails] = {
    val doc = Extractors.domParse(document).select("table")
    doc.first().select("tr").iterator.drop(1).toSeq.map{desc =>
      val children = desc.children()
      val link = children.select("a").attr("href")
      val query = http.formDecode(link.substring(link.indexOf('?')))

      DescriptionDetails(query("p_cal_subject_id")(0).toInt, query("p_subcode")(0), query("p_year")(0).toInt,
        children.get(1).text(), children.get(2).text())
    }.toSeq
  }

  // https://sols.uow.edu.au/sid/CAL.USER_SUBJECTINFO_SCREEN?p_faccde=&p_depabb=&p_subcode=CSCI311&p_cal_subject_id=149729&p_year=2014&p_cal_type=U&p_cal_types=UP&p_breadcrumb_type=
  case class DescriptionDetails(id: Int, code: String, year: Int, name: String, points: String)
  implicit val detailsFmt = Json.format[DescriptionDetails]
}
