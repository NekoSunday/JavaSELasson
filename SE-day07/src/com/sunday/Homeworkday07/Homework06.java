package com.sunday.Homeworkday07;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        String mgc="奥巴马";
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String next = sc.nextLine();
        String replace = next.replace(mgc, "*");
        System.out.println(replace);
    }
}
