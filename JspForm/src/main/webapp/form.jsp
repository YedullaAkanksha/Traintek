<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form action="submit.jsp" method="get">
<!-- <%= request.getContextPath() %>/Controller -->
Name:<input type="text" placeholder="name" name="name" required><br/>
Gender:<input type="radio" value="female" name="gender">Female
<input type="radio" value="male" name="gender">male<br/>
Age : <input type="number" value="age" name="age"><br/>
 <input type="submit">

</form>
</body>
</html>