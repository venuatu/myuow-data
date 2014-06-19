package controllers

import play.api.mvc._
import scala.concurrent.ExecutionContext.Implicits.global
import play.api.libs.json.Json
import scala.async.Async.{async, await}
import helpers.Extractors
import scala.collection.JavaConversions._

object Yank extends Yank(models.http)
class Yank(http: models.http) extends Controller with Extractors {

  case class MenuLink(title: String, link: String)
  case class MenuCategory(title: String, links: Vector[MenuLink])
  implicit val linkFmt = Json.format[MenuLink]
  implicit val categoryFmt = Json.format[MenuCategory]
  
  def menu(number: String, sid: String) = Action.async {
    async {
      val resp = await(http.get("https://solss.uow.edu.au/sid/sols_menu.display_sols_menu?p_system=STUDENT&" +
          s"p_menu_name=MAIN_MENU&p_student_number=${number}&p_session_id=${sid}")).body
      val doc = domParse(resp)
      def prependSols(link: String) = {
        if (link.startsWith("/")) "https://solss.uow.edu.au" + link
        else link
      }
      Ok(Json.toJson(
        doc.select("#navMenu > ul > li").iterator.map{ item =>
          MenuCategory(item.select("span").first.text, item.select(".navLinks a").iterator.map{ v =>
            MenuLink(v.text, prependSols(v.attr("href")))
          }.toVector)
        }.toVector
      ))
    }
  }
  
  def yank(page: String, number: String, sid: String, cs: String) = Action.async {
    val uri = page match {
      case "AssignmentResults" => s"Assignment_Result.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "PersonalDetails" => s"personal_details_student.call_main1_sols?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "ContactDetails" => s"personal_details_student.call_main2_sols?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "FinalGrades" => s"enrolment_record_student.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "PrintRecord" => s"PRINT_ENROLMENT_RECORD_STD.main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "Enrolment" => s"MCP.MCP_ON_CHOOSE1?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}&P_PROCESS=VARIATION&P_STEP=1&P_USR_CHOICE=Continue"
      case "MajorMaintenance" => s"MAJOR_MAINT_STUDENT.call_main_sols?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "AcademicConsideration" => s"AC_STUDENT.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "StatisticalInformation" => s"MCP.MCP_ON_CHOOSE1?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}&P_PROCESS=DETYA&P_STEP=1&P_USR_CHOICE=HOME"
      case "Textbook" => s"textbook.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "AffiliateMembership" => s"MCP.MCP_ON_CHOOSE1?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}&P_PROCESS=MEMBERSHIP&P_STEP=10&P_USR_CHOICE=HOME"
      case "TutorialEnrolment" => s"tutorial_enrolment.call_main_student?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "Mail" => s"STUDENT_HISTORY.CALL_MAIN_STUDENT?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "Feedback" => s"sols_feedback.information_page?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "Vote" => s"evote_pkg.print_introduction?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "Forms" => s"SF_STUDENT_VIEW.student_forms?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "SupplementaryExam" => s"supp_assmnt_offer.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "ExamTimetable" => s"er_exam_timetable.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "SubjectTimetable" => s"timetable_student.call_main?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "HelpLoanOption" => s"BILLING_MAINTENANCE_STD.GETSTUDENTDETAILS?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "FeeStatement" => s"sols_to_fee.fee_statement_link?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "CommonwealthAssistance" => s"sols_to_fee.can_statement_link?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "HecsNoticePre2005" => s"sols_to_fee.hecs_statement_link?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "PelsNoticePre2005" => s"sols_to_fee.pels_statement_link?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "GraduationApplication" => s"GRAD_APP.ACCEPT_SCREEN?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "GraduationConfirmation" => s"GRAD_CONFIRMATION_ELIGIBILITY.CALL_MAIN_SOLS?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "HdrReport" => s"apr_sols.course_select?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case "HdrSystem" => s"SOLS_TO_RIS.RIS_INTERFACE?P_STUDENT_NUMBER=${number}&P_SESSION_ID=${sid}&p_cs=${cs}"
      case _ => ""
    }
    async {
      if (uri == "")
        NotFound("")
      else {
        val page = await(http.get("https://solss.uow.edu.au/sid/" + uri)).body
        if (Account.invalidSession(page))
          Status(401)("Invalid session")
        else {
          val doc = domSanitise(page)
          Ok(doc).as("text/html")
        }
      }
    }
  }
}
