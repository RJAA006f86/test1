<%@page contentType="text/html; charset=Shift_JIS"%>


<!-- 色表示ページ。この画面をサイリウムとして使用。-->
<%

/*表示色はアプリケーションスコープから取得し変数に代入*/
ServletContext ap = getServletContext();						/* アプリケーションスコープの保存領域を取得*/
String colorGroup1 = (String)ap.getAttribute("colorGroup1");	/* グループ1に割り振られる色を保管する変数*/
String colorGroup2 = (String)ap.getAttribute("colorGroup2");	/* グループ2に割り振られる色を保管する変数*/
String userType = (String)request.getAttribute("userType");		/* ユーザーがグループ選択を行った際のパラメータが代入される変数
																userType=1がcolorGroup1、userType=2がcolorGroup2*/
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
		<title>【サイリウム表示ページ】</title>
	</head>
<!-- 条件分岐。変数に代入されたパラメータuserTypeによりグループを判断しそれぞれのグループの色を表示-->
<%if(userType.equals("1")){%>
<body style="background-color:<%=colorGroup1%>">
<%} else if(userType.equals("2")){ %>
<body style="background-color:<%=colorGroup2%>">
<%} %>
<div class="space">
<!-- グループ選択ページへ-->
<p><a href="<%=request.getContextPath()%>/Userctl"><img src="<%=request.getContextPath()%>/img/btnt.png" alt="TOPへ" border="0"/></a></p>
<!-- 再読み込み。ユーザーがこのページにアクセスしたときと同じパラメータをサーブレットUserctlへ送信-->
<p><a href="<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True"><img src="<%=request.getContextPath()%>/img/btnr.png" alt="リロード" border="0"/></a></p>
</div>
</body>
</html>
