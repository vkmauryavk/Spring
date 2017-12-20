<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This is First JSP Page</title>
</head>
<body>
<h2>Login Page </h2>
<div>Here you Enter Name is :${name}</div>
<form action"/login.do" method="post">
<p style="color:red">${errormsg}</p>

Name :<input type="text" name="name" />
Name :<input type="password" name="password" />

<input type="submit" value="submit">


</form>
<!--Valid User -> Welcome.jsp  -->
<!--Valid User-> Login.jsp  -->

</body>
</html>