<%@page contentType="text/html; charset=Shift_JIS"%>
<%
String second = (String)session.getAttribute("second");
%>
<%if(second != null) {
session.invalidate();
} %>


<!-- ログアウトページ-->

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
		<title>【ログアウトページ】</title>
	</head>
		<body>
			<h1 style="text-align:center">ログアウトページ</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<div class="check">
				<p>【アプリを閉じる前に】</p>
				<p>・ログイン時に行った端末の設定設定変更を元に戻してください。</p>
			</div>
			<p style="color:red;">ご利用ありがとうございました</p>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/Userctl">再ログイン</a></p>
		</body>
</html>


