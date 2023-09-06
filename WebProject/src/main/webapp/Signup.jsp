<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registration Form</title>
</head>
<body>
    <form action="RegistrationServlet" method="post">
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" ></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" required></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td>Want to Register</td>
                <td><input type="submit" value="Register" ></td>
            </tr>
        </table>
    </form>
</body>
</html>
