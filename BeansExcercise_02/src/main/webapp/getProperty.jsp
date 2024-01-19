<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>getproperty</title>
</head>
<body>
<jsp:useBean id="user" class = "demo.example.beans.User" scope="session"></jsp:useBean>
FirstName: <jsp:getProperty property="FirstName" name="user"/>
LastName: <jsp:getProperty property="LastName" name="user"/>
Values are updated..
</body>
</html>