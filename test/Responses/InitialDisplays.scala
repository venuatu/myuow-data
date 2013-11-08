package Responses

object InitialDisplays {
	    // GET sols_logon.initial_displays?p_student_number=1234567&p_session_id=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_display_number=0&p_cs=29310883241874709323
	val hasMail = new Response(200, """
<HTML>
<HEAD>
<TITLE>SOLSMail History</TITLE>
</HEAD>
<body onLoad="setupDescriptions()"  id="maincontent">
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
<DIV id=maincontent >
<TABLE  width="99%">
	<TR>
		<td nowrap><font class="f_page_title">SOLSMail History<span></span></font></td>
	</TR>
	<TR>
		<TD ALIGN="left" bgcolor=""><font class="f">Mr First <B>LAST</B>&nbsp&nbsp(1234567)</font></TD>
	</TR>
</TABLE>
<TABLE  width=99%>
<TR>
<td>
<center><font SIZE=+1 color=red>You have 2 new message(s) including this one.</font></center><p>
	<TABLE  0 WIDTH="90%" align=center cellspacing=0 class="t">
	<TR  class=r>
		<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN=""  bgcolor=""><FONT color=#000000></FONT><font class="f"><B>Category: SOLSMail</B>
		</TD>
	<TR  class=r>
</TABLE>
<TABLE  1 WIDTH="90%" COLS=3 align=center cellspacing=0 class="t">
	<TR  class=r>
		<TH WIDTH="10%" class=h><font class="f">Date / Time</font></TH>
		<TH WIDTH="25%" class=h><font class="f">User Group</font></TH>
		<TH WIDTH="60%" align=left class=h><font class="f">Message</font></TH>
	</TR>
	<TR ALIGN="CENTER"  class=r>
		<TD nowrap class=d><font class="f">02-10-2013 11:36:51 AM</font></TD>
		<TD  class=d><font class="f">Administration staff</font></TD>
		<TD ALIGN="left"  class=d><font class="f"><b>TITLE: </b>Some title<br><b>MESSAGE: <br><br></b>This is a message that may have <a href="http://example.com/link" target="_blank">links</a><BR><BR>With each line separated by: <BR><BR>If you have a problem contact the IT <BR><BR>Service Desk:<BR><ul><BR><li>Phone: (02) 4239 2000</li><BR><li>Email: student-accounts@uow.edu.au</li><BR><li>International Campuses:  students should contact their local IT support</li><BR></ul><BR><BR>Regards,<BR><BR>IT Account Manager<BR>Information Technology Services<BR>University of Wollongong</font></TD>
	</TR>
</TABLE>
<BR>
<HR WIDTH="90%" >
<CENTER>
<FORM ACTION="student_history.update_urgent" METHOD="POST">
	<INPUT TYPE="hidden" NAME="p_timestamp" VALUE="20131002113651292770">
	<INPUT TYPE="hidden" NAME="p_student_number" VALUE="1234567">
	<INPUT TYPE="hidden" NAME="p_session_id" VALUE="GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG">
	<INPUT TYPE="submit" NAME="p_submit" VALUE="I Have Read the Message"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
</FORM>
</CENTER>
</td></tr></table></div>
<div id="footer">
 <div class="footer"> <center>
 <br>&copy; 2009 University of Wollongong<BR>Comments and questions should be directed to <a href="http://www.uow.edu.au/student/enquiries/index.html"onclick="window.open(this.href, 'popupwindow', 
	 'width=800,height=700,scrollbars,resizable');return false;">Student Central</a><br><br></ceter>
</div>
</div>
</BODY>
</HTML>""")

}