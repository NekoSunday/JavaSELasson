package com.sunday.loginCase.entity;

import java.util.Date;

public class Article {
    private Integer articleId;
    private String title;
    private String content;
    private Date publishDate;
    private String publishUser;
    private Integer userId;

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishDate=" + publishDate +
                ", publishUser='" + publishUser + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getPublishUser() {
        return publishUser;
    }

    public void setPublishUser(String publishUser) {
        this.publishUser = publishUser;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Article() {
    }

    public Article(Integer articleId, String title, String content, Date publishDate, String publishUser, Integer userId) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
        this.publishUser = publishUser;
        this.userId = userId;
    }
}
