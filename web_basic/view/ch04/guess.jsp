<%@page contentType="text/html; charset=Shift_JIS"%>
<%@page import="java.util.ArrayList,ch04.NumberInfo"%>
<%
String cmd = (String)request.getAttribute("cmd");
String message = (String)request.getAttribute("message");
ArrayList<NumberInfo> list =(ArrayList<NumberInfo>)session.getAttribute("list");
if(cmd == null){
	cmd = "first";
}
%>

<html>
	<head>
		<title>�������ăQ�[���i�Z�b�V����)</title>
	</head>
	<body>
		<div style="text-align:center">
			<h1 style="text-align:center">�������ăQ�[���i�Z�b�V�����Łj</h1>
			<hr style="height:3; background-color:#0000ff" />
			<br>
			<br>
			<br>
			<p style="text-align:center">0�`9�̐���������Ă�������</p>

			<%
			if(cmd.equals("end")){
			%>
				<input type="text">
				<input type="button" value="���M" disabled>
				<form action="<%=request.getContextPath()%>/GuessServlet">
					<input type="hidden" name="cmd" VALUE="first">
					<br>
					<input type="submit" value="������x����">
				</form>
			<%
			}
			else{
			%>
				<form action="<%=request.getContextPath()%>/GuessServlet">
					<input type="text" name="user_number">
					<input type="hidden" name="cmd" VALUE="game">
					<input type="submit" VALUE="���M">
				</form>
			<%
			}
			%>

			<br>

			<%
			if(message != null){
			%>
			<h3 style="text-align:center; color: red;"><%=message%></h3>
			<%
			}
			%>

			<h2 style="text-align:center">���茋��</h2>
			<table style="border: 1px solid; margin:0 auto;">
				<tr>
					<td style="border: 1px solid;">�����</td>
					<td style="border: 1px solid;">���͐���</td>
					<td style="border: 1px solid;">����</td>
				</tr>
				<%
				if(list != null){
					for(int i=0; i<list.size(); i++){
						NumberInfo objNumberInfo = list.get(i);
				%>
					<tr>
						<td style="border: 1px solid;"><%=i+1%>���</td>
						<td style="border: 1px solid;"><%=objNumberInfo.getUserNumber()%></td>
						<td style="border: 1px solid;"><%=objNumberInfo.getJudge()%></td>
					</tr>
				<%
					}
				}
				%>
			</table>
		</div>
	</body>
</html>