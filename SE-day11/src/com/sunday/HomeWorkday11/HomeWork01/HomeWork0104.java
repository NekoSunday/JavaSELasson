package com.sunday.HomeWorkday11.HomeWork01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork0104 {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的生日日期： 格式为yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = df.parse(next);
        System.out.println(parse);
    }
}
