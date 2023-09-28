<%@page contentType="text/html; charset=Shift_JIS"%>

<%
/*変数宣言*/
String entry;				/*初回アクセスか判別するパラメータを代入する変数*/
String colorGroup1 = (String)session.getAttribute("colorGroup1");/*グループ1に割り振る色を保持する変数(セッションスコープに保持)*/
String colorGroup2 = (String)session.getAttribute("colorGroup2");/*グループ2に割り振る色を保持する変数(セッションスコープに保持)*/
entry = (String)request.getAttribute("entry");					/*初回アクセスか判別するパラメータを受信*/
if(entry == null){
	entry ="";
}
%>

<!--管理者がユーザーグループごとの表示色を設定するページを表示するJSP-->


<html>
	<head>
		<title>【表示色設定ページ】管理者用</title>
		</head>
		<body>
			<h1 style="text-align:center">表示色設定ページ</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<body>
					<form action="<%=request.getContextPath()%>/Admin" method="get">



						<!--初回アクセスかつグループ1の色を保持するパラメータがnull、またはグループ1の色を保持するパラメータがnull(グループ2の色が先に設定された時など)
						、グループ1の色を保持するパラメータの値がある場合の処理-->
						<p style="color:white;background-color:black;display:inline;">グループ1</p>
						<%if (colorGroup1 == null||(entry.equals("first")&&colorGroup1 == null)){%>
						<p style="width:250px;display:inline-block;background-color:white">デフォルト(ホワイト)</p>
						<%}else if(colorGroup1 != null){%>
						<p style="width:250px;display:inline-block;background-color:<%=colorGroup1%>;"><%=colorGroup1%></p>
						<%}%>
						<!-- グループ1のカラー選択ページへ -->
						<p style="display:inline-block"><a href= "<%=request.getContextPath()%>/view/ch04/colorselect.jsp?userType=1">表示色変更</a></p>
						<br>


						<!--初回アクセスかつグループ2の色を保持するパラメータがnull、またはグループ2の色を保持するパラメータがnull(グループ1の色が先に設定された時など)
						、グループ2の色を保持するパラメータの値がある場合の処理の処理-->
						<p style="color:white;background-color:black;display:inline;">グループ2</p>
						<%if (colorGroup2 == null||(entry.equals("first")&&colorGroup2 == null)) {%>
						<p style="width:250px;display:inline-block;background-color:white">デフォルト(ホワイト)</p>
						<%} else if(colorGroup2 != null){%>
						<p style="width:250px;display:inline-block;background-color:<%=colorGroup2%>;"><%=colorGroup2%></p>
						<%}%>
						<!-- グループ2のカラー選択ページへ -->
						<p style="display:inline-block"><a href= "<%=request.getContextPath()%>/view/ch04/colorselect.jsp?userType=2">表示色変更</a></p>
						<br>


						<!--上から
						グループ1、2の色が設定されていない場合
						グループ2だけ色が設定されていない場合
						グループ1だけ色が設定されていない場合
						グループ1、2共に色が設定されている場合-->
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
						<input type="submit" value="送信">
					</form>



					<!-- セッションスコープに保存されたグループ1、2の色選択情報をリセット -->
					<form action="<%=request.getContextPath()%>/Admin"method="get">
						<input type="hidden" name="reset" value="reset">
						<input type="submit" value="色選択リセット">
					</form>
					<!--アクセス数カウントページへ-->
					<form action="<%=request.getContextPath()%>/view/ch04/accessCount.jsp"method="get">
						<input type="submit" value="アクセス数カウント">
					</form>
			</body>
</html>