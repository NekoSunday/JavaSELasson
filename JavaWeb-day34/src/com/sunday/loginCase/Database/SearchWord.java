package com.sunday.loginCase.Database;

import com.sunday.loginCase.utils.DatabaseConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchWord {

    public List<String> getAllWord() {
        try {
            Connection connection = DatabaseConnect.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from words");
            List<String> wordList=new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                wordList.add(rs.getString("word"));
            }
            return wordList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
