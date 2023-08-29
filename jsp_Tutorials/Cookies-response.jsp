<html>

<head>
<title>Confirmation</title>
</head>

<%
// reading  the  form data
String favLang = request.getParameter("favoriteLanguage");

// creating a new cookie
Cookie theCookie = new Cookie("myApp.favoriteLanguage", favLang);

// set the life time of the cookie by using setmax AGE FUNCTION
theCookie.setMaxAge(60 * 60 * 24 * 365); // <-- for one year

// sends cookie to browser
response.addCookie(theCookie);
%>
<body>
	<br />
	<br />

	<a href="Cookies-home.jsp">Return to homepage.</a>

</body>

</html>







