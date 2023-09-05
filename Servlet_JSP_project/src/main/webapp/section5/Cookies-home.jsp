<html>

<body>
<h3>Training Portal</h3>

<!-- read the favorite programming language cookie -->
<%
	// the default ... if there are no cookies
	String favLang = "Java";

	// get the cookies from the browser request
	Cookie[] theCookies = request.getCookies();
	
	// find our favorite language cookie
	if (theCookies != null) {
		
		for (Cookie tempCookie : theCookies) {
			
			if ("myApp.favoriteLanguage".equals(tempCookie.getName())) {
				favLang = tempCookie.getValue();
				break;
			}
		}
	}
%>

<!-- now show a personalized page ... use the "favLang" variable -->

<!-- show new books for this lang -->
<h4>New Books for <%= favLang %></h4>
<ul>
	<li>.......................</li>
	<li>.......................</li>
</ul>

<h4>Latest News Reports for <%= favLang %></h4>
<ul>
	<li>..................</li>
	<li>..................</li>
</ul>
<hr>
<a href="Cookies.html">Personalize this page</a>
</body>

</html>










