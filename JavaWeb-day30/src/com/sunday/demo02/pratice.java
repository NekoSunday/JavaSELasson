package com.sunday.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo02")
public class pratice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        PrintWriter writer = resp.getWriter();
        writer.write("得到请求的方式:"+req.getMethod()+"<hr>");
        writer.write("得到URL的方式:"+req.getRequestURL()+"<hr>");
        writer.write("得到URI的方式:"+req.getRequestURI()+"<hr>");
        writer.write("得到协议和版本的方式:"+req.getProtocol()+"<hr>");
        writer.write("得到当前项目的访问地址:"+req.getContextPath()+"<hr>");
        writer.write("得到客户端的IP地址:"+req.getRemoteAddr()+"<hr>");
        writer.write("得到当前Servlet的访问地址:"+req.getServletPath()+"<hr>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
