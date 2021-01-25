package com.sunday.demo06;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * 使用浏览器下载文件的方式
 *
 * web端为download.html作为参考
 */

@WebServlet("/demo06")
public class demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取提交的文件名
        String filename = req.getParameter("filename");

        //设置响应头，并对汉字进行编码，解码过程为浏览器自动做
        resp.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode(filename,"utf8"));
        //获取文件的输入流
        InputStream is = getServletContext().getResourceAsStream("/WEB-INF/" + filename);
        //获得输出流
        ServletOutputStream os = resp.getOutputStream();

        //往客户端写数据
        byte[] bytes = new byte[1024];

        int len;

        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
    }
}
