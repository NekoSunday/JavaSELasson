package com.sunday.loginCase.servlet;


import com.sunday.loginCase.entity.User;
import com.sunday.loginCase.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    private UserService userService=new UserService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user=userService.findUser(username);

        if (user==null){
            req.setAttribute("error","用户不存在");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }

        if (!password.equals(user.getPassword())){
            req.setAttribute("error","用户名或密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        HttpSession session = req.getSession();
        session.setAttribute("loginUser",user);
        resp.sendRedirect(req.getContextPath()+"/article");

    }
}
