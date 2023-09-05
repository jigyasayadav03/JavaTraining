<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Declaration</title>
</head>
<body>
<%!
	String makeItLower(String data) {
		return data.toLowerCase();
	}
%>
<%!
	String makeItUpper(String data) {
		return data.toUpperCase();
	}
%>
<br/>
Upper Case is <%= makeItUpper("jigyasa") %>
<br/>
Lower case "Hello World": <%= makeItLower("Hello World") %>
<br/>
<%= makeItLower("JIGyaSa") %>
<br/>
</body>
</html>