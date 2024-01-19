<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>setProperty</title>
</head>
<body>
<jsp:useBean id="user" class = "demo.example.beans.User" scope="session"></jsp:useBean>
<jsp:getProperty property="FirstName" name="Akki"/>
<jsp:getProperty property="LastName" name="reddy"/>

</body>
</html>