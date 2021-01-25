package com.sunday.demo04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;


@WebServlet("/demo04")
public class demo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        resp.setContentType("text/html;charset=utf8");
        PrintWriter writer = resp.getWriter();
        writer.write("得到用户名"+req.getParameter("name")+"<hr>");
        String[] hobbies=req.getParameterValues("hobby");
        writer.write("爱好是："+ Arrays.toString(hobbies)+"<hr>");

        Map<String, String[]> map = req.getParameterMap();
        Set<Map.Entry<String, String[]>> entrySet = map.entrySet();
        for (Map.Entry<String, String[]> entry : entrySet) {
            writer.write(entry.getKey()+"=="+Arrays.toString(entry.getValue())+"<hr>");
        }

    }

}
