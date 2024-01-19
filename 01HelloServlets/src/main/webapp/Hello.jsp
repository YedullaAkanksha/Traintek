<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp File</title>
</head>
<body>
<h1>Hello Jsp</h1>
<%!
String message(){
return "Hello" ;}%>
<%=message() %>
<!--  
<h2>FILES</h2>
<hr/>

<br/>

<Jsp:include page="index.html"/>
-->
</body>
</html>