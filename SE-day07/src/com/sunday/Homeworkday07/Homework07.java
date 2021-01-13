package com.sunday.Homeworkday07;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个QQ号码:");
        String next = sc.next();
//        checkQQ(next);
        System.out.println("这个QQ号码是否正确：" +test(next));
    }

    public static void checkQQ(String qq) {
        boolean flag = false;
        if (!qq.startsWith("0")) {
            if (qq.length() >= 5 && qq.length() <= 12) {
                for (int i = 0; i < qq.length(); i++) {
                    if (qq.charAt(i) >= '0' && qq.charAt(i) <= '9') {
                        flag = true;
                    } else {
                       break;
                    }
                }
                System.out.println("这个QQ号码是否正确：" + flag);
            } else {
                System.out.println("这个QQ号码是否正确：" + flag);
            }
        } else {
            System.out.println("这个QQ号码是否正确：" + flag);
        }
    }
//*******************************************************
    public static boolean test(String str){
        if (str.length()<5||str.length()>12||str.startsWith("0"))
            return false;
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                return false;
            }
        }
        return true;
    }
}
