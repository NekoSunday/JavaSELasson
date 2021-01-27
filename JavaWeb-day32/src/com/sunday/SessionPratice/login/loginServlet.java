package com.sunday.SessionPratice.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,String> user=new HashMap<>();

        user.put("admin","123");
        user.put("root","admin");
        user.put("zhangsan","147");

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");

        HttpSession session = req.getSession();
        String id = session.getId();
        String checkSessionID=null;
        String checkLoginname=null;
        if (req.getCookies()!=null){
            Cookie[] cookies = req.getCookies();
            for (Cookie cookie : cookies) {

                if (cookie.getName().equals("JSESSIONID")){
                    checkSessionID = cookie.getValue();
                }
                if (cookie.getName().equals("username")){
                    checkLoginname=cookie.getValue();
                }
            }
            if (checkLoginname!=null&&checkSessionID!=null) {
                if (session.getId().equals(checkSessionID)) {
                    session.setAttribute("loginUser", checkLoginname);
                    resp.sendRedirect(req.getContextPath() + "/welcome");
                    return;
                }
            }
        }

        resp.setContentType("text/html;charset=utf8");

        PrintWriter writer = resp.getWriter();

        if (!session.getAttribute("safeCode").equals(checkCode)){
            writer.write("验证码错误，请重新输入");
            writer.write("<a href='login.html'>重新登录</a>");
            return;
        }
        if (!user.containsKey(username)){
            writer.write("用户名或密码错误！");
            writer.write("<a href='login.html'>重新登录</a>");
            return;
        }
        if (!user.get(username).equals(password)){
            writer.write("用户名或密码错误！");
            writer.write("<a href='login.html'>重新登录</a>");
            return;
        }
        if (req.getParameter("check")!=null) {
            if (req.getParameter("check") .equals("on")) {
                Cookie nameCookie = new Cookie("username", username);
                Cookie passwordCookie = new Cookie("password", password);
                Cookie jsessionidCookie = new Cookie("JSESSIONID", id);
                nameCookie.setMaxAge(60 * 30);
                passwordCookie.setMaxAge(60 * 30);
                jsessionidCookie.setMaxAge(60 * 30);
                resp.addCookie(nameCookie);
                resp.addCookie(passwordCookie);
                resp.addCookie(jsessionidCookie);
                /*nameCookie.setPath("/login.html");
                passwordCookie.setPath("/login.html");
                jsessionidCookie.setPath("/login.html");*/
            }
        }
        session.setAttribute("loginUser",username);

        resp.sendRedirect(req.getContextPath()+"/welcome");
    }
}
