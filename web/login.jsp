<%--
  Created by IntelliJ IDEA.
  User: Ave
  Date: 24.02.2019
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Zaloguj się</h2>
<form action="LoginServlet" method="POST">
    Username <input type="text" name="username">
    <br />
    Password <input type="password" name="password">
    <br />
    |<input type="submit" value="Zaloguj">
</form>
</body>
</html>
