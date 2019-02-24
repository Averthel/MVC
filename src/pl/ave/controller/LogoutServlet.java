package pl.ave.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
        if(request.getSession(false) != null){
            System.out.println("Logout");
            request.getSession().invalidate();
            response.sendRedirect("index.jsp");
        }else{
            System.out.println("No session found");
        }

    }
}
