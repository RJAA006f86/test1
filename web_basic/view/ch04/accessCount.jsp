<%@page contentType="text/html; charset=Shift_JIS"%>
<%
String second = (String)session.getAttribute("second");
%>

<%
Integer group1Count = (Integer)application.getAttribute("group1Count");
Integer group2Count = (Integer)application.getAttribute("group2Count");
%>

<%
if(group1Count == null&&group2Count == null) {
	group1Count = 0;
	group2Count = 0;
} %>


<!-- �A�N�Z�X�J�E���g�y�[�W-->

<html>
<style>
.count P{
width: 300px;
margin:0px auto 0px;
}

P{
text-align: center;
width: 300px;
margin:0px auto 0px;
}

</style>
	<head>
		<title>�y�A�N�Z�X�J�E���g�y�[�W�z</title>
	</head>
		<body>
			<h1 style="text-align:center">�A�N�Z�X�J�E���g�y�[�W</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<div class="count">
				<p>�y�O���[�v1�z<%=group1Count%>�l</p>
				<p>�y�O���[�v2�z<%=group2Count%>�l</p>
			</div>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/view/ch04/accessCount.jsp">�ēǂݍ���</a></p>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/Userctl?countReset=True">�l���J�E���g���Z�b�g</a></p>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/Admin">�\���F�ݒ�y�[�W</a></p>
		</body>
</html>


