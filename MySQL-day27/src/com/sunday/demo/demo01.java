package com.sunday.demo;

import org.junit.Test;

import java.sql.*;

public class demo01 {
    @Test
    public void test01(){
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
            PreparedStatement ps = c.prepareStatement("select * from student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id=rs.getInt("id");
                String name=rs.getString("name");
                int english=rs.getInt("english");
                int chinese=rs.getInt("chinese");
                int math=rs.getInt("math");
                System.out.println(id+" "+name+" "+english+" "+chinese+" "+math);
            }
            rs.close();
            ps.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() throws Exception {
        Connection c=null;
        Statement stat=null;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");
            c.setAutoCommit(false);
            stat = c.createStatement();
            stat.executeUpdate("update student set english=70 where id=1");
//            int a=1/0;
            stat.executeUpdate("update student set math=91 where id=1");
            c.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            //出错则滚回
            c.rollback();
        }finally {
            //释放资源
            stat.close();
            c.close();
        }
    }
}
