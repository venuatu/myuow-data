package Responses

object Subject {
  val searchVarray = "220997"
  val search = new Response(200, """
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><meta http-equiv="page-Enter" content="revealtrans(duration=0.0)"/><meta http-equiv="Page-Exit" content="revealtrans(duration=0.0)"/>
<title>Subject Timetable - Search Result</title>
</HEAD>
<BODY>
<div id="header">
<div id="content-header">
<div id="uowlogo">
<a href ="http://www.uow.edu.au/"><img id="uowlogo" alt="University of Wollongong" src="/images/img_logo_uow.png"/></a>
</div>
<div id="search">
                        <form style="float: right;" method="get" action="http://search.uow.edu.au/search">
                            <div class="left">
                                <input type="text" class="search_input" 
                                onfocus="if (this.value == this.defaultValue) { this.value = ''; }" onblur="if (this.value == '') { this.value = this.defaultValue; }"  
                                value="Search..." name="q" id="searchbox"/>
                            </div>
                            <div class="left">
                                <input type="image" style="border: medium none ;" title="Search" src="/images/uow/img_button_search_go.gif" name="search_button"/>
                            </div>
                            <input type="hidden" value="default_collection" name="site">
              <input type="hidden" value="default_frontend" name="proxystylesheet">
              <input type="hidden" value="xml_no_dtd" name="output">
              <input type="hidden" value="default_frontend" name="client">
                        </form>     
                </div>
<div id="top-links">
                <!-- SS_BEGIN_SNIPPET(fragment8,top_links)-->
                            <ul>
                                <li><a href="http://www.uow.edu.au/sitemap/index.html">Site Map</a></li>
                                <li><a href="http://www.uow.edu.au/about/maps/index.html">Campus Map</a></li>
                                <li><a href="http://www.uow.edu.au/directory/atoz/index.html">A-Z Index</a></li>
                                <li><a href="https://intranet.uow.edu.au/"><strong>Staff Intranet</strong></a></li>
                                <li><a href="http://www.uow.edu.au/about/contacts/index.html"><strong>Contacts</strong></a></li>
                            </ul>
                    <!-- SS_END_SNIPPET(fragment8,top_links)-->
                </div>
<div id="section-title">
<img src="/images/uow/img_header_text.png"/>
</div>
<div id="breadcrumb">
<a href="http://www.uow.edu.au/">Home</a> &gt; <a href="http://www.uow.edu.au/student/">Current Students</a> &gt; <a href="http://www.uow.edu.au/student/timetables/index.html">Subject Timetable</a> &gt; Subject Timetable Details
</div></div></div>
<div id="main"><div id="content-bg"><div id="maincontent">
<TABLE   class="t">
<TR  class="r" >
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" valign="top" width="30%">
<H3>
2013, Wollongong
<BR>
</H3>
</font></font>
</TD>
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" valign="top" width="40%">
<H3><b>Please refer back to Timetables regularly as there can be changes during the first 2 weeks of session.</b></H3>
</td>
<TD ALIGN="right" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" valign="top" width="30%">
Last Publish Date: 15 Nov, 2013 04:41:16pm
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<CENTER>
<FORM ACTION="Timetable_All.call_main" METHOD="POST">
<INPUT TYPE="hidden" NAME="p_campus_id" VALUE="1">
<INPUT TYPE="hidden" NAME="p_type" VALUE="a">
<INPUT TYPE="submit" VALUE="Back to Faculty List"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';"  id="hidePrint" >
</FORM>
<BR>
<FORM ACTION="Timetable_All.search_result_timetable" METHOD="POST">
<INPUT TYPE="hidden" NAME="p_year" VALUE="2013">
<INPUT TYPE="hidden" NAME="p_campus_id" VALUE="1">
<INPUT TYPE="hidden" NAME="p_draft" VALUE="">
<INPUT TYPE="hidden" NAME="p_publish_date" VALUE="15 Nov, 2013 04:41:16pm">
<INPUT TYPE="hidden" NAME="p_type" VALUE="a">
<INPUT TYPE="hidden" NAME="p_sub_instid_varray" VALUE="-1">
<INPUT TYPE="submit" VALUE="View the Timetable Information for the selected subjects"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';"  id="hidePrint" >
<BR>
<TABLE  WIDTH="90%" class="t">
<TR  class="r" >
<TD ALIGN="LEFT"  class="d_no_bgcolor_nb" >Tick to Select All</TD>
</TR>
<TR  class="r" >
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<TABLE   class="t_b">
<TR  class="r" >
<TH  class="h" Width=3%><INPUT TYPE="checkbox" NAME="p_sub_instid_all" VALUE="on" onClick =''></TH>
<TH NOWRAP  class="h" Width=10%>Subject Code</TH>
<TH ALIGN="left"  class="h" Width=25%>Subject Name</TH>
<TH ALIGN="left"  class="h" Width=10%>Session</TH>
<TH  class="h" Width=5% align="center">CP</TH>
<TH  class="h" Width=25% align="left">Faculty / Unit</TH>
</TR>
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d" >
<INPUT TYPE="checkbox" NAME="p_sub_instid_varray" VALUE="220997">
</font></font>
</TD>
<TD ALIGN="center"  class="d" >ENGG154</TD>
<TD  class="d" >Engineering Design and Innovation</TD>
<TD ALIGN="left"  class="d" >Spring</TD>
<TD  class="d" align="center">6</TD>
<TD  class="d" >Faculty of Engineering and Information Sciences<br>Engineering</TD>
</TR>
</TABLE>
</font></font>
</TD>
</TR>
</TABLE>
<BR>
</FORM>
<HR width=80%>
<BR>
<TABLE  width="65%" class="t_b">
<TR  class="r" >
<TH ALIGN="Left" COLSPAN="2"  class="h" >Previous Search Criteria</TH>
</TR>
<TR  class="r" >
<TD ALIGN="Left"  class="d" Width = 20%>Subject Code</TD>
<TD ALIGN="Left"  class="d" >ENGG154</TD>
</TR>
</TABLE>
<BR>
<FORM ACTION="Timetable_All.Process_Search" METHOD="POST">
<div class="noPrint">
<TABLE  width="65%" class="t_b">
<TR  class="r" >
<TH ALIGN="left" NOWRAP  class="h" >Search Criteria</TH>
<TH ALIGN="right" COLSPAN="2"  class="h" >[<a href="javascript:void(0);" onclick="window.open('timetable_all.display_information_page',
        'Help','location=no,status=yes,scrollbars=yes,resizable=yes, width=960px, height=800px, left=0, top=0')"><font color=white>Click here for Search Tips</font></a>]</TH>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Enter all OR part of the subject code eg ACCY, POL 1, BM. <br>If the prefix is 3 Characters, enter a space <br>before the remainder of the subject code, eg POL 11')"
                                                                                        onMouseOut="toHideLayer()">Subject Code</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<INPUT TYPE="text" NAME="p_subject_code" SIZE="40" MAXLENGTH="10">
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Enter all OR part of the subject name eg Accounting or Acc')"
                                                                                        onMouseOut="toHideLayer()">Subject Name</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<INPUT TYPE="text" NAME="p_subject_name" SIZE="40" MAXLENGTH="40">
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Hold down the Ctrl key and click to select multiple levels')"
                                                                                        onMouseOut="toHideLayer()">Level</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<SELECT NAME="p_subject_level" SIZE="4"  Multiple>
<OPTION SELECTED value="-1">All Subject Levels&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<OPTION value=0>000
<OPTION value=1>100
<OPTION value=2>200
<OPTION value=3>300
<OPTION value=4>400
<OPTION value=6>600
<OPTION value=8>800
<OPTION value=9>900
<OPTION value=H>Honours
<OPTION value=T>Thesis
</SELECT>
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Hold down the Ctrl key and click to select multiple sessions <br> Only sessions that appear on the timetable will appear for selection')"
                                                                                        onMouseOut="toHideLayer()">Session</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<SELECT NAME="p_session" SIZE="4" Multiple>
<OPTION SELECTED value="-1">All Sessions&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<OPTION value=6414>GDE Annual
<OPTION value=6199>SHS July
<OPTION value=6120>Trimester 3
<OPTION value=6202>SHS Sept
<OPTION value=6416>GSM Ph1 S2
<OPTION value=6419>GSM Ph2 S2
<OPTION value=4799>Spring
<OPTION value=6300>Annual
<OPTION value=7018>SHS May
<OPTION value=5805>GDE Primary Autumn
<OPTION value=6415>GDE Spring
<OPTION value=5838>GSM Ph1 S1
<OPTION value=6218>Spring2013/Autumn2014
<OPTION value=6461>Winter
<OPTION value=6420>GSM Ph3 S1
<OPTION value=6198>SHS Feb
<OPTION value=6418>GSM Ph2 S1
<OPTION value=6460>Spring2013/Summer2013
<OPTION value=6118>Trimester 1
<OPTION value=5807>GDE Autumn
<OPTION value=6417>GSM Ph1 S3
<OPTION value=4798>Autumn
<OPTION value=6119>Trimester 2
<OPTION value=6201>SHS Oct
</SELECT>
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Hold down the Ctrl key and click to select multiple Units')"
                                                                                        onMouseOut="toHideLayer()">Unit</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<SELECT NAME="p_unit_abb" SIZE="4" Multiple>
<OPTION SELECTED value="-1">All Units 
<OPTION value=ACAD>Academic Program
<OPTION value=ADMN>Administration
<OPTION value=ARTS>Arts
<OPTION value=BIOL>Biological Sciences
<OPTION value=CHEM>Chemistry
<OPTION value=FACS>Commerce Subjects
<OPTION value=AA>Creative Arts
<OPTION value=ED>Education
<OPTION value=ENGG>Engineering
<OPTION value=ELP>English Language Program
<OPTION value=GSM>Graduate School of Medicine
<OPTION value=IND>Indigenous Studies
<OPTION value=CLC>LSC English Language
<OPTION value=CLF>LSC Foundation
<OPTION value=ALC>Language Centre
<OPTION value=LAW>Law
<OPTION value=SAAF>School of Accounting and Finance
<OPTION value=CME>School of Civil, Mining and Environmental Engineering
<OPTION value=CSSE>School of Computer Science and Software Engineering
<OPTION value=SEES>School of Earth and Environmental Sciences
<OPTION value=SECO>School of Economics
<OPTION value=ELEC>School of Electrical, Computer and Telecommunications Engineering
<OPTION value=SEPH>School of Engineering Physics
<OPTION value=SELP>School of English Literatures and Philosophy
<OPTION value=SHS>School of Health Sciences
<OPTION value=SHP>School of History and Politics
<OPTION value=ISAT>School of Information Systems and Technology
<OPTION value=SMM>School of Management and Marketing
<OPTION value=MAAS>School of Mathematics and Applied Statistics
<OPTION value=MMM>School of Mechanical, Materials and Mechatronic Engineering
<OPTION value=NMIH>School of Nursing, Midwifery and Indigenous Health
<OPTION value=SPSY>School of Psychology
<OPTION value=SSMC>School of Social Sciences, Media and Communication
<OPTION value=SCIE>Science Subjects
<OPTION value=TBS>Sydney Business School
</SELECT>
</font></font>
</TD>
</TR>
<INPUT TYPE="hidden" NAME="p_year" VALUE="2013">
<INPUT TYPE="hidden" NAME="p_campus_id" VALUE="1">
<INPUT TYPE="hidden" NAME="p_draft" VALUE="">
<INPUT TYPE="hidden" NAME="p_publish_date" VALUE="15 Nov, 2013 04:41:16pm">
<INPUT TYPE="hidden" NAME="p_type" VALUE="a">
</TABLE>
<BR>
<TABLE  width="65%" class="t">
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN="3"  class="d_no_bgcolor_nb" >
<INPUT TYPE="submit" VALUE="Search"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
&nbsp;&nbsp;
<INPUT TYPE="reset" VALUE="Reset&nbsp;"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
</font></font>
</TD>
</TR>
</TABLE>
</div>
</FORM>
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
</CENTER>
<BR>
<BR>
</div></div></div>
<div id="footer">
        <div class="footer">
            <div class="left">
                <ul>
                    <li><a href="http://www.uow.edu.au/future/">Future Students</a></li>

                    <li><a href="http://www.uow.edu.au/student/">Current Students</a></li>

                    <li><a href="http://www.uow.edu.au/research/">Research</a></li>

                    <li><a href="http://www.uow.edu.au/alumni/">Alumni</a></li>

                    <li><a href="http://www.uow.edu.au/about/community/">Community & Partners</a></li>
                </ul>
            </div>

            <div class="middle">
                <ul>
                    <li><a href="http://employment.uow.edu.au/">Employment at UOW</a></li>

                    <li><a href="http://www.uow.edu.au/services/index.html">Services & Facilities</a></li>

                    <li><a href="http://www.uow.edu.au/about/transport/">Getting to UOW</a></li>

                    <li><a href="http://www.uow.edu.au/about/maps/index.html">Maps</a></li>

                    <li><a href="http://www.uow.edu.au/about/security/">Security & Safety</a></li>
                </ul>
            </div>

            <div class="right">
                <ul>
                    <li><a href="http://media.uow.edu.au/">News & Media</a></li>

                    <li><a href="http://www.library.uow.edu.au/index.html">Library</a></li>

                    <li><a href="https://smp.uow.edu.au/app/servlet/Student">Apply to Study at UOW</a></li>

                    <li><a href="http://coursefinder.uow.edu.au/">Coursefinder</a></li>

                    <li><a href="http://www.uow.edu.au/about/accommodation/">Living@UOW</a></li>
                </ul>
            </div>
        </div>

        <div class="footer">
            <div class="left">
                <p>University of Wollongong<br/>
                Wollongong NSW 2522 Australia<br/>
                UOW Switchboard: +61 2 4221 3555</p>
            </div>
<div class="middle">
<p>Comments and questions should be<br/>directed to <a href="mailto:room_bookings@uow.edu.au">Room Bookings</a></p>
</div>
<div class="right">
                <p>CRICOS Provider No: 00102E<br/>
                <a href="http://www.uow.edu.au/about/privacy/">Privacy</a>, <a href="http://www.uow.edu.au/about/disclaimer/">Disclaimer & Copyright Info</a><br/>
     <!--15434-->
                Feedback: <a href="http://www.uow.edu.au/student/feedback/UOW082677.html">Feedback @ UOW</a>
     <!--15434
        Feedback: <a href="http://www.uow.edu.au/student/feedback/UOW082677.html">webmasters@uow.edu.au</a>
     -->
     </p>
            </div>
</div></div>
</BODY>
</HTML>""")
  
  val info = new Response(200, """
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><meta http-equiv="page-Enter" content="revealtrans(duration=0.0)"/><meta http-equiv="Page-Exit" content="revealtrans(duration=0.0)"/>
<title>Subject Timetable - Search Result - Timetable</title>
</HEAD>
<BODY>
<div id="header">
<div id="content-header">
<div id="uowlogo">
<a href ="http://www.uow.edu.au/"><img id="uowlogo" alt="University of Wollongong" src="/images/img_logo_uow.png"/></a>
</div>
<div id="search">
            <form style="float: right;" method="get" action="http://search.uow.edu.au/search">
              <div class="left">
                <input type="text" class="search_input" 
                onfocus="if (this.value == this.defaultValue) { this.value = ''; }" onblur="if (this.value == '') { this.value = this.defaultValue; }"  
                value="Search..." name="q" id="searchbox"/>
              </div>
              <div class="left">
                <input type="image" style="border: medium none ;" title="Search" src="/images/uow/img_button_search_go.gif" name="search_button"/>
              </div>
              <input type="hidden" value="default_collection" name="site">
              <input type="hidden" value="default_frontend" name="proxystylesheet">
              <input type="hidden" value="xml_no_dtd" name="output">
              <input type="hidden" value="default_frontend" name="client">
            </form>   
        </div>
<div id="top-links">
        <!-- SS_BEGIN_SNIPPET(fragment8,top_links)-->
              <ul>
                <li><a href="http://www.uow.edu.au/sitemap/index.html">Site Map</a></li>
                <li><a href="http://www.uow.edu.au/about/maps/index.html">Campus Map</a></li>
                <li><a href="http://www.uow.edu.au/directory/atoz/index.html">A-Z Index</a></li>
                <li><a href="https://intranet.uow.edu.au/"><strong>Staff Intranet</strong></a></li>
                <li><a href="http://www.uow.edu.au/about/contacts/index.html"><strong>Contacts</strong></a></li>
              </ul>
          <!-- SS_END_SNIPPET(fragment8,top_links)-->
        </div>
<div id="section-title">
<img src="/images/uow/img_header_text.png"/>
</div>
<div id="breadcrumb">
<a href="http://www.uow.edu.au/">Home</a> &gt; <a href="http://www.uow.edu.au/student/">Current Students</a> &gt; <a href="http://www.uow.edu.au/student/timetables/index.html">Subject Timetable</a> &gt; Subject Timetable Details
</div></div></div>
<div id="main"><div id="content-bg"><div id="maincontent">
<TABLE   class="t">
<TR  class="r" >
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" valign="top" width="30%">
<H3>
2013, Wollongong
<BR>
</H3>
</font></font>
</TD>
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" valign="top" width="40%">
<H3><b>Please refer back to Timetables regularly as there can be changes during the first 2 weeks of session.</b></H3>
</td>
<TD ALIGN="right" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" valign="top" width="30%">
Last Publish Date: 15 Nov, 2013 04:41:16pm
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<CENTER>
<BR>
<BR>
<INPUT TYPE="submit" VALUE="Back to Search Result" onclick="javascript:history.back(1);"  class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';"  id="hidePrint" >
<BR>
<BR>
<TABLE   class="t_b">
<TR  class="r" >
<TH NOWRAP  class="h" width="5%">Subject Code</TH>
<TH ALIGN="left"  class="h" width="15%">Subject Name</TH>
<TH ALIGN="center"  class="h" width="3%">Year</TH>
<TH  class="h" width="5%">Session</TH>
<TH ALIGN="left"  class="h" width="12%">Campus / Delivery</TH>
<TH  class="h" width="2%">CP</TH>
<TH ALIGN="left"  class="h" width="13%">Lecturer(s)/Co-ordinator(s)</TH>
<TH ALIGN="left"  class="h" width="14%">Contact Hours</TH>
</TR>
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d" >
<a href="javascript:void(0);" onclick="window.open('CAL.USER_SUBJECTINFO_SCREEN?p_faccde=24&p_subcode=ENGG154&p_depabb=ENGG&p_cal_subject_id=146533&p_year=2013&p_cal_type=U&p_cal_types=UP&p_display=NO','Subject','location=no,status=yes,scrollbars=yes,resizable=yes,width=900, height=800, left=0, top=0')">ENGG154</a>
</font></font>
</TD>
<TD  class="d" >Engineering Design and Innovation</TD>
<TD ALIGN="center"  class="d" >2013</TD>
<TD ALIGN="center"  class="d" >Spring</TD>
<TD  class="d" >Woll/On Campus/Class 1</TD>
<TD ALIGN="center"  class="d" >6</TD>
<TD ALIGN="left"  class="d" ><B>Coordinator</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A/PR Peter Wypych<br><B>Lecturer</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Mr Bruce Fowler<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Dr David Hastie<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Prof Timothy McCarthy<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A/PR Peter Wypych<br></TD>
<TD  class="d" >2L, 3T</TD>
</TR>
<TR  class="r" >
<TD COLSPAN="2"  class="d" ></TD>
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN="6"  class="d" >
<TABLE  WIDTH="100%" class="t_b">
<TR  class="r" >
<TH  class="h" width="5%">&nbsp;</TH>
<TH ALIGN="left"  class="h" width="20%">Activity</TH>
<TH  class="h" width="10%">Day</TH>
<TH  class="h" width="10%">Start</TH>
<TH  class="h" width="10%">Finish</TH>
<TH  class="h" width="17%">Location</TH>
<TH ALIGN="left"  class="h" width="28%">Week</TH>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ></TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Tue</TD>
<TD ALIGN="Center"  class="d" >08:30</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >4-122</TD>
<TD  class="d" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Computer Lab</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Tue</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >08:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >6-227</TD>
<TD  class="d_hl_bgcolor" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Tue</TD>
<TD ALIGN="Center"  class="d" >14:30</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >4-122</TD>
<TD  class="d" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Computer Lab</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Tue</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >14:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >16:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >6-227</TD>
<TD  class="d_hl_bgcolor" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Wed</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >12:30</TD>
<TD ALIGN="Center"  class="d" >4-122</TD>
<TD  class="d" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Computer Lab</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Wed</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >12:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >6-227</TD>
<TD  class="d_hl_bgcolor" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Thu</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >12:30</TD>
<TD ALIGN="Center"  class="d" >6-227</TD>
<TD  class="d" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Computer Lab</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Thu</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >12:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >4-122</TD>
<TD  class="d_hl_bgcolor" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Thu</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >12:30</TD>
<TD ALIGN="Center"  class="d" >4-118</TD>
<TD  class="d" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Computer Lab</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >08:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >4-122</TD>
<TD  class="d_hl_bgcolor" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >08:30</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >6-227</TD>
<TD  class="d" >4-13</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">And</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">Lecture A</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">Mon</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">14:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">16:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">40-153</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">1-3,7-13</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ><font class="f_14">And</font></TD>
<TD  class="d" ><font class="f_14">Lecture B</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">Mon</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">14:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">15:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">40-153</font></TD>
<TD  class="d" ><font class="f_14">4-6</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">And</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">Lecture C</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">Mon</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">15:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">16:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">67-104</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">4-6</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ><font class="f_14">Or</font></TD>
<TD  class="d" ><font class="f_14">Lecture C</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">Mon</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">15:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">16:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">20-1</font></TD>
<TD  class="d" ><font class="f_14">4-6</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >And</TD>
<TD  class="d_hl_bgcolor" >Practical</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Tue</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >08:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-G04</TD>
<TD  class="d_hl_bgcolor" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Practical</TD>
<TD ALIGN="Center"  class="d" >Tue</TD>
<TD ALIGN="Center"  class="d" >08:30</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >1-105</TD>
<TD  class="d" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Practical</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Tue</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >12:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-G04</TD>
<TD  class="d_hl_bgcolor" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Practical</TD>
<TD ALIGN="Center"  class="d" >Tue</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >12:30</TD>
<TD ALIGN="Center"  class="d" >1-105</TD>
<TD  class="d" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Practical</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Tue</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >12:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >14:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >4-118</TD>
<TD  class="d_hl_bgcolor" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Practical</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >08:30</TD>
<TD ALIGN="Center"  class="d" >10:30</TD>
<TD ALIGN="Center"  class="d" >1-G04</TD>
<TD  class="d" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Practical</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >08:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >10:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-105</TD>
<TD  class="d_hl_bgcolor" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Practical</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >14:30</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >1-G04</TD>
<TD  class="d" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Practical</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >14:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >16:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-105</TD>
<TD  class="d_hl_bgcolor" >1-3</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >And</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Wed</TD>
<TD ALIGN="Center"  class="d" >14:30</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >19-2100</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Wed</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >14:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >16:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >3-122</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Wed</TD>
<TD ALIGN="Center"  class="d" >14:30</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >8-G25</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Wed</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >14:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >16:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >19-G015</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Wed</TD>
<TD ALIGN="Center"  class="d" >14:30</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >4-G31</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Wed</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >14:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >16:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-105</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Wed</TD>
<TD ALIGN="Center"  class="d" >14:30</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >1-G05</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >11:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >13:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >19-G024</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >11:30</TD>
<TD ALIGN="Center"  class="d" >13:30</TD>
<TD ALIGN="Center"  class="d" >24-101</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >11:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >13:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-105</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >11:30</TD>
<TD ALIGN="Center"  class="d" >13:30</TD>
<TD ALIGN="Center"  class="d" >3-122</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >11:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >13:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-G04</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >Or</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >11:30</TD>
<TD ALIGN="Center"  class="d" >13:30</TD>
<TD ALIGN="Center"  class="d" >19-1038</TD>
<TD  class="d" >AllWeeks</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >11:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >13:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >1-G05</TD>
<TD  class="d_hl_bgcolor" >AllWeeks</TD>
</TR>
</TABLE>
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<INPUT TYPE="submit" VALUE="Back to Search Result" onclick="javascript:history.back(1);"  class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';"  id="hidePrint" >
<BR>
<BR>
<HR width=80%>
<BR>
<FORM ACTION="Timetable_All.Process_Search" METHOD="POST">
<div class="noPrint">
<TABLE  width="65%" class="t_b">
<TR  class="r" >
<TH ALIGN="left" NOWRAP  class="h" >Search Criteria</TH>
<TH ALIGN="right" COLSPAN="2"  class="h" >[<a href="javascript:void(0);" onclick="window.open('timetable_all.display_information_page',
    'Help','location=no,status=yes,scrollbars=yes,resizable=yes, width=960px, height=800px, left=0, top=0')"><font color=white>Click here for Search Tips</font></a>]</TH>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Enter all OR part of the subject code eg ACCY, POL 1, BM. <br>If the prefix is 3 Characters, enter a space <br>before the remainder of the subject code, eg POL 11')"
                                            onMouseOut="toHideLayer()">Subject Code</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<INPUT TYPE="text" NAME="p_subject_code" SIZE="40" MAXLENGTH="10">
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Enter all OR part of the subject name eg Accounting or Acc')"
                                            onMouseOut="toHideLayer()">Subject Name</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<INPUT TYPE="text" NAME="p_subject_name" SIZE="40" MAXLENGTH="40">
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Hold down the Ctrl key and click to select multiple levels')"
                                            onMouseOut="toHideLayer()">Level</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<SELECT NAME="p_subject_level" SIZE="4"  Multiple>
<OPTION SELECTED value="-1">All Subject Levels&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<OPTION value=0>000
<OPTION value=1>100
<OPTION value=2>200
<OPTION value=3>300
<OPTION value=4>400
<OPTION value=6>600
<OPTION value=8>800
<OPTION value=9>900
<OPTION value=H>Honours
<OPTION value=T>Thesis
</SELECT>
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Hold down the Ctrl key and click to select multiple sessions <br> Only sessions that appear on the timetable will appear for selection')"
                                            onMouseOut="toHideLayer()">Session</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<SELECT NAME="p_session" SIZE="4" Multiple>
<OPTION SELECTED value="-1">All Sessions&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<OPTION value=6414>GDE Annual
<OPTION value=6199>SHS July
<OPTION value=6120>Trimester 3
<OPTION value=6202>SHS Sept
<OPTION value=6416>GSM Ph1 S2
<OPTION value=6419>GSM Ph2 S2
<OPTION value=4799>Spring
<OPTION value=6300>Annual
<OPTION value=7018>SHS May
<OPTION value=5805>GDE Primary Autumn
<OPTION value=6415>GDE Spring
<OPTION value=5838>GSM Ph1 S1
<OPTION value=6218>Spring2013/Autumn2014
<OPTION value=6461>Winter
<OPTION value=6420>GSM Ph3 S1
<OPTION value=6198>SHS Feb
<OPTION value=6418>GSM Ph2 S1
<OPTION value=6460>Spring2013/Summer2013
<OPTION value=6118>Trimester 1
<OPTION value=5807>GDE Autumn
<OPTION value=6417>GSM Ph1 S3
<OPTION value=4798>Autumn
<OPTION value=6119>Trimester 2
<OPTION value=6201>SHS Oct
</SELECT>
</font></font>
</TD>
</TR>
<TR  class="r" >
<TD ALIGN="left"  class="d" onMouseOver="toPopLayer('Hold down the Ctrl key and click to select multiple Units')"
                                            onMouseOut="toHideLayer()">Unit</TD>
<TD ALIGN="left" DP="" ROWSPAN=""  COLSPAN="2"  class="d" >
<SELECT NAME="p_unit_abb" SIZE="4" Multiple>
<OPTION SELECTED value="-1">All Units 
<OPTION value=ACAD>Academic Program
<OPTION value=ADMN>Administration
<OPTION value=ARTS>Arts
<OPTION value=BIOL>Biological Sciences
<OPTION value=CHEM>Chemistry
<OPTION value=FACS>Commerce Subjects
<OPTION value=AA>Creative Arts
<OPTION value=ED>Education
<OPTION value=ENGG>Engineering
<OPTION value=ELP>English Language Program
<OPTION value=GSM>Graduate School of Medicine
<OPTION value=IND>Indigenous Studies
<OPTION value=CLC>LSC English Language
<OPTION value=CLF>LSC Foundation
<OPTION value=ALC>Language Centre
<OPTION value=LAW>Law
<OPTION value=SAAF>School of Accounting and Finance
<OPTION value=CME>School of Civil, Mining and Environmental Engineering
<OPTION value=CSSE>School of Computer Science and Software Engineering
<OPTION value=SEES>School of Earth and Environmental Sciences
<OPTION value=SECO>School of Economics
<OPTION value=ELEC>School of Electrical, Computer and Telecommunications Engineering
<OPTION value=SEPH>School of Engineering Physics
<OPTION value=SELP>School of English Literatures and Philosophy
<OPTION value=SHS>School of Health Sciences
<OPTION value=SHP>School of History and Politics
<OPTION value=ISAT>School of Information Systems and Technology
<OPTION value=SMM>School of Management and Marketing
<OPTION value=MAAS>School of Mathematics and Applied Statistics
<OPTION value=MMM>School of Mechanical, Materials and Mechatronic Engineering
<OPTION value=NMIH>School of Nursing, Midwifery and Indigenous Health
<OPTION value=SPSY>School of Psychology
<OPTION value=SSMC>School of Social Sciences, Media and Communication
<OPTION value=SCIE>Science Subjects
<OPTION value=TBS>Sydney Business School
</SELECT>
</font></font>
</TD>
</TR>
<INPUT TYPE="hidden" NAME="p_year" VALUE="2013">
<INPUT TYPE="hidden" NAME="p_campus_id" VALUE="1">
<INPUT TYPE="hidden" NAME="p_draft" VALUE="">
<INPUT TYPE="hidden" NAME="p_publish_date" VALUE="15 Nov, 2013 04:41:16pm">
<INPUT TYPE="hidden" NAME="p_type" VALUE="a">
</TABLE>
<BR>
<TABLE  width="65%" class="t">
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN="3"  class="d_no_bgcolor_nb" >
<INPUT TYPE="submit" VALUE="Search"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
&nbsp;&nbsp;
<INPUT TYPE="reset" VALUE="Reset&nbsp;"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
</font></font>
</TD>
</TR>
</TABLE>
</div>
</FORM>
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
</CENTER>
<BR>
<BR>
</div></div></div>
<div id="footer">
    <div class="footer">
      <div class="left">
        <ul>
          <li><a href="http://www.uow.edu.au/future/">Future Students</a></li>

          <li><a href="http://www.uow.edu.au/student/">Current Students</a></li>

          <li><a href="http://www.uow.edu.au/research/">Research</a></li>

          <li><a href="http://www.uow.edu.au/alumni/">Alumni</a></li>

          <li><a href="http://www.uow.edu.au/about/community/">Community & Partners</a></li>
        </ul>
      </div>

      <div class="middle">
        <ul>
          <li><a href="http://employment.uow.edu.au/">Employment at UOW</a></li>

          <li><a href="http://www.uow.edu.au/services/index.html">Services & Facilities</a></li>

          <li><a href="http://www.uow.edu.au/about/transport/">Getting to UOW</a></li>

          <li><a href="http://www.uow.edu.au/about/maps/index.html">Maps</a></li>

          <li><a href="http://www.uow.edu.au/about/security/">Security & Safety</a></li>
        </ul>
      </div>

      <div class="right">
        <ul>
          <li><a href="http://media.uow.edu.au/">News & Media</a></li>

          <li><a href="http://www.library.uow.edu.au/index.html">Library</a></li>

          <li><a href="https://smp.uow.edu.au/app/servlet/Student">Apply to Study at UOW</a></li>

          <li><a href="http://coursefinder.uow.edu.au/">Coursefinder</a></li>

          <li><a href="http://www.uow.edu.au/about/accommodation/">Living@UOW</a></li>
        </ul>
      </div>
    </div>

    <div class="footer">
      <div class="left">
        <p>University of Wollongong<br/>
        Wollongong NSW 2522 Australia<br/>
        UOW Switchboard: +61 2 4221 3555</p>
      </div>
<div class="middle">
<p>Comments and questions should be<br/>directed to <a href="mailto:room_bookings@uow.edu.au">Room Bookings</a></p>
</div>
<div class="right">
        <p>CRICOS Provider No: 00102E<br/>
        <a href="http://www.uow.edu.au/about/privacy/">Privacy</a>, <a href="http://www.uow.edu.au/about/disclaimer/">Disclaimer & Copyright Info</a><br/>
     <!--15434-->
        Feedback: <a href="http://www.uow.edu.au/student/feedback/UOW082677.html">Feedback @ UOW</a>
     <!--15434
      Feedback: <a href="http://www.uow.edu.au/student/feedback/UOW082677.html">webmasters@uow.edu.au</a>
     -->
     </p>
      </div>
</div></div>
</BODY>
</HTML>""")
  
  val timetable = new Response(200, """
<HTML>
<HEAD>
<meta http-equiv="Page-Enter" content="blendTrans(Duration=0)">
    <meta http-equiv="Page-Exit" content="blendTrans(Duration=0)">
<TITLE>Subject Timetable</TITLE>
</HEAD>
<body onLoad="setupDescriptions()"  id="maincontent">
<div id=object1 style="Z-INDEX: 0; LEFT: 25px; POSITION: absolute; TOP: -200px">hidden</div>
<TABLE  width="99%" class="t">
<TR  class="r_no_bgcolor" >
<TD NOWRAP  class="d_no_bgcolor_nb" ><font class="f_page_title">Subject Timetable<span></span></font></TD>
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
<TABLE  width="100%" class="t">
<TR  class="r_no_bgcolor" >
<TD ALIGN="right" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<font size=-1>2014 Timetable:&nbsp; &nbsp; Last Published: 18 Nov, 2013</font>
</font></font>
</TD>
</TR>
<TR  class="r_no_bgcolor" >
<TD ALIGN="right" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<font size=-1>2013 Summer Timetable:&nbsp; <font color=red> **DRAFT** </font>&nbsp; Last Published: 15 Nov, 2013</font>
</font></font>
</TD>
</TR>
</TABLE>
<CENTER>
<H3><b>Please refer back to Timetables regularly as there can be changes during the first 2 weeks of session.</b></H3>
</CENTER>
<BR>
<TABLE   class="t">
<TR  class="r_no_bgcolor" >
<TD  class="d_no_bgcolor_nb" ><b>Course: </b></TD>
<TD  class="d_no_bgcolor_nb" ><b>766&nbsp</b></TD>
<TD  class="d_no_bgcolor_nb" ><b>Bachelor of Computer Science&nbsp</b></TD>
</TR>
<TR  class="r_no_bgcolor" >
<TD  class="d_no_bgcolor_nb" ><b>Instance:</b></TD>
<TD  class="d_no_bgcolor_nb" ><b>766&nbsp</b></TD>
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN=""  class="d_no_bgcolor_nb" >
<b>Campus: Wollongong&nbsp&nbsp&nbsp&nbsp Delivery: On Campus&nbsp&nbsp&nbsp&nbsp Status: Active</b>
</font></font>
</TD>
</TR>
<TR  class="r_no_bgcolor" >
<TD  class="d_no_bgcolor_nb" ><b>Major:</b></TD>
<TD  class="d_no_bgcolor_nb" ><b>CS42&nbsp&nbsp&nbsp&nbsp</b></TD>
<TD  class="d_no_bgcolor_nb" ><b>Digital Systems Security</b></TD>
</TR>
</TABLE>
<BR>
<TABLE   class="t_b">
<TR  class="r" >
<TH NOWRAP  class="h" width="5%">Subject Code</TH>
<TH ALIGN="left"  class="h" width="15%">Subject Name</TH>
<TH ALIGN="center"  class="h" width="3%">Year</TH>
<TH  class="h" width="5%">Session</TH>
<TH ALIGN="left"  class="h" width="12%">Campus / Delivery</TH>
<TH  class="h" width="2%">CP</TH>
<TH ALIGN="left"  class="h" width="13%">Lecturer(s)/Co-ordinator(s)</TH>
<TH ALIGN="left"  class="h" width="14%">Contact Hours</TH>
</TR>
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d" >
<a href="javascript:void(0);" onclick="window.open('CAL.USER_SUBJECTINFO_SCREEN?p_faccde=24&p_subcode=CSCI321&p_depabb=CSSE&p_cal_subject_id=144372&p_year=2013&p_cal_type=U&p_cal_types=UP&p_display=NO','Subject','location=no,status=yes,scrollbars=yes,resizable=yes,width=900, height=800, left=0, top=0')">CSCI321</a>
</font></font>
</TD>
<TD  class="d" >Project</TD>
<TD ALIGN="center"  class="d" >2013</TD>
<TD ALIGN="center"  class="d" >Annual</TD>
<TD  class="d" >Woll/On Campus/Class 1</TD>
<TD ALIGN="center"  class="d" >12</TD>
<TD ALIGN="left"  class="d" ><B>Coordinator</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Dr Luke McAven<br></TD>
<TD  class="d" >1hr lec (Autumn week 1-4 only)</TD>
</TR>
<TR  class="r" >
<TD COLSPAN="2"  class="d" ></TD>
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN="6"  class="d" >
<TABLE  WIDTH="100%" class="t_b">
<TR  class="r" >
<TH  class="h" width="5%">&nbsp;</TH>
<TH ALIGN="left"  class="h" width="20%">Activity</TH>
<TH  class="h" width="10%">Day</TH>
<TH  class="h" width="10%">Start</TH>
<TH  class="h" width="10%">Finish</TH>
<TH  class="h" width="17%">Location</TH>
<TH ALIGN="left"  class="h" width="28%">Week</TH>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ><font class="f_14"></font></TD>
<TD  class="d" ><font class="f_14">Lecture</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">Mon</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">13:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">14:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">32-G01</font></TD>
<TD  class="d" ><font class="f_14">1-4</font></TD>
</TR>
</TABLE>
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<BR>
<TABLE   class="t_b">
<TR  class="r" >
<TH NOWRAP  class="h" width="5%">Subject Code</TH>
<TH ALIGN="left"  class="h" width="15%">Subject Name</TH>
<TH ALIGN="center"  class="h" width="3%">Year</TH>
<TH  class="h" width="5%">Session</TH>
<TH ALIGN="left"  class="h" width="12%">Campus / Delivery</TH>
<TH  class="h" width="2%">CP</TH>
<TH ALIGN="left"  class="h" width="13%">Lecturer(s)/Co-ordinator(s)</TH>
<TH ALIGN="left"  class="h" width="14%">Contact Hours</TH>
</TR>
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d" >
<a href="javascript:void(0);" onclick="window.open('CAL.USER_SUBJECTINFO_SCREEN?p_faccde=24&p_subcode=CSCI322&p_depabb=CSSE&p_cal_subject_id=144373&p_year=2013&p_cal_type=U&p_cal_types=UP&p_display=NO','Subject','location=no,status=yes,scrollbars=yes,resizable=yes,width=900, height=800, left=0, top=0')">CSCI322</a>
</font></font>
</TD>
<TD  class="d" >Systems Administration</TD>
<TD ALIGN="center"  class="d" >2013</TD>
<TD ALIGN="center"  class="d" >Spring</TD>
<TD  class="d" >Woll/On Campus/Class 1</TD>
<TD ALIGN="center"  class="d" >6</TD>
<TD ALIGN="left"  class="d" ><B>Coordinator</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A/PR Daniel F. Saffioti<br><B>Lecturer</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A/PR Daniel F. Saffioti<br></TD>
<TD  class="d" >3hrs lectures + 2hr lab</TD>
</TR>
<TR  class="r" >
<TD COLSPAN="2"  class="d" ></TD>
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN="6"  class="d" >
<TABLE  WIDTH="100%" class="t_b">
<TR  class="r" >
<TH  class="h" width="5%">&nbsp;</TH>
<TH ALIGN="left"  class="h" width="20%">Activity</TH>
<TH  class="h" width="10%">Day</TH>
<TH  class="h" width="10%">Start</TH>
<TH  class="h" width="10%">Finish</TH>
<TH  class="h" width="17%">Location</TH>
<TH ALIGN="left"  class="h" width="28%">Week</TH>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ></TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Tue</TD>
<TD ALIGN="Center"  class="d" >13:30</TD>
<TD ALIGN="Center"  class="d" >15:30</TD>
<TD ALIGN="Center"  class="d" >3-230</TD>
<TD  class="d" >Not first week</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >Or</TD>
<TD  class="d_hl_bgcolor" >Computer Lab</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Tue</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >15:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >17:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >3-230</TD>
<TD  class="d_hl_bgcolor" >Not first week</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ><font class="f_14">And</font></TD>
<TD  class="d" ><font class="f_14">Lecture A</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">Tue</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">08:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">10:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">24-203</font></TD>
<TD  class="d" ><font class="f_14">AllWeeks</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">And</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">Lecture B</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">Thu</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">08:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">09:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">32-G01</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">AllWeeks</font></TD>
</TR>
</TABLE>
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<BR>
<TABLE   class="t_b">
<TR  class="r" >
<TH NOWRAP  class="h" width="5%">Subject Code</TH>
<TH ALIGN="left"  class="h" width="15%">Subject Name</TH>
<TH ALIGN="center"  class="h" width="3%">Year</TH>
<TH  class="h" width="5%">Session</TH>
<TH ALIGN="left"  class="h" width="12%">Campus / Delivery</TH>
<TH  class="h" width="2%">CP</TH>
<TH ALIGN="left"  class="h" width="13%">Lecturer(s)/Co-ordinator(s)</TH>
<TH ALIGN="left"  class="h" width="14%">Contact Hours</TH>
</TR>
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d" >
<a href="javascript:void(0);" onclick="window.open('CAL.USER_SUBJECTINFO_SCREEN?p_faccde=24&p_subcode=CSCI330&p_depabb=CSSE&p_cal_subject_id=144377&p_year=2013&p_cal_type=U&p_cal_types=UP&p_display=NO','Subject','location=no,status=yes,scrollbars=yes,resizable=yes,width=900, height=800, left=0, top=0')">CSCI330</a>
</font></font>
</TD>
<TD  class="d" >Operating Systems</TD>
<TD ALIGN="center"  class="d" >2013</TD>
<TD ALIGN="center"  class="d" >Spring</TD>
<TD  class="d" >Woll/On Campus/Class 1</TD>
<TD ALIGN="center"  class="d" >6</TD>
<TD ALIGN="left"  class="d" ><B>Coordinator</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Dr Guomin Yang<br><B>Lecturer</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Dr Guomin Yang<br></TD>
<TD  class="d" >1 x 2  hours lecture, 1 x 1 hour lecture, 2 hours laboratory, 1 hour tutorial</TD>
</TR>
<TR  class="r" >
<TD COLSPAN="2"  class="d" ></TD>
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN="6"  class="d" >
<TABLE  WIDTH="100%" class="t_b">
<TR  class="r" >
<TH  class="h" width="5%">&nbsp;</TH>
<TH ALIGN="left"  class="h" width="20%">Activity</TH>
<TH  class="h" width="10%">Day</TH>
<TH  class="h" width="10%">Start</TH>
<TH  class="h" width="10%">Finish</TH>
<TH  class="h" width="17%">Location</TH>
<TH ALIGN="left"  class="h" width="28%">Week</TH>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ></TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >13:30</TD>
<TD ALIGN="Center"  class="d" >15:30</TD>
<TD ALIGN="Center"  class="d" >3-127</TD>
<TD  class="d" >Not first week</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">And</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">Lecture A</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">Tue</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">10:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">12:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">6-210</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">AllWeeks</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ><font class="f_14">And</font></TD>
<TD  class="d" ><font class="f_14">Lecture B</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">Fri</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">09:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">10:30</font></TD>
<TD ALIGN="Center"  class="d" ><font class="f_14">6-210</font></TD>
<TD  class="d" ><font class="f_14">AllWeeks</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" >And</TD>
<TD  class="d_hl_bgcolor" >Tutorial</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >Fri</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >12:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >13:30</TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" >3-121</TD>
<TD  class="d_hl_bgcolor" >Not first week</TD>
</TR>
</TABLE>
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<BR>
<TABLE   class="t_b">
<TR  class="r" >
<TH NOWRAP  class="h" width="5%">Subject Code</TH>
<TH ALIGN="left"  class="h" width="15%">Subject Name</TH>
<TH ALIGN="center"  class="h" width="3%">Year</TH>
<TH  class="h" width="5%">Session</TH>
<TH ALIGN="left"  class="h" width="12%">Campus / Delivery</TH>
<TH  class="h" width="2%">CP</TH>
<TH ALIGN="left"  class="h" width="13%">Lecturer(s)/Co-ordinator(s)</TH>
<TH ALIGN="left"  class="h" width="14%">Contact Hours</TH>
</TR>
<TR  class="r" >
<TD ALIGN="center" DP="" ROWSPAN=""  COLSPAN=""  class="d" >
<a href="javascript:void(0);" onclick="window.open('CAL.USER_SUBJECTINFO_SCREEN?p_faccde=24&p_subcode=CSCI368&p_depabb=CSSE&p_cal_subject_id=144386&p_year=2013&p_cal_type=U&p_cal_types=UP&p_display=NO','Subject','location=no,status=yes,scrollbars=yes,resizable=yes,width=900, height=800, left=0, top=0')">CSCI368</a>
</font></font>
</TD>
<TD  class="d" >Network Security</TD>
<TD ALIGN="center"  class="d" >2013</TD>
<TD ALIGN="center"  class="d" >Spring</TD>
<TD  class="d" >Woll/On Campus/Class 1</TD>
<TD ALIGN="center"  class="d" >6</TD>
<TD ALIGN="left"  class="d" ><B>Coordinator</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Dr Guomin Yang<br><B>Lecturer</B><br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Dr Guomin Yang<br></TD>
<TD  class="d" >2 hrs Lecture + 1hr tutorial + 3hrs lab (usually wk3,6,9,12)</TD>
</TR>
<TR  class="r" >
<TD COLSPAN="2"  class="d" ></TD>
<TD ALIGN="" DP="" ROWSPAN=""  COLSPAN="6"  class="d" >
<TABLE  WIDTH="100%" class="t_b">
<TR  class="r" >
<TH  class="h" width="5%">&nbsp;</TH>
<TH ALIGN="left"  class="h" width="20%">Activity</TH>
<TH  class="h" width="10%">Day</TH>
<TH  class="h" width="10%">Start</TH>
<TH  class="h" width="10%">Finish</TH>
<TH  class="h" width="17%">Location</TH>
<TH ALIGN="left"  class="h" width="28%">Week</TH>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" ></TD>
<TD  class="d" >Computer Lab</TD>
<TD ALIGN="Center"  class="d" >Mon</TD>
<TD ALIGN="Center"  class="d" >09:30</TD>
<TD ALIGN="Center"  class="d" >12:30</TD>
<TD ALIGN="Center"  class="d" >3-230</TD>
<TD  class="d" >Not first week</TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">And</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">Lecture</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">Wed</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">13:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">15:30</font></TD>
<TD ALIGN="Center"  class="d_hl_bgcolor" ><font class="f_14">19-1064</font></TD>
<TD  class="d_hl_bgcolor" ><font class="f_14">AllWeeks</font></TD>
</TR>
<TR  class="r" >
<TD ALIGN="Center"  class="d" >And</TD>
<TD  class="d" >Tutorial</TD>
<TD ALIGN="Center"  class="d" >Fri</TD>
<TD ALIGN="Center"  class="d" >16:30</TD>
<TD ALIGN="Center"  class="d" >17:30</TD>
<TD ALIGN="Center"  class="d" >3-123</TD>
<TD  class="d" >Not first week</TD>
</TR>
</TABLE>
</font></font>
</TD>
</TR>
</TABLE>
<BR>
<BR>
<BR>
<FORM ACTION="go_to_main.to_main" METHOD="POST">
<INPUT TYPE="hidden" NAME="p_process" VALUE="Timetable">
<INPUT TYPE="hidden" NAME="p_step" VALUE="1">
<INPUT TYPE="hidden" NAME="P_stdnbr" VALUE="1234567">
<INPUT TYPE="hidden" NAME="p_session_id" VALUE="UZMLRVKICHUZPSKKIKSICRVSMSTRRTGJ">
<CENTER>
<INPUT TYPE="submit" NAME="p_usr_choice" VALUE="SOLS Home"   class="btn" onmouseover="this.className='btnhov';" onmouseout="this.className='btn';" >
<BR>
<BR>
</CENTER>
</FORM>
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