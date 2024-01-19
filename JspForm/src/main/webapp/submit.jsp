<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello.!</title>
</head>
<body>
Name:<%= request.getParameter("name") %><br/>
Gender:<%= request.getParameter("gender") %><br/>
age:<%= request.getParameter("age") %><br/>

</body>
</html>