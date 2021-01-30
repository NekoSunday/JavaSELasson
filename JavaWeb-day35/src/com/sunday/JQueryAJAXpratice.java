package com.sunday;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/demo01")
public class JQueryAJAXpratice extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ("0".equals(req.getParameter("flag"))) {
            // 模拟异常
            int i = 1 / 0;
        }

        String method = req.getMethod();

        resp.setContentType("text/html;charset=utf8");
        resp.getWriter().println("请求成功！请求的方式： " + method + "");
        Map<String, String[]> parameterMap = req.getParameterMap();

        for (String key : parameterMap.keySet()) {
            resp.getWriter().println("key: " + key + "---> val: " + Arrays.toString(parameterMap.get(key)));
        }
    }
}
