package Responses

object CheckAuth {

  val parameterMismatch = new TestResponse(200, """
<HTML>
<HEAD>
<TITLE>Parameter Mismatch</TITLE>
</HEAD>
<body onLoad="setupDescriptions()"  id="maincontent">
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
<TABLE  width="99%" class="t">
<TR  class="r_no_bgcolor" >
<TD NOWRAP  class="d_no_bgcolor_nb" ><font class="f_page_title">Parameter Mismatch<span></span></font></TD>
</TR>
<TR  class="r_no_bgcolor" >
</TR>
</TABLE>
<HR>
<TABLE  width=100% class="t">
<TR  class="r_no_bgcolor" >
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<div>
<center><H2>The call to this function is invalid. Please try again.</H2></center>
    <div id="footer"> <center><br>&copy; 2009 University of Wollongong<BR>Comments and questions should be directed to <a href="http://www.uow.edu.au/student/enquiries/index.html"onclick="window.open(this.href, 'popupwindow',
                                             'width=800,height=700,scrollbars,resizable');return false;">Student Central</a><br><br></center></div>
</font></font>
</TD>
</TR>
</TABLE>
</div>
</BODY>
</HTML>""")
  val timedOut = new TestResponse(200, """
<HTML>
<HEAD>
<TITLE>Session Timeout</TITLE>
</HEAD>
<body onLoad="setupDescriptions()"  id="maincontent">
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
<TABLE  width="99%" class="t">
<TR  class="r_no_bgcolor" >
<TD NOWRAP  class="d_no_bgcolor_nb" ><font class="f_page_title">Session Timeout<span></span></font></TD>
</TR>
<TR  class="r_no_bgcolor" >
</TR>
</TABLE>
<HR>
<TABLE  width=100% class="t">
<TR  class="r_no_bgcolor" >
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<div>
<center><H2>Your session has timed out. You will need to logon again.</H2>
<FORM ACTION="sols_logon.display_logon_control" METHOD="POST" TARGET="_top">
<INPUT TYPE="submit" VALUE="Logon"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
</FORM>
</CENTER>
    <div id="footer"> <center><br>&copy; 2009 University of Wollongong<BR>Comments and questions should be directed to <a href="http://www.uow.edu.au/student/enquiries/index.html"onclick="window.open(this.href, 'popupwindow',
                                             'width=800,height=700,scrollbars,resizable');return false;">Student Central</a><br><br></center></div>
</font></font>
</TD>
</TR>
</TABLE>
</div>
</BODY>
</HTML>""")
  
  val good = new TestResponse(200, """

<HTML>
<HEAD>
<meta http-equiv="Page-Enter" content="blendTrans(Duration=0)">
    <meta http-equiv="Page-Exit" content="blendTrans(Duration=0)">
<TITLE>eLearning</TITLE>
</HEAD>
<body onLoad="setupDescriptions()"  id="maincontent">
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
<TABLE  width="99%" class="t">
<TR  class="r_no_bgcolor" >
<TD NOWRAP  class="d_no_bgcolor_nb" ><font class="f_page_title">eLearning<span></span></font></TD>
</TR>
<TR  class="r_no_bgcolor" >
<TD ALIGN="left"  class="d_no_bgcolor_nb" >Mr First <B>LAST</B>&nbsp&nbsp(1234567)</TD>
</TR>
</TABLE>
<HR>
<TABLE  width=100% class="t">
<TR  class="r_no_bgcolor" >
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<div>
<BR>
<TABLE  ALIGN="CENTER" width=85% class="t">
<TR  class="r_no_bgcolor" >
<TD ALIGN="left"  class="d_no_bgcolor_nb" ><b>Click the Site Name to access your eLearning site.</b></TD>
</TR>
</TABLE>
<BR>
<TABLE  ALIGN="center" width=85% class="t">
<TR  class="r_no_bgcolor" >
<TD COLSPAN="3"  class="d_no_bgcolor_nb" ><b>Current eLearning (Blackboard Vista) Sites</b></TD>
<TD ALIGN="right" DP="" ROWSPAN=""  COLSPAN="3"  class="d_no_bgcolor_nb" >
<a href="http://www.uow.edu.au/student/elearning/vista/" target="_blank">(Blackboard Vista Help)<a>
</font></font>
</TD>
</TR>
<TR  class="r_no_bgcolor" >
<TD ALIGN="left" COLSPAN="6"  class="d_no_bgcolor_nb" > <font class="f_minus_1">If your subject has a Blackboard Vista site, you will see it below. Please click on the site link to access Blackboard Vista for this subject.</font></TD>
</TR>
<TR  class="r" >
<TH ALIGN="left"  class="h" width=14%>Session</TH>
<TH ALIGN="center"  class="h" width=10%>Subject</TH>
<TH ALIGN="left"  class="h" width=20%>Subject Name</TH>
<TH ALIGN="left"  class="h" >Site Name</TH>
<TH ALIGN="center"  class="h" width=12%>Available From</TH>
<TH ALIGN="center"  class="h" width=12%>Available To</TH>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d"  style="word-wrap: break-word">Annual</TD>
<TD ALIGN="center"  class="d"  style="word-wrap: break-word">CSCI321</TD>
<TD ALIGN="LEFT"  class="d"  style="word-wrap: break-word">Project</TD>
<TD ALIGN="LEFT"  class="d"  style="word-wrap: break-word"><A target="_blank" href="https://vista.uow.edu.au/webct/public/autosignon?wuui=sfgm358&time%20stamp=1384492837&URL=https://vista.uow.edu.au/webct/viewMyWebCT.dowebct&mac2=CC43C20E693D85F11D852AAF5D286181" > (A113) Project</a></TD>
<TD ALIGN="CENTER"  class="d" nowrap>05-12-2012</TD>
<TD ALIGN="CENTER"  class="d" nowrap>22-11-2013</TD>
</TR>
</TABLE>
<BR>
<BR>
<TABLE  ALIGN="center" width=85% class="t">
<TR  class="r_no_bgcolor" >
<TD COLSPAN="6"  class="d_no_bgcolor_nb" ><b>Current Moodle Sites</b></TD>
</TR>
<TR  class="r_no_bgcolor" >
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN="6"  class="d_no_bgcolor_nb" >
 <font class="f_minus_1">If your subject has a Moodle site, you will see it below.  Please click on the site link to access Moodle for this subject.  (Note: If no subject links are available, click here to access the <a href="https://moodle.uowplatform.edu.au/" target="_blank">Moodle Login</a> page.)</font>
</font></font>
</TD>
</TR>
<TR  class="r" >
<TH ALIGN="left"  class="h" width=14%>Session</TH>
<TH ALIGN="center"  class="h" width=10%>Subject</TH>
<TH ALIGN="left"  class="h" width=20%>Subject Name</TH>
<TH ALIGN="left"  class="h" >Site Name</TH>
<TH ALIGN="center"  class="h" width=12%>Available From</TH>
<TH ALIGN="center"  class="h" width=12%>Available To</TH>
</TR>
<TR  class="r" >
<TR  class="r" >
<TD ALIGN="left"  class="d"  style="word-wrap: break-word">Spring</TD>
<TD ALIGN="center"  class="d"  style="word-wrap: break-word">CSCI322</TD>
<TD ALIGN="left"  class="d"  style="word-wrap: break-word">Systems Administration</TD>
<TD  class="d"  style="word-wrap: break-word"><a onClick="perform_SSO('1234567','GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG','28192482061335740121');" href="javascript:void(0)">(S213) Systems Administration</a></TD>
<TD ALIGN="CENTER"  class="d" nowrap>29-07-2013</TD>
<TD ALIGN="CENTER"  class="d" nowrap>03-12-2013</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d"  style="word-wrap: break-word">Spring</TD>
<TD ALIGN="center"  class="d"  style="word-wrap: break-word">CSCI368</TD>
<TD ALIGN="left"  class="d"  style="word-wrap: break-word">Network Security</TD>
<TD  class="d"  style="word-wrap: break-word"><a onClick="perform_SSO('1234567','GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG','28192482061335740121');" href="javascript:void(0)">(S213) Network Security</a></TD>
<TD ALIGN="CENTER"  class="d" nowrap>29-07-2013</TD>
<TD ALIGN="CENTER"  class="d" nowrap>03-12-2013</TD>
</TR>
</TABLE>
<BR>
<BR>
<CENTER>
<FORM ACTION="go_to_main.to_main" METHOD="POST">
<INPUT TYPE="hidden" NAME="p_process" VALUE="">
<INPUT TYPE="hidden" NAME="p_step" VALUE="1">
<INPUT TYPE="hidden" NAME="p_stdnbr" VALUE="1234567">
<INPUT TYPE="hidden" NAME="p_session_id" VALUE="GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG">
<INPUT TYPE="submit" NAME="p_usr_choice" VALUE="SOLS Home"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
</FORM>
</CENTER>
    <div id="footer"> <center><br>&copy; 2009 University of Wollongong<BR>Comments and questions should be directed to <a href="http://www.uow.edu.au/student/enquiries/index.html"onclick="window.open(this.href, 'popupwindow',
                                             'width=800,height=700,scrollbars,resizable');return false;">Student Central</a><br><br></center></div>
</font></font>
</TD>
</TR>
</TABLE>
</div>
</BODY>
</HTML>""")
}