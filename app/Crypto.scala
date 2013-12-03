import javax.crypto._
import javax.crypto.spec._
import com.ning.http.util.Base64
import play.api.libs.json.JsValue
import java.util.zip.CRC32
import play.api.libs.json.Json
import java.nio.ByteBuffer

/**
 * Some crypto functions that give ciphertext in a url friendly way
 */
object Crypto {
  private val replaceChars = Array(Array('+', '-'), Array('/', '_'), Array('=', '.'))
  
  def encode(str: String): String = {
    encode(str.toCharArray.map{_.toByte})
  }
  def encode(bytes: Array[Byte]): String = {
    var ret = Base64.encode(bytes)
    for (chars <- replaceChars)
      ret = ret.replace(chars(0), chars(1))
    ret
  }
  def decode(Str: String): Array[Byte] = {
    var str = Str
    for (chars <- replaceChars)
      str = str.replace(chars(1), chars(0))
    Base64.decode(str)
  }
  def stob(str: String): Array[Byte] = {
    str.toCharArray.map{a => a.toByte}
  }
  def btos(bytes: Array[Byte]): String = {
    bytes.map{_.toChar}.mkString
  }

  private val cipher = "AES/CTR/PKCS5PADDING"
  private val key = decode("LpjOiqu0UFd9uAZVHyodWg..")
  private val longLen = 8
  
  def encrypt(str: JsValue): String = {
    val ciph = Cipher.getInstance(cipher)
    val crc = new CRC32
    val bytes = stob(str.toString)
    val bb = ByteBuffer.allocate(longLen)
    crc.update(bytes)
    bb.putLong(crc.getValue)
    ciph.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"))
    val iv = ciph.getIV;
    encode(iv ++ ciph.doFinal(bb.array ++ bytes))
  }
  
  def decrypt(str: String): Option[JsValue] = {
    val data = decode(str)
    val ciphertext = data.slice(16, data.length)
    val crc = new CRC32
    val ciph = Cipher.getInstance(cipher)
    ciph.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), 
      new IvParameterSpec(data.slice(0, 16)))
    try {
      val decrypted = ciph.doFinal(ciphertext)
      val plain = decrypted.slice(longLen, decrypted.length)
      crc.update(plain)
      //println(btos(decrypted) + "\n" + btos(plain) + "\n" +
      //    (crc.getValue + ":" + ByteBuffer.wrap(decrypted.slice(0, longLen)).getLong))
      if (crc.getValue == ByteBuffer.wrap(decrypted.slice(0, longLen)).getLong)
        Some(Json.parse(btos(plain)))
      else
        None
    } catch {
      case _: Throwable => None
    }
  }
}