package pl.ave.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class IpRequestFilter implements Filter {

    private String ipPattern;

    public void init(FilterConfig fConfig) throws ServletException {
        ipPattern = fConfig.getInitParameter("ipPattern");
    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String requestIp = request.getRemoteAddr();
        System.out.println("Ip filter " + requestIp);
        if (requestIp.matches(ipPattern)) {
            System.out.println("IP ok");
            chain.doFilter(request, response);
        } else {
            System.out.println("IP not ok");
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.sendError(403);
        }
    }


    public void destroy() {

    }
}
