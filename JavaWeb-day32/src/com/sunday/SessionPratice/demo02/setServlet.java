package com.sunday.SessionPratice.demo02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/set")
public class setServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("username","zhangsan");

        String id = session.getId();

        Cookie cookie = new Cookie("JSESSIONID", id);

        cookie.setMaxAge(600);

        resp.addCookie(cookie);
    }
}
