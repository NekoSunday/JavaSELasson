package com.sunday;

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
}
