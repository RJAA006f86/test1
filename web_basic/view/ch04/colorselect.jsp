<%@page contentType="text/html; charset=Shift_JIS"%>
<%
/*�ϐ��錾*/
String userType = request.getParameter("userType");			/*�O���[�v1�A2�����ʂ���p�����[�^����M���ĕێ�����ϐ�*/
String[] colorsBlue = {"mintcream","honeydew","lightcyan","cornflower","powderblue","lightskyblue","skyblue","aqua","aquamarine","cyan","richblue","cadetblue","azure","aliceblue","lavender","lightblue","lightsteelblue","turquoise","darkturquoise","mediumturquoise","deepskyblue","dodgerblue","royalblue","mediumslateblue","slateblue","darkslateblue","indigo","navy","richblue","cadetblue","cornflowerblue","steelblue","blue","mediumblue","darkblue","midnightblue"};
String[] colorsGreen = {"greenyellow","lightgreen","chartreuse","lawngreen","lime","yellowgreen","limegreen","seagreen","olivedrab","darkolivegreen","green","darkslategray","springgreen","mediumspringgreen","mediumaquamarine","darkseagreen","lightseagreen","mediumseagreen","teal","darkcyan","forestgreen","darkgreen","palegreen"};
String[] colorsRed ={"seashell","oldlace","cornsilk","papayawhip","bisque","moccasin","navajowhite","wheat","lightpink","violet","lightsalmon","salmon","palevioletred","lightcoral","orchid","mediumorchid","mediumpurple","copper","darkorchid","blueviolet","purple","red","darkbrown","darkred","lavenderblush","linen","antiquewhite","mistyrose","blanchedalmond","feldsper","peachpuff","pink","thistle","plum","darksalmon","rosybrown","hotpink","indianred","deeppink","magenta","fuchsia","mediumvioletred","darkviolet","darkmagenta","tomato","orangered","crimson","firebrick"};
String[] colorsYellow = {"lightyellow","lemonchiffon","khaki","burlywood","sandybrown","brass","darkgoldenrod","chocolate","olive","orange","yellow","saddlebrown","brown","beige","lightgoldenrodyellow","palegoldenrod","tan","coral","darkkhaki","goldenrod","peru","coolcopper","darkorange","gold","sienna","maroon"};
String[] colorsBlack = {"white","ghostwhite","whitesmoke","lightgrey","lightslategray","slategray","dimgray","black","ivory","snow","floralwhite","gainsboro","silver","darkgray","gray"};


/*�F�̑I������ێ�����z��	�����_�ł͐n����������Ă��܂��񂪂��̎d�g�݂ɂ��F�I���͊ȒP�ɑ��₷���Ƃ��ł��܂�*/
%>



<html>
	<head>
		<title>�y�J���[�I���y�[�W�z�Ǘ��җp</title>
	</head>
		<h1 style="text-align:center">�y�J���[�I���y�[�W�z�Ǘ��җp</h1>
		<hr style="height:3; background-color:#0000ff" />
		<h1>�Ԍn��</h1>


				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count = 0;
			    for (int a = 0; a < colorsRed.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsRed.length-count) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsRed[count]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsRed[count]%>">sample</p><br>
			        <% count++;
			        } else if(count != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsRed[count]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsRed[count]%>">sample</p>
			        <% count++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsRed[count]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsRed[count]%>">sample</p>
			        <%count++;}
			      }
			    }%>
			    <p><input type="submit" value="���M����"></p>
				</form>
			<h1>�n��</h1>


				<!-- �z�񂩂�F�����o�����W�I�{�^���Ƌ��ɂP�s�ɂ�10�o�́A�z��̗v�f����10�Ŋ���؂�Ȃ��Ă��Ή���
				 colorGroup�Ƃ���������̌��userType��������`�ɂ��邱�Ƃɂ�肱�̃y�[�W���O���[�v1�A2������ł��g����悤�ɂ��Ă��܂�
				 �܂��A�z���ǉ������̏������g���܂킷���ƂŊȒP�Ƀy�[�W�𑝐݂ł��܂�-->


				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count2 = 0;
			    for (int a = 0; a < colorsBlue.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsBlue.length-count2) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlue[count2]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlue[count2]%>">sample</p><br>
			        <% count2++;
			        } else if(count2 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlue[count2]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlue[count2]%>">sample</p>
			        <% count2++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlue[count2]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsBlue[count2]%>">sample</p>
			        <%count2++;}
			      }
			    }%>
			    <p><input type="submit" value="���M����"></p>
			    </form>
			    <h1>�Όn��</h1>

				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count3 = 0;
			    for (int a = 0; a < colorsGreen.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsGreen.length-count3) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsGreen[count3]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsGreen[count3]%>">sample</p><br>
			        <% count3++;
			        } else if(count3 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsGreen[count3]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsGreen[count3]%>">sample</p>
			        <% count3++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsGreen[count3]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsGreen[count3]%>">sample</p>
			        <%count3++;}
			      }
			    }%>
			    <p><input type="submit" value="���M����"></p>
				</form>
						<h1>���n��</h1>


				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count4 = 0;
			    for (int a = 0; a < colorsYellow.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsYellow.length-count4) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsYellow[count4]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsYellow[count4]%>">sample</p><br>
			        <% count4++;
			        } else if(count4 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsYellow[count4]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsYellow[count4]%>">sample</p>
			        <% count4++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsYellow[count4]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsYellow[count4]%>">sample</p>
			        <%count4++;}
			      }
			    }%>
			    <p><input type="submit" value="���M����"></p>
				</form>
				<h1>���n��</h1>
				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count5 = 0;
			    for (int a = 0; a < colorsYellow.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsBlack.length-count5) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlack[count5]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlack[count5]%>">sample</p><br>
			        <% count5++;
			        } else if(count5 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlack[count5]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlack[count5]%>">sample</p>
			        <% count5++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlack[count5]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsBlack[count5]%>">sample</p>
			        <%count5++;}
			      }
			    }%>
			    <p><input type="submit" value="���M����"></p>
				</form>

</html>