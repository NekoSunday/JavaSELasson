package com.sunday.loginCase.Database;

import com.mysql.jdbc.JDBC4NClob;
import com.sunday.loginCase.entity.User;
import com.sunday.loginCase.utils.DatabaseConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchUser {
    public User findUser(String username) {
        try {
            Connection connection = DatabaseConnect.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from user where username=?;");
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return new User(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getInt("age")
                );
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
