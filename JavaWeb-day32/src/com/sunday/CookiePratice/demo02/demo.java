package com.sunday.CookiePratice.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo02")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("user", "zhangsan");
        cookie.setMaxAge(60*10);

        resp.addCookie(cookie);

        resp.setContentType("text/html;charset=utf8");

        PrintWriter writer = resp.getWriter();

        writer.write("写入了一个10分钟cookie");
    }
}
