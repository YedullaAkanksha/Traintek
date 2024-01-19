<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/SiteController" method="post">
Name: <input type='text' name="name"><br/>
Password: <input type="password" name="password"><br/>
<input type="hidden" name="action" value="authenticate">
<input type="submit" value="login" >
</form>
</body>
</html>