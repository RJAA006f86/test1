<%@page contentType="text/html; charset=Shift_JIS"%>


<!-- �F�\���y�[�W�B���̉�ʂ��T�C���E���Ƃ��Ďg�p�B-->
<%

/*�\���F�̓A�v���P�[�V�����X�R�[�v����擾���ϐ��ɑ��*/
ServletContext ap = getServletContext();						/* �A�v���P�[�V�����X�R�[�v�̕ۑ��̈���擾*/
String colorGroup1 = (String)ap.getAttribute("colorGroup1");	/* �O���[�v1�Ɋ���U����F��ۊǂ���ϐ�*/
String colorGroup2 = (String)ap.getAttribute("colorGroup2");	/* �O���[�v2�Ɋ���U����F��ۊǂ���ϐ�*/
String userType = (String)request.getAttribute("userType");		/* ���[�U�[���O���[�v�I�����s�����ۂ̃p�����[�^����������ϐ�
																userType=1��colorGroup1�AuserType=2��colorGroup2*/
%>


<html>
<style>
.space{
height: 1920px;
margin:0px auto 0px;
}

.space p:nth-of-type(1){
width:250px;
height:250px;
margin:200px auto 0px;
}

.space p:nth-of-type(2){
width:250px;
height:250px;
margin:50px auto 0px;
display:block;
}

.space p a{
background:grb(255,255,253);
width:100%;
height:100%;
display:block;
}
.space p a img{
width:100%;
height:100%;
}
.space p a img:hover{
opacity:0.5;
transition:0.3s;






</style>
	<head>
		<title>�y�T�C���E���\���y�[�W�z</title>
	</head>
<!-- ��������B�ϐ��ɑ�����ꂽ�p�����[�^userType�ɂ��O���[�v�𔻒f�����ꂼ��̃O���[�v�̐F��\��-->
<%if(userType.equals("1")){%>
<body style="background-color:<%=colorGroup1%>">
<%} else if(userType.equals("2")){ %>
<body style="background-color:<%=colorGroup2%>">
<%} %>
<div class="space">
<!-- �O���[�v�I���y�[�W��-->
<p><a href="<%=request.getContextPath()%>/Userctl"><img src="<%=request.getContextPath()%>/img/btnt.png" alt="TOP��" border="0"/></a></p>
<!-- �ēǂݍ��݁B���[�U�[�����̃y�[�W�ɃA�N�Z�X�����Ƃ��Ɠ����p�����[�^���T�[�u���b�gUserctl�֑��M-->
<p><a href="<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True"><img src="<%=request.getContextPath()%>/img/btnr.png" alt="�����[�h" border="0"/></a></p>
</div>
</body>
</html>
