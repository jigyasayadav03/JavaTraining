<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.*,com.jigyasa.Student"%>

<%
// just create some sample data ... normally provided by MVC
List<Student> data = new ArrayList<>();

data.add(new Student("Jigyasa", "yadav", false));
data.add(new Student("Roshan", "Patidar", false));
data.add(new Student("Harshit", "Ranawat", true));

pageContext.setAttribute("myStudents", data);
%>

<html>

<body>
	<p>Hello! here are getting a exciting discount if you are a gold
		memebership.</p>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gold Membership</th>
		</tr>

		<c:forEach var="tempStud" items="${myStudents}">

			<tr>
				<td>${tempStud.firstName}</td>
				<td>${tempStud.lastName}</td>
				<td><c:choose>


						<c:when test="${tempStud.goldCustomer}"> 
	
	YOU are getting a special discount on becoming a gold customer.
	
</c:when>
						<c:otherwise> 
	
	YOU are not getting any special discount.
</c:otherwise>
</c:choose> <!-- if jstl tag<c:if var="tempStud"  test="${tempStud.goldCustomer}"> 
	
	YOU are getting a special discount on becoming a gold customer.
	
</c:if>-->
</td>
			</tr>

		</c:forEach>

	</table>
	<br />
	<p> out tag
	      <c:out value = "${'<tag> , &'}"/>
	
	
	</body>

</html>











