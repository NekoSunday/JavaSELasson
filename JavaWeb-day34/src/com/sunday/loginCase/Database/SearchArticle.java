package com.sunday.loginCase.Database;

import com.sunday.loginCase.entity.Article;
import com.sunday.loginCase.utils.BlockUtils;
import com.sunday.loginCase.utils.DatabaseConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SearchArticle {

    private static List<String> wordList;
    static {
        SearchWord searchWord = new SearchWord();
        wordList=searchWord.getAllWord();
    }

    public static void add(Article article) {
        try {
            Connection connection = DatabaseConnect.getConnection();
            PreparedStatement ps = connection.prepareStatement("insert into article values (null,?,?,?,?,?);");
            ps.setString(1,article.getTitle());
            ps.setString(2,article.getContent());
            ps.setTimestamp(3, (Timestamp) article.getPublishDate());
            ps.setString(4,article.getPublishUser());
            ps.setInt(5,article.getUserId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Article> findAllArticle() {
        try {
            Connection connection = DatabaseConnect.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from article order by publish_date desc ");
            ResultSet rs = ps.executeQuery();
            List<Article> articleList=new ArrayList<>();
            while (rs.next()){
                articleList.add(new Article(
                        rs.getInt("id"),
                        block(rs.getString("title")),
                        block(rs.getString("content")),
                        rs.getTimestamp("publish_date"),
                        rs.getString("publish_user"),
                        rs.getInt("u_id")
                ));
            }
            return articleList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String block(String str){
        for (String word : wordList) {
            if (str.contains(word)){
                str=str.replaceAll(word, BlockUtils.wordBlock(word));
            }
        }
        return str;
    }
}
