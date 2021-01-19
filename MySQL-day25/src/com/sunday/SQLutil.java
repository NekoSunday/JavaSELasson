package com.sunday;

import java.sql.*;
import java.util.Arrays;

public class SQLutil {
    public static Statement connectMyqsl(String url,String user,String password){
        try {
            Connection c = DriverManager.getConnection(url, user, password);
            return c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void insertValue(Statement stmt,int valuesNum,String... enterValues){
        try {
            StringBuilder sql= new StringBuilder("insert into test values\n");
            sql.append("(");
            for (int i = 0; i < valuesNum; i++) {
                if (enterValues[i].equals("null")){
                    sql.append(enterValues[i]).append(",");
                    i++;
                }
                if (i==(valuesNum-1)){
                    sql.append("'").append(enterValues[i]).append("'");
                }else {
                    sql.append("'").append(enterValues[i]).append("',");
                }

            }
            sql.append(");");
            stmt.executeUpdate(sql.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteValue(Statement stmt,String table,String requirement){
        try {
            String sql="delete from "+table+" where "+requirement;
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectValue(Statement stmt,String table,String... needValues){
        try {
            ResultSet rs = stmt.executeQuery("SELECT "+ Arrays.toString(needValues) +" FROM "+table);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                Date birthday = rs.getDate("birthday");
                String address = rs.getString("address");


                System.out.println("id: " + id);
                System.out.println("name: " + name);
                System.out.println("gender: " + gender);
                System.out.println("birthday: " + birthday);
                System.out.println("address: " + address);
                System.out.println("-----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection c, Statement stmt, ResultSet rs){
        try {
            if (rs!=null){
                rs.close();
            }
            if (stmt!=null){
                stmt.close();
            }
            if (c!=null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection c, Statement stmt){
        try {
            if (stmt!=null){
                stmt.close();
            }
            if (c!=null){
                c.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
