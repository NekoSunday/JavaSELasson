package com.sunday.Database;

import com.sunday.Class.User;
import com.sunday.utils.ConnectDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetData {

    public User findByUsername(String username) {
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from user where username=?;");
            ps.setString(1,username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                int id = rs.getInt("id");
                String dbusername = rs.getString("username");
                String password = rs.getString("password");
                int gender = rs.getInt("gender");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                return new User(id,dbusername,password,gender,age,address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<User> findAll() {
        try {
            Connection connection = ConnectDatabase.getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from user");
            ResultSet rs = ps.executeQuery();
            List<User> list = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String dbusername = rs.getString("username");
                String password = rs.getString("password");
                int gender = rs.getInt("gender");
                int age = rs.getInt("age");
                String address = rs.getString("address");
                list.add(new User(id,dbusername,password,gender,age,address));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
