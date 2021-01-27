package com.sunday.CookiePratice.demo03;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo03")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        resp.setContentType("text/html;charset=utf8");

        PrintWriter writer = resp.getWriter();
        if (cookies!=null){
            for (Cookie cookie : cookies) {
                writer.write(cookie.getName()+"------"+cookie.getValue());
                writer.write("<hr>");
            }
        }else{
            writer.write("没有cookie");
        }
    }
}
