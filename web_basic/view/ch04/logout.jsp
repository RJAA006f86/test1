<%@page contentType="text/html; charset=Shift_JIS"%>
<%
String second = (String)session.getAttribute("second");
%>
<%if(second != null) {
session.invalidate();
} %>


<!-- ���O�A�E�g�y�[�W-->

<html>
<style>
.check P{
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
		<title>�y���O�A�E�g�y�[�W�z</title>
	</head>
		<body>
			<h1 style="text-align:center">���O�A�E�g�y�[�W</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<div class="check">
				<p>�y�A�v�������O�Ɂz</p>
				<p>�E���O�C�����ɍs�����[���̐ݒ�ݒ�ύX�����ɖ߂��Ă��������B</p>
			</div>
			<p style="color:red;">�����p���肪�Ƃ��������܂���</p>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/Userctl">�ă��O�C��</a></p>
		</body>
</html>


