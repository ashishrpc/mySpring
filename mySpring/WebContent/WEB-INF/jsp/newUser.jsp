<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New User</title>
</head>
<body>
 <h2>New User</h2>
 <form action="saveUser" method="post">
 <table border="1" cellpadding="1" cellspacing="1">
 <tr>
 <td>ID</td><td><input type="text" name="id" value=""></td>
 </tr>
 <tr>
 <td>Age</td><td><input type="text" name="age" value=""></td>
 </tr>
 <tr>
 <td>Name</td><td><input type="text" name="name" value=""></td>
 </tr>
 <tr>
 <td colspan="2"><input type="submit" value="Save"></td>
 </tr>
 </table>
 </form>
</body>
</html>