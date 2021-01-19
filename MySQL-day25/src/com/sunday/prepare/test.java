package com.sunday.prepare;


import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

    @Test
    public void test01(){
        try {
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","admin");
            System.out.println(c);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02(){
        try {
            Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","admin");
            Statement stmt = c.createStatement();
            System.out.println(stmt);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03(){
        Connection c=null;
        Statement stmt=null;
        try {
            c= DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","admin");
            stmt = c.createStatement();
            String sql="create table test(\n"+
                        "id int primary key auto_increment,\n"+
                        "name varchar(10) not null,\n"+
                        "gender char(1),\n"+
                        "birthday date,\n"+
                        "address varchar(30)\n"+
                        ");";
            boolean flag = stmt.execute(sql);
            System.out.println(flag);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (c!=null){
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test04(){
        try {
            Connection c=DriverManager.getConnection("jdbc:mysql:///homework","root","admin");
            Statement stmt = c.createStatement();
            String sql="insert into test values\n"+
                        "(null,'小明','男','2000-10-20','湖南永州'),\n"+
                        "(null,'小红','女','1998-08-24','福建南平'),\n"+
                        "(null,'小军','男','1997-06-18','四川泸州'),\n" +
                        "(null,'小聪','男','2001-10-21','贵州遵义');";
            int executeUpdate = stmt.executeUpdate(sql);
            System.out.println(executeUpdate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void test05(){
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql:///homework", "root", "admin");
            Statement stmt = c.createStatement();
            String sql="update test set name='明明', gender='女', birthday='1999-05-14', address='山东菏泽' where id=1";
            System.out.println(stmt.executeUpdate(sql));
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test06(){
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql:///homework", "root", "admin");
            Statement stmt = c.createStatement();
            String sql="delete from test where id=2";
            System.out.println(stmt.executeUpdate(sql));
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
