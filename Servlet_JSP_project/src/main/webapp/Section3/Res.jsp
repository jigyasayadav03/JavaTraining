<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
CLick here to Go to Google

	<form action="Res.jsp">

		<input type="submit" value="go"><br/>

	</form>
	<% 
response.sendRedirect("https://www.google.com/search?q=request+value+null&sca_esv=560591584&ei=1jDsZL24KZTq-AbD97qQCQ&ved=0ahUKEwi9-97hz_6AAxUUNd4KHcO7DpIQ4dUDCBA&uact=5&oq=request+value+null&gs_lp=Egxnd3Mtd2l6LXNlcnAiEnJlcXVlc3QgdmFsdWUgbnVsbDIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeMgYQABgWGB4yBhAAGBYYHjIGEAAYFhgeSJVdUL07WPNbcAF4AZABAJgB3gGgAc8UqgEGMC4xNS4zuAEDyAEA-AEBwgIKEAAYRxjWBBiwA8ICBxAAGIoFGEPCAgsQABiABBixAxiDAcICBRAAGIAEwgIIEAAYigUYkQLCAggQABiABBixA8ICBxAAGIAEGArCAggQABiKBRiGA8ICCBAAGBYYHhgP4gMEGAAgQYgGAZAGCA&sclient=gws-wiz-serp");

	%>

</body>
</html>