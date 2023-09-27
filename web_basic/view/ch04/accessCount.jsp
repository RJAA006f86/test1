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


<!-- アクセスカウントページ-->

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
		<title>【アクセスカウントページ】</title>
	</head>
		<body>
			<h1 style="text-align:center">アクセスカウントページ</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<div class="count">
				<p>【グループ1】<%=group1Count%>人</p>
				<p>【グループ2】<%=group2Count%>人</p>
			</div>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/view/ch04/accessCount.jsp">再読み込み</a></p>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/Userctl?countReset=True">人数カウントリセット</a></p>
			<p style="color:blue;"><a href="<%=request.getContextPath()%>/Admin">表示色設定ページ</a></p>
		</body>
</html>


