<%@page contentType="text/html; charset=Shift_JIS"%>


<!-- ロゴ表示ページ。この画面をサイリウムとして使用。-->


<html>
<style>
.page{
height: 1920px;
margin:500px auto 0px;
}
.page div{
height: 500px;
margin:500px auto 0px;
text-align:center
}

img{
width:430px;
height: auto;
margin:0px auto 0px;
}

</style>
	<head>
		<title>【ロゴ表示ページ】</title>
	</head>
<meta http-equiv="refresh" content="5; URL=<%=request.getContextPath()%>/Userctl">

<body>
<div class="page">
	<div >
  		<img src="<%=request.getContextPath()%>/img/logo2.png">
  	</div>
</div>
</body>
</html>


