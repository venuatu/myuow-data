package Responses

object Moodle {
  val uri = "https://moodle.uowplatform.edu.au/login/index.php?auth=sso&" +
    "ticket=R1cpOqRgruw21WGNJBxjD1qpH&hash=bfd1ee069976df940cdd4c197b8cc754&time=13844942084"
 
  val good = new TestResponse(200, """
<HTML><HEAD>
<META HTTP-EQUIV="Refresh" CONTENT="0;URL=https://moodle.uowplatform.edu.au/login/index.php?auth=sso&ticket=R1cpOqRgruw21WGNJBxjD1qpH&hash=bfd1ee069976df940cdd4c197b8cc754&time=13844942084">
</HEAD><BODY></BODY></HTML>
""")
}