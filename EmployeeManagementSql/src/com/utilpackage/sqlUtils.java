package com.utilpackage;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.sunday.MainSystem;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class sqlUtils {
    private static DataSource ds;

    static {
        try {
            Properties connectInfo = new Properties();
            InputStream is = sqlUtils.class.getResourceAsStream("/druid.properties");
            connectInfo.load(is);
            ds = DruidDataSourceFactory.createDataSource(connectInfo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        //关闭结果集
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //关闭语句对象
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //关闭连接对象
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, Statement stmt) {
        //关闭语句对象
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //关闭连接对象
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static String insertValue(String tableName,int valuesNum, String... enterValues) {
        try {
            StringBuilder sql = new StringBuilder("insert into "+tableName+" values\n");
            sql.append("(");
            for (int i = 0; i < valuesNum; i++) {
                if (enterValues[i].equals("null")) {
                    sql.append(enterValues[i]).append(",");
                    i++;
                }
                if (i == (valuesNum - 1)) {
                    sql.append("'").append(enterValues[i]).append("'");
                } else {
                    sql.append("'").append(enterValues[i]).append("',");
                }

            }
            sql.append(");");
            System.out.println(sql);
            return sql.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void printValues(String str){
        try {
            MainSystem.ps=MainSystem.system.prepareStatement(str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


