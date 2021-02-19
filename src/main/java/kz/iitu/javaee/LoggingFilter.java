package kz.iitu.javaee;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out=servletResponse.getWriter();
        String username = servletRequest.getParameter("username");
        System.out.println(username);

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
