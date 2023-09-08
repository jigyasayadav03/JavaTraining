<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<div align="center">
    <h1> Login Form</h1>
    <form action="LoginServlet" method="post">
        <table style="width: 100%">
            <tr>
                <td>UserName</td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password" /></td>
            </tr>
        </table>
        
        <input type="submit" value="Submit" />
    </form>
     <button onclick= "location.href= delete_user_form.jsp"> Want to delete </button>
        <button onclick="location.href = update_user_form.jsp"> Want to update </button>
       
    <% String errorMessage = (String)request.getAttribute("error_message");
    if (errorMessage != null) { %>
    <p><%= errorMessage %></p>
    <% } %>
</div>
</body>
</html>
