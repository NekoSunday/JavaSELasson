package com.sunday;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 莫志鹏
 * @version 1.0
 * @date 2021/1/21 15:50
 */
public class Test05{
    static int i = 0;
    @Test
    public void test() throws IOException, XpathSyntaxErrorException {
        //获取爬取网页的链接
        Connection connect = Jsoup.connect("https://www.bqg5.cc/1_1273/");
        //得到一个链接封装成
        Document document = connect.get();
        //得到整部小说文章的链接  查看网页结构。
        Elements select = document.select(".box_con dd a");
        System.out.println(select);
        //将爬取到的每一个网址的链接 写入到ArrayList中 遍历集合获取链接，写入到集合中
        ArrayList<String> list = new ArrayList<>();
        for (Element element : select) {
            String lianjie = element.attr("href");
            list.add(lianjie);
        }
        for (String s : list) {
            try {
                Thread.sleep(1000);
                Connection connect1 = Jsoup.connect("https://www.bqg5.cc"+s);
                getData(connect1);//调用方法 获取数据写入到文件中
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param connect 可变参数
     * @throws IOException 抛出异常
     */
    private void getData(Connection... connect) throws IOException {
        //有多少个网页链接 就有多少个链接对象
        int index = connect.length;
        for (int i1 = 0; i1 < index; i1++) {
            //文件存放路径
            File file = new File("C:\\Users\\Sunday\\Desktop\\book1.txt");
            //bufferwriter写出流  可追加
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            //链接对象
            Document document = connect[i1].get();
            //筛选内容
            Elements select = document.select("#content p");
            //文件第一行 写第几章
            bufferedWriter.write("\t\t\t\t\t\t\t\t\t\t\t\t第" + i++ + "章");
            //写出换行
            bufferedWriter.newLine();
            //StringBuffer
            StringBuffer stringBuffer = new StringBuffer();
            for (Element element : select) {
                stringBuffer.append(element.text()).append("\r\n");//写入换行
            }
            bufferedWriter.write(stringBuffer.toString());//写入缓冲区
            bufferedWriter.flush();//刷新
        }
    }
}
