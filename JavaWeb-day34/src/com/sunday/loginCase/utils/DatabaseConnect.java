package com.sunday.loginCase.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

public class DatabaseConnect {

    private static DataSource ds;

    public static DataSource getDs() {
        return ds;
    }

    static {
        try {
            Properties prop = new Properties();
            prop.load(DatabaseConnect.class.getResourceAsStream("/jdbc.properties"));
            ds= DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            return ds.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
