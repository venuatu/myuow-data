import play.api.libs.json.Json
import java.util.zip.Deflater

class MiscSpec extends UnitSpec {
  "crypto" should {
    val id = Json.parse("""{"number":"1234567","session":"GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG","cs":"28192482061335740121"}""")
    "have equal input and output" in {
      Crypto.decrypt(Crypto.encrypt(id)) must beSome(id)
    }

    "use an iv and not use the same iv" in {
      val one = Crypto.encrypt(id)
      val two = Crypto.encrypt(id)
      one must not equalTo(two)
      Crypto.encode(Crypto.stob(id.toString)).length

      Crypto.decrypt(one) must beSome(id)
      Crypto.decrypt(two) must beSome(id)
    }
    
    "say when the data is mangled" in {
      val one = Crypto.encrypt(id)
      def modify(str: String) =// Change a single character
        str.replace(str.charAt(str.length / 2), (str.charAt(str.length / 2).toInt -1).toChar)
      Crypto.decrypt(modify(one)) must beNone
    }
  }

  "http" should {
    "properly encode http forms" in {
      models.http.formEncode(
        "p_faccde" -> Seq(""),
        "p_depabb" -> Seq(""),
        "p_subcode" -> Seq("code"),
        "p_cal_subject_id" -> Seq("id"),
        "p_year" -> Seq("year"),
        "p_cal_type" -> Seq("U"),
        "p_cal_types" -> Seq("UP"),
        "p_breadcrumb_type" -> Seq("")
      ) must beEqualTo("p_faccde=&p_depabb=&p_subcode=code&p_cal_subject_id=id&p_year=year&p_cal_type=U&p_cal_types=UP&p_breadcrumb_type=")
    }
    "properly decode http forms" in {
      models.http.formDecode("a=1&a=2&a=%26%3D&b=15&c=").toVector must containTheSameElementsAs(Vector(
        "a" -> Seq("1", "2", "&="),
        "b" -> Seq("15"),
        "c" -> Seq("")
      ))
    }
  }

  "Extractors.kvTuplesToMap" should {
    "work" in {
      helpers.Extractors.kvTuplesToMap(
        Seq(("a", 1), ("b", 2), ("b", 3))
      ) must beEqualTo(Map(
        "a" -> Seq(1),
        "b" -> Seq(2, 3)
      ))
    }
  }
}