package helpers

import scala.util.matching.Regex
import play.api.mvc.Controller
import org.jsoup._
import org.jsoup.safety.Whitelist

object Extractors extends Extractors
trait Extractors {
  def regexPullFirst(regex: Regex, input: String): String = {
    regex.findFirstMatchIn(input) match {
      case Some(item) => item.subgroups(0)
      case None => ""
    }
  }

  def domParse(document: String, uri: String = "https://solss.uow.edu.au/sid/"): org.jsoup.nodes.Document = {
    Jsoup.parse(document, uri)
  }

  lazy val whitelist = Whitelist.relaxed().addTags("font", "html", "head", "body", "title")
  def domSanitise(document: String, uri: String = "https://solss.uow.edu.au/sid/") = {
    Jsoup.clean(document, uri, whitelist)
  }

  /** [(a, 1), (a, 2)] => {a: [1, 2]} */
  def kvTuplesToMap[T, V](array: Seq[(T, V)]): Map[T, Seq[V]] = {
    array.groupBy(_._1).map {
      case (key, value) => (key, value.map{_._2})
    }.toMap
  }
}

