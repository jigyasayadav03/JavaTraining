<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	  Welcome! <%= request.getAttribute("name") %>
	<p>You have successfully logged in!</p>
		<button type="submit">
			<a href="EnterDetails.jsp"> Enter your details </a>
		</button>

		<br> <br> <a href="main.html">Logout</a>
	</div>
</body>
</html>