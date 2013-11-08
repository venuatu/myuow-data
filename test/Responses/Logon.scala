package Responses

object Logon {
  // POST sols_logon.validate_sols_logon
  val session = "GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG"
  val number = 1234567
  val success = new Response(200, """
<HTML>
<HEAD>
<TITLE>My Sols</TITLE>
<FRAMESET ROWS="128,*" frameborder="NO" border="0" framespacing="0">
<FRAME SRC="/sid/sols_top_frame.display_sols_top?p_system=STUDENT&p_menu_name=MAIN_MENU&p_student_number=1234567&p_session_id=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_tab=2&p_logon=Y" NAME="topFrame" MARGINWIDTH="0" MARGINHEIGHT="0" border="0" scrolling="NO" noresize  >
<FRAME SRC="sols_logon.initial_displays?p_student_number=1234567&p_session_id=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_display_number=0&p_cs=29310883241874709323" NAME="bottomFrame" MARGINWIDTH="0" MARGINHEIGHT="0" border="0" scrolling=Yes >
</FRAMESET>
</div>
</BODY>
</HTML>""")
  val invalidCredentials = new Response(200, """
<HTML>
<HEAD>
<TITLE>My Sols</TITLE>
<FRAMESET ROWS="128,*" frameborder="NO" border="0" framespacing="0">
<FRAME SRC="/sid/sols_top_frame.display_logon_top" NAME="topFrame" MARGINWIDTH="0" MARGINHEIGHT="0" border="0" scrolling="NO" noresize  >
<FRAME SRC="/sid/sols_logon.display_logon_bottom?p_message=Invalid Username and Password&p_cs=3834563841380760407" NAME="bottomFrame" MARGINWIDTH="0" MARGINHEIGHT="0" border="0" scrolling=Yes >
</FRAMESET>
</div>
</BODY>
</HTML>""")
  val rateLimit = new Response(200, """
<HTML>
<HEAD>
<TITLE>My Sols</TITLE>
<FRAMESET ROWS="128,*" frameborder="NO" border="0" framespacing="0">
<FRAME SRC="/sid/sols_top_frame.display_logon_top" NAME="topFrame" MARGINWIDTH="0" MARGINHEIGHT="0" border="0" scrolling="NO" noresize  >
<FRAME SRC="/sid/sols_logon.display_logon_bottom?p_message=SOLS has been locked until 11:54am 29-OCT-2013&p_cs=3834563841380760407" NAME="bottomFrame" MARGINWIDTH="0" MARGINHEIGHT="0" border="0" scrolling=Yes >
</FRAMESET>
</div>
</BODY>
</HTML>""")

}