package com.sunday;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class util {
    public static String enterStr() {
        return new Scanner(System.in).next();
    }

    public static void printEnterUser(){
        System.out.println("请输入用户名");
    }

    public static void printEnterPassword(){
        System.out.println("请输入密码");
    }

    public static void printEnterError(){
        System.out.println("用户名、密码输入错误");
    }

    public static void printEnterSelect(){
        System.out.println("请选择您的操作：");
    }
    public static void printOutAttention(){
        System.out.println("您可以进行如下操作：(输入编号即可)");
    }

    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Integer getIntegar(){
        String integarIndex = enterStr();
        return Integer.parseInt(integarIndex);
    }

    public static Double getDouble(){
        String doubleIndex= enterStr();
        return Double.parseDouble(doubleIndex);
    }
}
