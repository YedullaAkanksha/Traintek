<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome Page</title>
</head>
<body>
<%
String Name=null,sessionId=null;
if(request.getSession().getAttribute("Name")==null){
	response.sendRedirect("Home.jsp");
}else{
	Name=request.getSession().getAttribute("Name").toString();
	sessionId=request.getSession().getId();
}
%>
<h2>Authentication successful</h2>
Name: <%=Name %>
SessionID: <%=sessionId %>
<form action="<%=request.getContextPath() %>/MembersController" method="get">
<input type="hidden" name='action' value="destroy">
<input type="submit" value="logout"></form>
</body>
</html>