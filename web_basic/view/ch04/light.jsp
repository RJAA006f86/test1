<%@page contentType="text/html; charset=Shift_JIS"%>


<!-- 色表示ページ。この画面をサイリウムとして使用。-->
<%

/*表示色はアプリケーションスコープから取得し変数に代入*/
ServletContext ap = getServletContext();						/* アプリケーションスコープの保存領域を取得*/
String colorGroup1 = (String)ap.getAttribute("colorGroup1");	/* グループ1に割り振られる色を保管する変数*/
String colorGroup2 = (String)ap.getAttribute("colorGroup2");    /* グループ2に割り振られる色を保管する変数*/
String userType = (String)request.getAttribute("userType");		/* ユーザーがグループ選択を行った際のパラメータが代入される変数																userType=1がcolorGroup1、userType=2がcolorGroup2*/
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
	<meta http-equiv="refresh" content="180; URL=<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True&reload=True">
<!-- 条件分岐。変数に代入されたパラメータuserTypeによりグループを判断しそれぞれのグループの色を表示-->
<!-- アプリケーションスコープ直接参照とアプリケーションの内容を保存した変数の併用で様々な条件分岐パターンに対応-->
<!-- 上記例:アプリケーションスコープは空ではないが内容が白であると不都合な場合(１つ目の条件分岐)-->
<!-- デフォルト、もしくは色選択によってホワイトが選択されている場合はボタン画像がグレーに切り替わる-->
<%if(userType.equals("1")&&(String)ap.getAttribute("colorGroup1") != null&&!(colorGroup1.equals("white"))){%>
<body style="background-color:<%=(String)ap.getAttribute("colorGroup1")%>">
<div class="space">
<!-- グループ選択ページへ-->
<p><a href="<%=request.getContextPath()%>/Userctl"><img src="<%=request.getContextPath()%>/img/btnt.png" alt="TOPへ" border="0"/></a></p>
<!-- 再読み込み。ユーザーがこのページにアクセスしたときと同じパラメータをサーブレットUserctlへ送信-->
<p><a href="<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True&reload=True"><img src="<%=request.getContextPath()%>/img/btnr.png" alt="リロード" border="0"/></a></p>
</div>
<%} else if(userType.equals("1")&&(String)ap.getAttribute("colorGroup1") == null||(String)ap.getAttribute("colorGroup1") != null&&colorGroup1.equals("white")){%>
<body style="background-color:white">
<div class="space">
<!-- グループ選択ページへ-->
<p><a href="<%=request.getContextPath()%>/Userctl"><img src="<%=request.getContextPath()%>/img/btntw.png" alt="TOPへ" border="0"/></a></p>
<!-- 再読み込み。ユーザーがこのページにアクセスしたときと同じパラメータをサーブレットUserctlへ送信-->
<p><a href="<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True&reload=True"><img src="<%=request.getContextPath()%>/img/btnrw.png" alt="リロード" border="0"/></a></p>
</div>
<%}else if(userType.equals("2")&&(String)ap.getAttribute("colorGroup2") != null&&!(colorGroup2.equals("white"))){ %>
<body style="background-color:<%=(String)ap.getAttribute("colorGroup2")%>">
<div class="space">
<!-- グループ選択ページへ-->
<p><a href="<%=request.getContextPath()%>/Userctl"><img src="<%=request.getContextPath()%>/img/btnt.png" alt="TOPへ" border="0"/></a></p>
<!-- 再読み込み。ユーザーがこのページにアクセスしたときと同じパラメータをサーブレットUserctlへ送信-->
<p><a href="<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True&reload=True"><img src="<%=request.getContextPath()%>/img/btnr.png" alt="リロード" border="0"/></a></p>
</div>
<%} else if(userType.equals("2")&&(String)ap.getAttribute("colorGroup2") == null||(String)ap.getAttribute("colorGroup2") != null&&colorGroup2.equals("white")){%>
<body style="background-color:white">
<div class="space">
<!-- グループ選択ページへ-->
<p><a href="<%=request.getContextPath()%>/Userctl"><img src="<%=request.getContextPath()%>/img/btntw.png" alt="TOPへ" border="0"/></a></p>
<!-- 再読み込み。ユーザーがこのページにアクセスしたときと同じパラメータをサーブレットUserctlへ送信-->
<p><a href="<%=request.getContextPath()%>/Userctl?userType=<%=userType%>&confirm=True&reload=True"><img src="<%=request.getContextPath()%>/img/btnrw.png" alt="リロード" border="0"/></a></p>
</div>
<% }%>
</body>
</html>
