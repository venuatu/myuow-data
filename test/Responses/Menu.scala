package Responses

object Menu {
  // GET sols_menu.display_sols_menu?p_system=STUDENT&p_menu_name=MAIN_MENU&p_student_number=1234567&p_session_id=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG
  val cs = "28192482061335740121"
  val response = new Response(200, """
<HTML>
<HEAD>
<BODY id="bucket">
<div id="bucket">
<TABLE  ALIGN="center" width=95%><TR><td width="100%">
    <div id="navMenu">
        <ul style="list-style:none;margin:0;padding:0;">
            <li>
                <img height="14" name="arrow1" width="18" style="display:none;" alt=""
                src="https://www.uow.edu.au/content/fragments/uow_navigation/images/navarrow.gif" />
                <span style="cursor:pointer; cursor:hand;" onClick="expandit(this,arrow1)">Main Menu</span>
                <div style="display:"";">
                    <ul class="navLinks">
                        <li>
                            <a href="/sid/sols_to_lms.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121" target="rightFrame" title="Access your online subjects in the eLearning space">eLearning</a>
                        </li> 
                        <li>
                            <a href="/sid/Assignment_Result.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121" target="rightFrame" title="View your assignment results (Note: Not all lecturers post results here)">Assignment Results</a>
                        </li> 
                    </ul>
                </div>
            </li>
        </ul>
    </div>
    <div id="navMenu">
        <ul style="list-style:none;margin:0;padding:0;">
            <li>
                <img height="14" name="arrow2" width="18" style="display:none;" alt=""
                src="https://www.uow.edu.au/content/fragments/uow_navigation/images/navarrow.gif" />
                <span style="cursor:pointer; cursor:hand;" onClick="expandit(this,arrow2)">Timetable Menu</span>
                <div style="display:"";">
                    <ul class="navLinks">
                        <li>
                            <a href="/sid/er_exam_timetable.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121" target="rightFrame" title="Check your exam timetable here when it is released">Exam Timetable</a>
                        </li> 
                        <li>
                            <a href="/sid/timetable_student.call_main?P_STUDENT_NUMBER=1234567&P_SESSION_ID=GSZTHTRHDVCFDWDGJFKYSKLOYJRCVCOG&p_cs=28192482061335740121" target="rightFrame" title="Once you have enrolled, this link shows your own personal subject timetable">Subject Timetable</a></li> 
                        </li>
                    </ul>
                </div>
            </li>
        </ul>
    </div>
    <div id="navMenu">
        <ul style="list-style:none;margin:0;padding:0;">
            <li>
                <img height="14" name="arrow0" width="18" style="display:none;" alt="" src="https://www.uow.edu.au/content/fragments/uow_navigation/images/navarrow.gif" />
                <span style="cursor:pointer; cursor:hand;" onClick="expandit(this,arrow0)">Other Information</span>
                <div style="display:"";">
                    <ul class="navLinks">
                        <li>
                            <a href="http://www.uow.edu.au/about/policy/it/index.html" target="-blank">View IT Policies</a>
                        </li>
                        <li>
                            <a href="http://now.uow.edu.au/" target="-blank">Find out what's happening at UOW - UOWnow </a>
                        </li> 
                    </ul>
                </div>
            </li>
        </ul>
    </div>
</td></tr></table>
</div>
</BODY>
</HTML>""")

}