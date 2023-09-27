<%@page contentType="text/html; charset=Shift_JIS"%>

<%
String userType = (String)request.getAttribute("userType");  /* ユーザーが選択したグループを示す変数*/
String message = (String)request.getAttribute("message");    /* 注意事項の確認未実施時のメッセージ用の変数*/
String confirm = (String)request.getAttribute("confirm");/* 注意事項確認を行ったか否かを管理する変数*/
String second = (String)session.getAttribute("second");
%>



<!-- ユーザーがグループ選択と注意事項の確認を行うJSP -->

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
		<title>【グループ選択ページ】</title>
	</head>
	<meta http-equiv="Pragma" content="no-cache">
	<meta http-equiv="Cache-Control" content="no-cache">
	<%if(second != null) {%>
	<meta http-equiv="refresh" content="3; URL=<%=request.getContextPath()%>/view/ch04/logout.jsp">
	<%} %>
	<body>
			<h1 style="text-align:center">グループ選択ページ</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>


			<!-- 2つのプルダウンの選択結果により表示変更。またいいえを選択した場合選択でもグループは保持される
			 -->



			<form action="<%=request.getContextPath()%>/Userctl" method="get">
			<!-- グループ選択のプルダウン-->
				<SELECT name="userType">
					<%if(confirm == null) {%>
					<OPTION value="1" selected>
					グループ1
					</OPTION>
					<OPTION value="2">
					グループ2
					</OPTION>
					<%} else if((confirm.equals("False")&&userType.equals("1"))){%>
					<OPTION value="<%= userType%>" selected>
					グループ<%= userType%>
					</OPTION>
					<OPTION value="2">
					グループ2
					</OPTION>
					<%} else if((confirm.equals("False")&&userType.equals("2"))){%>
					<OPTION value="<%= userType%>" selected>
					グループ<%= userType%>
					</OPTION>
					<OPTION value="1">
					グループ1
					</OPTION>
					<%}%>
				</SELECT>
				<div class="check">
				<p>【注意事項】</p>
				<p>・画面の輝度、スクリーンセーバーなどは使用状況に応じて設定変更を行ってください。</p>
				<p>・揺らすと動作するアプリがある場合は終了または設定変更を行ってください。</p>
				<p>・使用時は周囲の人やものに注意してください。</p>
				</div>
				<br>
				<!-- 条件分岐。ユーザーがいいえを選択した場合、サーブレットから返されたパラメータにより
				注意事項確認の文字が赤に-->

				<% if(message != null) {%>
				<p style="color:red;">注意事項確認
				</p>
				<%} else{ %>
				<p>注意事項確認
				</p>
				<%} %>
				<!-- 注意事項確認のプルダウン-->
				<SELECT name="confirm">
					<OPTION value="False">
					いいえ
					</OPTION>
					<OPTION value="True">
					はい
					</OPTION>
				</SELECT>
				<!-- 条件分岐。ユーザーがいいえを選択した場合、サーブレットから返されたパラメータにより
				注意事項確認を促すメッセージが表示される-->
				<% if(message != null) {%>
				<p style="color:red"class = "Warning"><%=message %></p>
				<%} %>
				<br>
				<input type="submit" value="送信">
				</form>
	</body>
</html>