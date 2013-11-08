import javax.crypto._
import javax.crypto.spec._
import com.ning.http.util.Base64

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
  
  def encrypt(str: String): String = {
    val ciph = Cipher.getInstance(cipher)
    ciph.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"))
    val iv = ciph.getIV;
    encode(iv ++ ciph.doFinal(stob(str)))
  }
  
  def decrypt(str: String): String = {
    val data = decode(str)
    val ciph = Cipher.getInstance(cipher)
    ciph.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"), new IvParameterSpec(data.slice(0, 16)))
    btos(ciph.doFinal(data.slice(16, data.length)))
  }
}