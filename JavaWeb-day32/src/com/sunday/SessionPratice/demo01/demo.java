package com.sunday.SessionPratice.demo01;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

@WebServlet("/demo05")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf8");
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();

        writer.write("会话ID："+session.getId()+"<hr>");
        writer.write("会话创建时间为："+new Timestamp(session.getCreationTime())+"<hr>");
        writer.write("上次询问时间："+new Timestamp(session.getLastAccessedTime())+"<hr>");
        writer.write("是否为新的会话："+session.isNew()+"<hr>");
        writer.write("上下文对象是："+session.getServletContext()+"<hr>");
    }
}
