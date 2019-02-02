<%--
  Created by IntelliJ IDEA.
  User: Nicolas
  Date: 17/1/2019
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Users</title>
  <link rel="stylesheet" href="<c:url value="/resources/css/style.css"></c:url>">
  <script type="text/javascript" src="<c:url value="/resources/script/myscript.js"></c:url>"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
</head>
<input type="hidden" id="user_id">
Name: <input type="text" id="name" required="required" name="user_name"><br>
Email: <input type="email" id="email" required="required" name="email"><br>
<button onclick="submit();">Submit</button>

<table id="table" border=1>
  <tr> <th> Name </th> <th> Email </th> <th> Edit </th> <th> Delete </th> </tr>

</table>

<img src="<c:url value="/resources/img/5a2478742ce8d.jpeg"></c:url>"/>
</body>
</html>
