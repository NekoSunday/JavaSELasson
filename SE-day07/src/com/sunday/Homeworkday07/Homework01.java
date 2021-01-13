package com.sunday.Homeworkday07;

public class Homework01 {
    public static void main(String[] args) {
        String str1="你好";
        String str2=new String("hello");
        char[] ch1={'a','b','c','d','e'};
        String str3=new String(ch1);

        System.out.println("方式一创建的字符串："+str1);
        System.out.println("方式二创建的字符串："+str2);
        System.out.println("方式三创建的字符串："+str3);
    }
}
