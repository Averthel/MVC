package pl.ave.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthenticationFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Auth filter");
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession(false);
        //użytkownik posiada aktywna sesję i jest zalogowany
        if(session != null && session.getAttribute("username") != null) {
            System.out.println("Session + user valid");
            chain.doFilter(httpRequest, response);
        } else {
            System.out.println("Session or user not valid");
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.sendRedirect("login.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
