package com.sunday.SessionPratice.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Object user = session.getAttribute("loginUser");
        resp.setContentType("text/html;charset=utf8");

        PrintWriter writer = resp.getWriter();

        if (user!=null){
            writer.write("欢迎"+user);
            writer.println("<a href='logout'>注销</a>");
        }else {
            writer.write("没有登录");
            writer.println("<a href='login.html'>去登录</a>");
        }
    }
}
