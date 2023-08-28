<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Respone</title>
</head>
<body>
	<!-- shortcut way to print to  -->
	<p align="center">
		Welcome! @ ${param.name} <br />
	</p>
	<h4>
		<!--  a way to get the user details and print it on the screen -->
		The school name is :
		<%=request.getParameter("school")%>

	</h4>
	<h5>
		The gender is:
		<%=request.getParameter("gender")%>
	</h5>
	<h5>
		The Hobby is:
		<% String [] Hobby = request.getParameterValues("hobby");
		if(Hobby == null){
			out.print("please select a hobby");
		}
		else{
			
		for(String h:Hobby){
		out.print(h+",");
		}
		}
		%>
	</h5>
	
	<h3>
		The country of the user is :
		<%=request.getParameter("country")%>
	</h3>
</body>
</html>