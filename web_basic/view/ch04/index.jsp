<%@page contentType="text/html; charset=Shift_JIS"%>

<%
String userType = (String)request.getAttribute("userType");  /* ���[�U�[���I�������O���[�v�������ϐ�*/
String message = (String)request.getAttribute("message");    /* ���ӎ����̊m�F�����{���̃��b�Z�[�W�p�̕ϐ�*/
String confirm = (String)request.getAttribute("confirm");/* ���ӎ����m�F���s�������ۂ����Ǘ�����ϐ�*/
String second = (String)session.getAttribute("second");
%>



<!-- ���[�U�[���O���[�v�I���ƒ��ӎ����̊m�F���s��JSP -->

<html>
<style>
.space{
height: 1920px;
margin:0px auto 0px;
}
form{
width:500px;
height:100px;
margin:0px auto;
}
form select:nth-of-type(1){
font-size: 30pt;
text-align:left;
}
form select:nth-of-type(2){
font-size: 30pt;
text-align:left;
}
form input[type="submit"]{
width: 300px;
height: 100px;
font-size: 30pt;
margin:50px auto 0px;
box-sizing: border-box;
border-radius:20px/20px;
}
P{
text-align: left;
margin:50px auto;
font-size: 20pt;
display:inline-block
}
.warning{
text-align: left;
margin:0px 0px 0px 0px;

}
.check P:nth-of-type(1){
width: 300px;
margin:20px auto 0px;
}
.check P{
width: 300px;
margin:0px auto 0px;

}

</style>
	<head>
		<title>�y�O���[�v�I���y�[�W�z</title>
	</head>
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<%if(second != null) {%>
	<meta http-equiv="refresh" content="3; URL=<%=request.getContextPath()%>/view/ch04/logout.jsp">
	<%} %>
	<body>
			<h1 style="text-align:center">�O���[�v�I���y�[�W</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>


			<!-- 2�̃v���_�E���̑I�����ʂɂ��\���ύX�B�܂���������I�������ꍇ�I���ł��O���[�v�͕ێ������
			 -->



			<form action="<%=request.getContextPath()%>/Userctl" method="get">
			<!-- �O���[�v�I���̃v���_�E��-->
				<SELECT name="userType">
					<%if(confirm == null) {%>
					<OPTION value="1" selected>
					�O���[�v1
					</OPTION>
					<OPTION value="2">
					�O���[�v2
					</OPTION>
					<%} else if((confirm.equals("False")&&userType.equals("1"))){%>
					<OPTION value="<%= userType%>" selected>
					�O���[�v<%= userType%>
					</OPTION>
					<OPTION value="2">
					�O���[�v2
					</OPTION>
					<%} else if((confirm.equals("False")&&userType.equals("2"))){%>
					<OPTION value="<%= userType%>" selected>
					�O���[�v<%= userType%>
					</OPTION>
					<OPTION value="1">
					�O���[�v1
					</OPTION>
					<%}%>
				</SELECT>
				<div class="check">
				<p>�y���ӎ����z</p>
				<p>�E��ʂ̋P�x�A�X�N���[���Z�[�o�[�Ȃǂ͎g�p�󋵂ɉ����Đݒ�ύX���s���Ă��������B</p>
				<p>�E�h�炷�Ɠ��삷��A�v��������ꍇ�͏I���܂��͐ݒ�ύX���s���Ă��������B</p>
				<p>�E�g�p���͎��͂̐l����̂ɒ��ӂ��Ă��������B</p>
				</div>
				<br>
				<!-- ��������B���[�U�[����������I�������ꍇ�A�T�[�u���b�g����Ԃ��ꂽ�p�����[�^�ɂ��
				���ӎ����m�F�̕������Ԃ�-->

				<% if(message != null) {%>
				<p style="color:red;">���ӎ����m�F
				</p>
				<%} else{ %>
				<p>���ӎ����m�F
				</p>
				<%} %>
				<!-- ���ӎ����m�F�̃v���_�E��-->
				<SELECT name="confirm">
					<OPTION value="False">
					������
					</OPTION>
					<OPTION value="True">
					�͂�
					</OPTION>
				</SELECT>
				<!-- ��������B���[�U�[����������I�������ꍇ�A�T�[�u���b�g����Ԃ��ꂽ�p�����[�^�ɂ��
				���ӎ����m�F�𑣂����b�Z�[�W���\�������-->
				<% if(message != null) {%>
				<p style="color:red"class = "Warning"><%=message %></p>
				<%} %>
				<br>
				<input type="submit" value="���M">
				</form>
	</body>
</html>