package com.sunday.Jsoup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        Date date1 = new Date(0L);
//        System.out.println(date);
//        System.out.println(date1);
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        System.out.println(sdf.format(date));
//
//
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM日dd月");
//        System.out.println(sdf1.format(date));

        System.out.println("请输入出生日期 格式为YYYY年MM月dd日");
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine();
        //自定义格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date bDate=sdf.parse(nextLine);

        long time = date.getTime();
        long time1 = bDate.getTime();
        long sum=time-time1;

        System.out.println(sum/1000/60/60/24);
    }
}
