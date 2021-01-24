package com.sunday.demo01;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class Servlet3Pratice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        PrintWriter writer = resp.getWriter();
        writer.print("<h2>hello</h2>");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化了");
    }

    public Servlet3Pratice() {
        System.out.println("实例化了");
    }

    public ServletConfig getServletConfig(){
        return null;
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service调用了");
    }

    public String getServletInfo(){
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy调用了");
    }
}
