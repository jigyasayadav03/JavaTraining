<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scriplets</title>
</head>
<body>
Demo  for Scriplet tags 
<br/>
<%
for(int i=0;i<4;i++){
out.println("<br/>Hello user "+i);
}%>
<br/>

printing pyramid 
<br/>

<%
for(int i=0;i<5;i++){
for(int j=0;j<i;j++){
	out.println("*");
}
out.println("<br/> ");
}
%>


</body>
</html>