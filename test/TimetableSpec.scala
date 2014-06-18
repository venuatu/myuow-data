import models.{TimetableSearch, Timetable}
import play.mvc.Result
import Responses.TestResponse
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import org.specs2.specification._
import play.api.libs.ws.Response
import play.api.test.{WithApplication, FakeRequest}
import org.mockito.Matchers
import play.api.libs.json.Json

class TimetableSpec extends UnitSpec {

  "timetable search" should {
    "give me a single subject for 2013 ENGG154" in new WithApplication {
      http.post(Matchers.eq("https://solss.uow.edu.au/owa/sid/Timetable_All.Process_Search"), any[Map[String, Seq[String]]]) returns Future { Responses.Subject.search }

      val result = Await.result(TimetableSearch("ENGG154", 2013, 1)(http), 1 second)

      Json.toJson(result) must equalTo(Json.parse("""[{
        "id": 220997,
        "code": "ENGG154",
        "name": "Engineering Design and Innovation",
        "session": "Spring",
        "credits": "6",
        "faculty": "Faculty of Engineering and Information Sciences Engineering"
      }]"""))
    }
  }

  "timetable instance" should {
    "give me the right data" in new WithApplication {
      http.post(Matchers.eq("https://solss.uow.edu.au/owa/sid/Timetable_All.search_result_timetable"), any[Map[String, Seq[String]]]) returns Future { Responses.Subject.info }

      val result = Await.result(Timetable(220997)(http), 1 second)

      Json.toJson(result) must equalTo(Json.parse("""{
        "code": "ENGG154",
        "name": "Engineering Design and Innovation",
        "year": 2013,
        "session": "Spring",
        "campus": "Woll/On Campus/Class 1",
        "points": "6",
        "hours": "2L, 3T",
        "coordinators": ["A/PR Peter Wypych"],
        "lecturers": ["Mr Bruce Fowler", "Dr David Hastie", "Prof Timothy McCarthy", "A/PR Peter Wypych"],
        "classes": {
          "Computer Lab": [
            { "day": "Tue", "start": "08:30", "finish": "10:30", "location": "4-122", "week": "4-13" },
            { "day": "Tue", "start": "08:30", "finish": "10:30", "location": "6-227", "week": "4-13" },
            { "day": "Tue", "start": "14:30", "finish": "16:30", "location": "4-122", "week": "4-13" },
            { "day": "Tue", "start": "14:30", "finish": "16:30", "location": "6-227", "week": "4-13" },
            { "day": "Wed", "start": "10:30", "finish": "12:30", "location": "4-122", "week": "4-13" },
            { "day": "Wed", "start": "10:30", "finish": "12:30", "location": "6-227", "week": "4-13" },
            { "day": "Thu", "start": "10:30", "finish": "12:30", "location": "6-227", "week": "4-13" },
            { "day": "Thu", "start": "10:30", "finish": "12:30", "location": "4-122", "week": "4-13" },
            { "day": "Thu", "start": "10:30", "finish": "12:30", "location": "4-118", "week": "4-13" },
            { "day": "Fri", "start": "08:30", "finish": "10:30", "location": "4-122", "week": "4-13" },
            { "day": "Fri", "start": "08:30", "finish": "10:30", "location": "6-227", "week": "4-13" }
          ],
          "Lecture A": [{ "day": "Mon", "start": "14:30", "finish": "16:30", "location": "40-153", "week": "1-3,7-13" }],
          "Lecture B": [{ "day": "Mon", "start": "14:30", "finish": "15:30", "location": "40-153", "week": "4-6" }],
          "Lecture C": [
            { "day": "Mon", "start": "15:30", "finish": "16:30", "location": "67-104", "week": "4-6" },
            { "day": "Mon", "start": "15:30", "finish": "16:30", "location": "20-1", "week": "4-6" }
          ],
          "Practical": [
            { "day": "Tue", "start": "08:30", "finish": "10:30", "location": "1-G04", "week": "1-3" },
            { "day": "Tue", "start": "08:30", "finish": "10:30", "location": "1-105", "week": "1-3" },
            { "day": "Tue", "start": "10:30", "finish": "12:30", "location": "1-G04", "week": "1-3" },
            { "day": "Tue", "start": "10:30", "finish": "12:30", "location": "1-105", "week": "1-3" },
            { "day": "Tue", "start": "12:30", "finish": "14:30", "location": "4-118", "week": "1-3" },
            { "day": "Fri", "start": "08:30", "finish": "10:30", "location": "1-G04", "week": "1-3" },
            { "day": "Fri", "start": "08:30", "finish": "10:30", "location": "1-105", "week": "1-3" },
            { "day": "Fri", "start": "14:30", "finish": "16:30", "location": "1-G04", "week": "1-3" },
            { "day": "Fri", "start": "14:30", "finish": "16:30", "location": "1-105", "week": "1-3" }
          ],
          "Tutorial": [
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "19-2100", "week": "AllWeeks" },
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "3-122", "week": "AllWeeks" },
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "8-G25", "week": "AllWeeks" },
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "19-G015", "week": "AllWeeks" },
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "4-G31", "week": "AllWeeks" },
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "1-105", "week": "AllWeeks" },
            { "day": "Wed", "start": "14:30", "finish": "16:30", "location": "1-G05", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "19-G024", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "24-101", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "1-105", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "3-122", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "1-G04", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "19-1038", "week": "AllWeeks" },
            { "day": "Fri", "start": "11:30", "finish": "13:30", "location": "1-G05", "week": "AllWeeks" }
          ]
        }
      }"""))
   }
  }

  "/subjects/enrolled" should {
    "work" in {
      http.get("https://solss.uow.edu.au/sid/timetable_student.call_main?P_STUDENT_NUMBER=&P_SESSION_ID=&p_cs=") returns Future { Responses.Subject.timetable }

      val controller = new controllers.Subjects(http)
      val result = controller.enrolled("", "", "")(FakeRequest())

      status(result) must equalTo(200)
      contentAsJson(result) must equalTo(Json.parse("""["CSCI321","CSCI322","CSCI330","CSCI368"]"""))
    }

    "say when the session is invalid" in {
      http.get(any[String]) returns Future { Responses.CheckAuth.timedOut }

      val controller = new controllers.Subjects(http)
      val result = controller.enrolled("", "", "")(FakeRequest())

      status(result) must equalTo(401)
      contentAsString(result) must contain("Invalid session")
    }

    "timetable" should {
      "work" in {
        http.get("timetable_student.call_main?P_STUDENT_NUMBER=&P_SESSION_ID=&p_cs=") returns Future { Responses.Subject.timetable }

        val controller = new controllers.Subjects(http)
        val result = controller.enrolledTimetable("", "", "")(FakeRequest())

        status(result) must equalTo(200)
        contentAsString(result) must equalTo("")
      }.pendingUntilFixed("TODO")

      "say when the session is invalid" in {
        http.get(any[String]) returns Future { Responses.CheckAuth.timedOut }

        val controller = new controllers.Subjects(http)
        val result = controller.enrolledTimetable("", "", "")(FakeRequest())

        contentAsString(result) must contain("Invalid session")
        status(result) must equalTo(401)
      }.pendingUntilFixed("TODO")
    }
  }
}
