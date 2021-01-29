package com.sunday.loginCase.servlet;


import com.sunday.loginCase.entity.Article;
import com.sunday.loginCase.entity.User;
import com.sunday.loginCase.service.ArticleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

@WebServlet("/add")
public class addServlet extends HttpServlet {

    private ArticleService articleService=new ArticleService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String title = req.getParameter("title");
        String content = req.getParameter("content");

        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);

        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("loginUser");

        article.setPublishUser(user.getName());
        article.setPublishDate(new Timestamp(new Date().getTime()));
        article.setUserId(user.getId());

        articleService.add(article);

        resp.sendRedirect(req.getContextPath()+"/article");
    }
}
