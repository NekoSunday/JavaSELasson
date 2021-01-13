package com.sunday.HomeWorkday11.HomeWork02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork0201 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生日期：   格式为：yyyy年MM月dd日");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sdf.parse(next);
//        Date date=new Date(next);
        long time = parse.getTime();
        long nowTime=System.currentTimeMillis();
        long live=nowTime-time;
        long day=live/1000/60/60/24;
        if (live<0){
            System.out.println("输入日期异常");
        }else{
            System.out.println("你活了"+day+"天");
        }
    }
}
