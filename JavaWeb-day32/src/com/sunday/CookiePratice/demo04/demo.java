package com.sunday.CookiePratice.demo04;

import com.sunday.CookiePratice.utils.cookieUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/demo04")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");

        PrintWriter writer = resp.getWriter();

        String visited = cookieUtils.getCookieValue(req, "visited");

        String now = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());

        if (visited==null){
            writer.write("欢迎访问，现在的时间是"+now);
        }else{
            visited= URLDecoder.decode(visited,"utf8");
            writer.write("上次访问时间是"+visited);
            writer.write("上次访问时间是"+now);

            now= URLEncoder.encode(now,"utf8");

            Cookie cookie = new Cookie("visited", now);

            cookie.setMaxAge(60*60*24*30);

            resp.addCookie(cookie);
        }
    }
}
