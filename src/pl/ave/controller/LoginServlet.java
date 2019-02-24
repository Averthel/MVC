package pl.ave.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 6543990060683430817L;

    private static final String USERNAME = "admin";
    private static final String PASS = "pass";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("LoginServlet doPost()");
        String userParam = request.getParameter("username");
        String userPass = request.getParameter("password");
        if (validate(userParam, userPass)) {
            request.getSession(true).setAttribute("username", userParam);
        }
        response.sendRedirect("admin.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public boolean validate(String username, String pass) {
        return USERNAME.equals(username) && PASS.equals(pass);
    }
}
