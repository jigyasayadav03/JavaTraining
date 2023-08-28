<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BAsic</title>
</head>
<body>
<h3> Hello World!</h3>
<!--<jsp:include page="main.html"/>-->
The time on the server is <%= new java.util.Date()%>
<br/>
<br/>

Convert to Uppercase: <%= new String("jigyasa").toUpperCase()%>
<br/> 
<br/>

Multiplication of 25*6 is:  <%= 25*6 %>
<br/>
<br/>
is the number 45 greater than 34 <%= 45>34 %>


</body>
</html>