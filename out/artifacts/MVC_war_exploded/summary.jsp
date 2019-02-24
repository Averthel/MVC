<%--
  Created by IntelliJ IDEA.
  User: Ave
  Date: 20.02.2019
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="pl.ave.model.CartItem" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Shopping summary</title>
</head>
<body>
<h2>Shopping list</h2>

<ol>
    <% List<CartItem> cart = (List<CartItem>) request.getAttribute("cart");
        for (CartItem item : cart) {
    %>
    <li>
        <%=
        String.format("%s, Cena oryginalna: %.2f, Cena po rabacie: %.2f",
                item.getProduct(), item.getOriginalPrice(), item.getDiscountPrice())
        %>
    </li>
    <%
        }
    %>
</ol>
<h2>Suma przed rabatem: <%= request.getAttribute("originalSum") %></h2>
<h2>Suma po rabaice: <%=  request.getAttribute("discountSum") %></h2>

</body>
</html>
