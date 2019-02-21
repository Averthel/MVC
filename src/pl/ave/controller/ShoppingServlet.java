package pl.ave.controller;

import pl.ave.model.CartItem;
import pl.ave.service.PaymentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/buy")
public class ShoppingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<CartItem> cart = createShoppingCart(request);
        PaymentService.applyDiscount(cart);
        double originalSum = PaymentService.totalPrice(cart);
        double discountSum = PaymentService.totalPriceAfterDiscount(cart);

        request.setAttribute("cart", cart);
        request.setAttribute("originalSum", originalSum);
        request.setAttribute("discountSum", discountSum);
        request.getRequestDispatcher("summary.jsp").forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    private List<CartItem> createShoppingCart(HttpServletRequest request){
        List<CartItem> cart = new ArrayList<>();
        String item1 = request.getParameter("item1");
        double price1 = Double.valueOf(request.getParameter("price1"));
        String item2 = request.getParameter("item2");
        double price2 = Double.valueOf(request.getParameter("price2"));
        String item3 = request.getParameter("item3");
        double price3 = Double.valueOf(request.getParameter("price3"));
        cart.add(new CartItem(item1, price1));
        cart.add(new CartItem(item2, price2));
        cart.add(new CartItem(item3, price3));
        return cart;

    }
}
