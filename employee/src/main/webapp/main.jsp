<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management System</title>
</head>
<body>
    <h1>Employee Management System</h1>
    
    <form action="EmployeeServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <input type="submit" name="action" value="Insert">
    </form>
    
    <hr>
    
    <h2>Employee List</h2>
    <table border="1">
        <tr>
           
            <th>Name</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
               
                <td><c:out value="${employee.name}" /></td>
                <td><c:out value="${employee.email}" /></td>
                <td>
                    <a href="EmployeeServlet?action=edit&id=${employee.id}">Edit</a> |
                    <a href="EmployeeServlet?action=delete&id=${employee.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
