package com.sunday.demo01;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class getTest {
    @Test
    public void test01(){
        String html="<dl>\n" +
                "    <dt>帮助中心</dt>\n" +
                "    <dd><a href=\"\">账户管理</a></dd>\n" +
                "    <dd><a href=\"\">购物指南</a></dd>\n" +
                "    <dd><a href=\"\">订单操作</a></dd>\n" +
                "</dl>";
        Document p = Jsoup.parse(html);
        System.out.println(p);
    }

    @Test
    public void test02(){
        try {
            URL c = getTest.class.getResource("/computers.xml");
            System.out.println(c.getPath());
            File file = new File(c.getPath());
            Document doc = Jsoup.parse(file, "utf-8");
            System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03(){
        try {
            Connection c = Jsoup.connect("https://www.jd.com");
            Document doc = c.get();
            System.out.println(doc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test04(){
        try {
            URL c = getTest.class.getResource("/computers.xml");
            System.out.println(c.getPath());
            File file = new File(c.getPath());
            Document doc = Jsoup.parse(file, "utf-8");
            Elements allElements = doc.getAllElements();
            System.out.println(allElements);
            System.out.println("--------------------------");

            Element menu = doc.getElementById("computers");
            System.out.println(menu);
            System.out.println("--------------------------");

            Elements a = doc.getElementsByTag("价格");
            System.out.println(a);
            System.out.println("--------------------------");

            Elements clearFix = doc.getElementsByClass("navicat");
            System.out.println(clearFix);
            System.out.println("--------------------------");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
