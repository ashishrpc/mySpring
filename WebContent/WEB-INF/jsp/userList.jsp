<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User List</title>
</head>
<body>
 <h2>User List</h2>
 <table border="1" cellpadding="1" cellspacing="1">
 <thead>
 <tr><th>ID</th><th>Age</th><th>Name</th><th>Delete</th></tr>
 </thead>
 <c:forEach items="${userList}" var="student"  >
 <tr>
 <td><a href="getUser?id=${student.id}">${student.id }</a></td><td>${student.age }</td><td>${student.name }</td><td><a href="delete?id=${student.id }">Delete</a></td>
 </tr>
 
 </c:forEach>
 </table>
 <br>
 <a href="newUser">New User</a>
</body>
</html>