<%@page contentType="text/html; charset=Shift_JIS"%>

<%
/*�ϐ��錾*/
String entry;				/*����A�N�Z�X�����ʂ���p�����[�^��������ϐ�*/
String colorGroup1 = (String)session.getAttribute("colorGroup1");/*�O���[�v1�Ɋ���U��F��ێ�����ϐ�(�Z�b�V�����X�R�[�v�ɕێ�)*/
String colorGroup2 = (String)session.getAttribute("colorGroup2");/*�O���[�v2�Ɋ���U��F��ێ�����ϐ�(�Z�b�V�����X�R�[�v�ɕێ�)*/
entry = (String)request.getAttribute("entry");					/*����A�N�Z�X�����ʂ���p�����[�^����M*/
if(entry == null){
	entry ="";
}
%>

<!--�Ǘ��҂����[�U�[�O���[�v���Ƃ̕\���F��ݒ肷��y�[�W��\������JSP-->


<html>
	<head>
		<title>�y�\���F�ݒ�y�[�W�z�Ǘ��җp</title>
		</head>
		<body>
			<h1 style="text-align:center">�\���F�ݒ�y�[�W</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<body>
					<form action="<%=request.getContextPath()%>/Admin" method="get">



						<!--����A�N�Z�X���O���[�v1�̐F��ێ�����p�����[�^��null�A�܂��̓O���[�v1�̐F��ێ�����p�����[�^��null(�O���[�v2�̐F����ɐݒ肳�ꂽ���Ȃ�)
						�A�O���[�v1�̐F��ێ�����p�����[�^�̒l������ꍇ�̏���-->
						<p style="color:white;background-color:black;display:inline;">�O���[�v1</p>
						<%if (colorGroup1 == null||(entry.equals("first")&&colorGroup1 == null)){%>
						<p style="width:250px;display:inline-block;background-color:white">�f�t�H���g(�z���C�g)</p>
						<%}else if(colorGroup1 != null){%>
						<p style="width:250px;display:inline-block;background-color:<%=colorGroup1%>;"><%=colorGroup1%></p>
						<%}%>
						<!-- �O���[�v1�̃J���[�I���y�[�W�� -->
						<p style="display:inline-block"><a href= "<%=request.getContextPath()%>/view/ch04/colorselect.jsp?userType=1">�\���F�ύX</a></p>
						<br>


						<!--����A�N�Z�X���O���[�v2�̐F��ێ�����p�����[�^��null�A�܂��̓O���[�v2�̐F��ێ�����p�����[�^��null(�O���[�v1�̐F����ɐݒ肳�ꂽ���Ȃ�)
						�A�O���[�v2�̐F��ێ�����p�����[�^�̒l������ꍇ�̏����̏���-->
						<p style="color:white;background-color:black;display:inline;">�O���[�v2</p>
						<%if (colorGroup2 == null||(entry.equals("first")&&colorGroup2 == null)) {%>
						<p style="width:250px;display:inline-block;background-color:white">�f�t�H���g(�z���C�g)</p>
						<%} else if(colorGroup2 != null){%>
						<p style="width:250px;display:inline-block;background-color:<%=colorGroup2%>;"><%=colorGroup2%></p>
						<%}%>
						<!-- �O���[�v2�̃J���[�I���y�[�W�� -->
						<p style="display:inline-block"><a href= "<%=request.getContextPath()%>/view/ch04/colorselect.jsp?userType=2">�\���F�ύX</a></p>
						<br>


						<!--�ォ��
						�O���[�v1�A2�̐F���ݒ肳��Ă��Ȃ��ꍇ
						�O���[�v2�����F���ݒ肳��Ă��Ȃ��ꍇ
						�O���[�v1�����F���ݒ肳��Ă��Ȃ��ꍇ
						�O���[�v1�A2���ɐF���ݒ肳��Ă���ꍇ-->
						<%if(colorGroup1 == null&&colorGroup2 == null) {%>
						<input type="hidden" name="colorGroup1" value="white">
						<input type="hidden" name="colorGroup2" value="white">
						<%} else if(colorGroup1 != null&&colorGroup2 == null) {%>
						<input type="hidden" name="colorGroup1" value="<%=colorGroup1%>">
						<input type="hidden" name="colorGroup2" value="white">
						<%}else if(colorGroup2 != null&&colorGroup1 == null) { %>
						<input type="hidden" name="colorGroup1" value="white">
						<input type="hidden" name="colorGroup2" value="<%=colorGroup1%>">
						<% }else {%>
						<input type="hidden" name="colorGroup1" value="<%=colorGroup1%>">
						<input type="hidden" name="colorGroup2" value="<%=colorGroup2%>">
						<%} %>
						<input type="submit" value="���M">
					</form>



					<!-- �Z�b�V�����X�R�[�v�ɕۑ����ꂽ�O���[�v1�A2�̐F�I���������Z�b�g -->
					<form action="<%=request.getContextPath()%>/Admin"method="get">
						<input type="hidden" name="reset" value="reset">
						<input type="submit" value="�F�I�����Z�b�g">
					</form>
					<!--�A�N�Z�X���J�E���g�y�[�W��-->
					<form action="<%=request.getContextPath()%>/view/ch04/accessCount.jsp"method="get">
						<input type="submit" value="�A�N�Z�X���J�E���g">
					</form>
			</body>
</html>