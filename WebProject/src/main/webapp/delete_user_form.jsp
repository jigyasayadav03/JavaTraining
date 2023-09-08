<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

    <title>Delete User</title>
</head>
<body>
    <h3>Delete User</h3>
    <form method="post" action="DeleteUSerServlet">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required><br><br>
        <input type="submit" value="Delete">
    </form>
</body>
</html>
