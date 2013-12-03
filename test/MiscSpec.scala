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
      val encoded = Crypto.encode(Crypto.stob(id.toString)).length
      val deflate = new Deflater(Deflater.BEST_COMPRESSION)
      deflate.setInput(Crypto.stob(id.toString))
      deflate.finish
      val out = new Array[Byte](200)
      val len = deflate.deflate(out)
      val enc = Crypto.encode(out.slice(0, len))
      println(s"${len} ${id.toString.length} ${1.0 * len/ id.toString.length}")
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
}