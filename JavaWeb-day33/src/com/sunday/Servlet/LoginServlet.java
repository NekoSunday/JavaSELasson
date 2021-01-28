package com.sunday.Servlet;


import com.sunday.Class.User;
import com.sunday.Class.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService us=new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkCode = req.getParameter("checkCode");

        HttpSession session = req.getSession();
        if (!checkCode.equals(session.getAttribute("safeCode"))){
            req.setAttribute("error","验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        User user=us.findByUsername(username);

        if (user==null){
            req.setAttribute("error","用户不存在");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
            return;
        }
        if (!password.equals(user.getPassword())){
            req.setAttribute("error","密码错误");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
            return;
        }
        session.setAttribute("loginUser",user);

        resp.sendRedirect(req.getContextPath()+"/list");

    }
}
