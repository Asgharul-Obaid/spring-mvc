<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>${Header }</h1>
<p>${Desc }</p>

<p>${owner }</p>

<h1 style="color: green">${msg }</h1>

<h1>welcome: ${user.userName}</h1>
<h1>your email is: ${user.email }</h1>
<h1>password: ${user.password } try to secure your password</h1>

</body>
</html>

