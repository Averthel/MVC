<%--
  Created by IntelliJ IDEA.
  User: Ave
  Date: 24.02.2019
  Time: 19:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello in admin panel!</h2>
<h3>Your IP adress: <%=request.getRemoteAddr() %></h3>
<a href="LogoutServlet">Logout</a>

</body>
</html>
