package com.sunday.loginCase.service;

import com.sunday.loginCase.Database.SearchArticle;
import com.sunday.loginCase.entity.Article;

import java.util.List;

public class ArticleService {

    private SearchArticle searchArticle=new SearchArticle();


    public List<Article> findAllArticle() {
        return searchArticle.findAllArticle();
    }

    public void add(Article article) {
        SearchArticle.add(article);
    }
}
