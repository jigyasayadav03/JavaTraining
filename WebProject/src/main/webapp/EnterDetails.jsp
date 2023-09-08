<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creatinguserdetails</title>
</head>
<body>
<h3>Enter your Details</h3>
<form method="post" action="insert"> 
<table align="center" cellpadding = "10">
 
<!----- First Name ---------------------------------------------------------->
<tr>
<td>FIRST NAME</td>
<td><input type="text" name="First_Name" maxlength="30"/>
</td>
</tr>
 
<!----- Father Name ---------------------------------------------------------->
<tr>
<td>FATHER NAME</td>
<td><input type="text" name="Father_Name" maxlength="30"/>
</td>
</tr>
 
<!----- Email Id ---------------------------------------------------------->
<tr>
<td>EMAIL ID</td>
<td><input type="text" name="Email_Id" maxlength="100" /></td>
</tr>
<!----- Mobile Number ---------------------------------------------------------->
<tr>
<td>CONTACT</td>
<td>
<input type="text" name="Contact" maxlength="10" />
</td>
</tr>
<!----- Address ---------------------------------------------------------->
<tr>
<td>ADDRESS <br /><br /><br /></td>
<td><textarea name="Address" rows="4" cols="30"></textarea></td>
</tr>
<!----- Submit and Reset ------------------------------------------------->
<tr>
<td colspan="2" align="center">
<input type="submit" value="Submit">
<input type="reset" value="Reset">
<button> <a href="delete_user_form.jsp"> Want to delete </a></button>
</td>
</tr>
</table>
</form>
</body>
</html>