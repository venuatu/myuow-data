class MiscSpec extends UnitSpec {
  "crypto" should {
    val id = """{ "id": 12, "session": "kadjakshdkjasjbdkjasbkb" }"""
    "have equal input and output" in {
      Crypto.decrypt(Crypto.encrypt(id)) must equalTo(id)
    }

    "use an iv and not use the same iv" in {
      val one = Crypto.encrypt(id)
      val two = Crypto.encrypt(id)
      one must not equalTo(two)
      Crypto.decrypt(one) must equalTo(Crypto.decrypt(two))
    }
  }
}