<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
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
	Username: <%= session.getAttribute("uname") %>
	<br><br>
	Welcome user!!!
	<br><br>
	<a href="videos.jsp">Go to Videos</a>
	<br><br>
	<a href="about.jsp">About</a>
	<br><br>
	<form action="logout" >
		<button type="submit">Logout</button>
	</form>
</body>
</html>