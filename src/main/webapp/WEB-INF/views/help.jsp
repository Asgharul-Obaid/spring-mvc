<%@page import="java.sql.Time"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help Page</title>
</head>
<body>
<%
/* String name=(String)request.getAttribute("name");
Integer rollnumber=(Integer)request.getAttribute("rollnumber");
LocalDateTime time=(LocalDateTime)request.getAttribute("time"); */
%>

<h1>hello my name is
 <%-- <%=name %> --%>
 ${name }

 </h1>
<h1>this is help page </h1>
<h1>
my roll number is
 <%-- <%=rollnumber %> --%> 
 ${rollnumber }
</h1>

<h1>Date and time is <%-- <%=time %> --%>
${time }
</h1>

<hr>

<c:forEach var="item" items="${marks }">
<h1>${item }</h1>
</c:forEach>

</body>
</html>