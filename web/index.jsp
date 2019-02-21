<%--
  Created by IntelliJ IDEA.
  User: Ave
  Date: 20.02.2019
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Shop</title>
  </head>
  <body>
      <h1>Welcome to the candy shop!</h1>

      <form action="buy" method="post">
        <input name="item1" placeholder="Product 1">
        <input name="price1" placeholder="Price 1">
        <br />
        <input name="item2" placeholder="Product 2">
        <input name="price2" placeholder="Price 2">
        <br />
        <input name="item3" placeholder="Product 3">
        <input name="price3" placeholder="Price 3">
        <br />
        <input type="submit" value="Buy it now">
      </form>

  </body>
</html>
