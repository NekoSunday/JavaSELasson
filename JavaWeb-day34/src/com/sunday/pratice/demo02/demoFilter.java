package com.sunday.pratice.demo02;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class demoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器中……");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器启动中……");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("过滤器返回中……");
    }

    @Override
    public void destroy() {
    }
}
