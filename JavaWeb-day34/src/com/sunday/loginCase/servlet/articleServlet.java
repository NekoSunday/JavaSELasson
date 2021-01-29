package com.sunday.loginCase.servlet;


import com.sunday.loginCase.entity.Article;
import com.sunday.loginCase.service.ArticleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/article")
public class articleServlet extends HttpServlet {

    private ArticleService articleService=new ArticleService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Article> articleList=articleService.findAllArticle();

        req.setAttribute("articleList",articleList);

        req.getRequestDispatcher("/article.jsp").forward(req,resp);

    }
}
