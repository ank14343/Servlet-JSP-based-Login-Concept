<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Videos</title>
</head>
<body>

	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	
	You're logged in!
	<br><br>
	Username: ${uname}
	<br><br>
	Your videos are here.
	<br><br>
	<a href="welcome.jsp">Go to Welcome</a>
	<br><br>
	<a href="about.jsp">About</a>
	<br><br>
	<form action="logout" >
		<button type="submit">Logout</button>
	</form>
</body>
</html>