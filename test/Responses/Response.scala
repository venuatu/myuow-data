package Responses

class Response(Status: Int, Body: String) extends play.api.libs.ws.Response(null) {
  override def status: Int = Status
  override lazy val body: String = Body
}