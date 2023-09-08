<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful Login</title>
</head>
<body>
	<div align="center">
		<h1>
			Welcome,
			<%=session.getAttribute("username")%></h1>
		<p>You have successfully logged in!</p>
		<button type="submit">
			<a href="EnterDetails.jsp"> Enter your details </a>
		</button>

		<br> <br> <a href="main.html">Logout</a>
	</div>
</body>
</html>
