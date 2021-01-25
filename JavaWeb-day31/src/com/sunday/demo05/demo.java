package com.sunday.demo05;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * 在客户端中浏览服务器的内容(并不是下载)
 *
 * 获取资源路径
 *
 * 内容被加载到浏览器中
 */

@WebServlet("/demo05")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();

        InputStream is = servletContext.getResourceAsStream("/WEB-INF/可莉.jpg");

        ServletOutputStream os = resp.getOutputStream();

        resp.setContentType("image/jpg");

        byte[] bytes = new byte[1024];

        int len;

        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

    }
}
