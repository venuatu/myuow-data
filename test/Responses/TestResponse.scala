package Responses

object TestResponse {
  def apply(status: Int, body: String) = new TestResponse(status, body)
}

class TestResponse(_status: Int, _body: String) extends play.api.libs.ws.ning.NingWSResponse(null) {
  override def status: Int = _status
  override lazy val body: String = _body
}