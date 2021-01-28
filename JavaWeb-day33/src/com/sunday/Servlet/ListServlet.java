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
import java.util.List;

@WebServlet("/list")
public class ListServlet  extends HttpServlet {
    private UserService us=new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object loginUser = session.getAttribute("loginUser");

        if (loginUser==null){
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
            return;
        }
        List<User> userList=us.findAll();
        req.setAttribute("userList",userList);

        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }
}
