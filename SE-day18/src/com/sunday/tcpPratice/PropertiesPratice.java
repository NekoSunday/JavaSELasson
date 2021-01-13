package com.sunday.tcpPratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesPratice {
    public static void main(String[] args) throws IOException {

        demo03();
    }

    private static void demo03() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("d:/aaa/e.properties");
        properties.load(fis);
        FileOutputStream fos = new FileOutputStream("d:/aaa/e.properties",true);
        properties.setProperty("length","789");
        properties.store(fos,null);
        fos.close();
        fis.close();
    }

    private static void demo02() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("d:/aaa/e.properties"));
        FileOutputStream fos = new FileOutputStream("d:/aaa/e.properties");
        properties.setProperty("filename","e.properties");
        properties.setProperty("length","60000");
        properties.setProperty("location","d:/aaa/e.properties");
        properties.store(fos,"enter");
        Set<String> strings = properties.stringPropertyNames();
        for (String s : strings) {
            System.out.println(s+"---"+properties.getProperty(s));
        }

        properties.setProperty("length","123123");
        fos.close();
    }

    private static void demo01() {
        Properties properties = new Properties();
        properties.setProperty("filename","e.properties");
        properties.setProperty("length","60000");
        properties.setProperty("location","d:/aaa/e.properties");
        System.out.println(properties);
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));

        Set<String> strings = properties.stringPropertyNames();

        for (String string : strings) {
            System.out.println(string+"---"+properties.getProperty(string));
        }
    }
}
