<%--
  Created by IntelliJ IDEA.
  User: ААА
  Date: 07.08.2022
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="/registration" method="post">
    <input type="name" name="firstName" placeholder="First Name">
    <input type="name" name="lastName" placeholder="Last Name">
    <input type="text" name="email" placeholder="Email">
    <input type="text" name="password" placeholder="Password">
    <button>Submit</button>
</form>
<p>${requestScope.registration}</p>
</body>
</html>
