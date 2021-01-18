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

    }
}
