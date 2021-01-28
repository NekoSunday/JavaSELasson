package com.sunday.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectDatabase {
    public static DataSource getDs() {
        return ds;
    }

    private static DataSource ds;
    static {
        try {
            Properties prop = new Properties();
            InputStream is = ConnectDatabase.class.getResourceAsStream("/jdbc.properties");
            prop.load(is);
            ds= DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
