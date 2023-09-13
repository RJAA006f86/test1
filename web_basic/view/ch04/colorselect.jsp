<%@page contentType="text/html; charset=Shift_JIS"%>
<%
/*変数宣言*/
String userType = request.getParameter("userType");			/*グループ1、2を識別するパラメータを受信して保持する変数*/
String[] colorsBlue = {"mintcream","honeydew","lightcyan","cornflower","powderblue","lightskyblue","skyblue","aqua","aquamarine","cyan","richblue","cadetblue","azure","aliceblue","lavender","lightblue","lightsteelblue","turquoise","darkturquoise","mediumturquoise","deepskyblue","dodgerblue","royalblue","mediumslateblue","slateblue","darkslateblue","indigo","navy","richblue","cadetblue","cornflowerblue","steelblue","blue","mediumblue","darkblue","midnightblue"};
String[] colorsGreen = {"greenyellow","lightgreen","chartreuse","lawngreen","lime","yellowgreen","limegreen","seagreen","olivedrab","darkolivegreen","green","darkslategray","springgreen","mediumspringgreen","mediumaquamarine","darkseagreen","lightseagreen","mediumseagreen","teal","darkcyan","forestgreen","darkgreen","palegreen"};
String[] colorsRed ={"seashell","oldlace","cornsilk","papayawhip","bisque","moccasin","navajowhite","wheat","lightpink","violet","lightsalmon","salmon","palevioletred","lightcoral","orchid","mediumorchid","mediumpurple","copper","darkorchid","blueviolet","purple","red","darkbrown","darkred","lavenderblush","linen","antiquewhite","mistyrose","blanchedalmond","feldsper","peachpuff","pink","thistle","plum","darksalmon","rosybrown","hotpink","indianred","deeppink","magenta","fuchsia","mediumvioletred","darkviolet","darkmagenta","tomato","orangered","crimson","firebrick"};
String[] colorsYellow = {"lightyellow","lemonchiffon","khaki","burlywood","sandybrown","brass","darkgoldenrod","chocolate","olive","orange","yellow","saddlebrown","brown","beige","lightgoldenrodyellow","palegoldenrod","tan","coral","darkkhaki","goldenrod","peru","coolcopper","darkorange","gold","sienna","maroon"};
String[] colorsBlack = {"white","ghostwhite","whitesmoke","lightgrey","lightslategray","slategray","dimgray","black","ivory","snow","floralwhite","gainsboro","silver","darkgray","gray"};


/*色の選択肢を保持する配列	現時点では青系統しか作っていませんがこの仕組みにより色選択は簡単に増やすことができます*/
%>



<html>
	<head>
		<title>【カラー選択ページ】管理者用</title>
	</head>
		<h1 style="text-align:center">【カラー選択ページ】管理者用</h1>
		<hr style="height:3; background-color:#0000ff" />
		<h1>赤系統</h1>


				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count = 0;
			    for (int a = 0; a < colorsRed.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsRed.length-count) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsRed[count]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsRed[count]%>">sample</p><br>
			        <% count++;
			        } else if(count != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsRed[count]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsRed[count]%>">sample</p>
			        <% count++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsRed[count]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsRed[count]%>">sample</p>
			        <%count++;}
			      }
			    }%>
			    <p><input type="submit" value="送信する"></p>
				</form>
			<h1>青系統</h1>


				<!-- 配列から色を取り出しラジオボタンと共に１行につき10個出力、配列の要素数が10で割り切れなくても対応可
				 colorGroupという文字列の後にuserTypeを代入する形にすることによりこのページをグループ1、2いずれでも使えるようにしています
				 また、配列を追加しこの処理を使いまわすことで簡単にページを増設できます-->


				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count2 = 0;
			    for (int a = 0; a < colorsBlue.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsBlue.length-count2) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlue[count2]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlue[count2]%>">sample</p><br>
			        <% count2++;
			        } else if(count2 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlue[count2]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlue[count2]%>">sample</p>
			        <% count2++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlue[count2]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsBlue[count2]%>">sample</p>
			        <%count2++;}
			      }
			    }%>
			    <p><input type="submit" value="送信する"></p>
			    </form>
			    <h1>緑系統</h1>

				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count3 = 0;
			    for (int a = 0; a < colorsGreen.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsGreen.length-count3) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsGreen[count3]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsGreen[count3]%>">sample</p><br>
			        <% count3++;
			        } else if(count3 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsGreen[count3]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsGreen[count3]%>">sample</p>
			        <% count3++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsGreen[count3]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsGreen[count3]%>">sample</p>
			        <%count3++;}
			      }
			    }%>
			    <p><input type="submit" value="送信する"></p>
				</form>
						<h1>黄系統</h1>


				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count4 = 0;
			    for (int a = 0; a < colorsYellow.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsYellow.length-count4) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsYellow[count4]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsYellow[count4]%>">sample</p><br>
			        <% count4++;
			        } else if(count4 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsYellow[count4]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsYellow[count4]%>">sample</p>
			        <% count4++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsYellow[count4]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsYellow[count4]%>">sample</p>
			        <%count4++;}
			      }
			    }%>
			    <p><input type="submit" value="送信する"></p>
				</form>
				<h1>黒系統</h1>
				<form action="<%=request.getContextPath()%>/Admin" method="get">
				<%
				int count5 = 0;
			    for (int a = 0; a < colorsYellow.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsBlack.length-count5) == 0) {
			          break;
			        } else if(i == 9) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlack[count5]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlack[count5]%>">sample</p><br>
			        <% count5++;
			        } else if(count5 != 0) {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlack[count5]%>"><p style="width:100px;display:inline-block; background-color:<%=colorsBlack[count5]%>">sample</p>
			        <% count5++;
			        } else {%>
			        <input type="radio" name="colorGroup<%= userType%>" value="<%=colorsBlack[count5]%>"checked><p style="width:100px;display:inline-block; background-color:<%=colorsBlack[count5]%>">sample</p>
			        <%count5++;}
			      }
			    }%>
			    <p><input type="submit" value="送信する"></p>
				</form>

</html>