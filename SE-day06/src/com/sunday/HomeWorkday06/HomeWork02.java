package com.sunday.HomeWorkday06;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        threeNum();
    }

    public static Scanner scannerNum(){
        return new Scanner(System.in);
    }

    public static void threeNum(){
        System.out.println("请输入第一个数：");
        Scanner num1=scannerNum();
        int a = num1.nextInt();
        System.out.println("请输入第二个数：");
        Scanner num2=scannerNum();
        int b = num2.nextInt();
        System.out.println("请输入第三个数：");
        Scanner num3=scannerNum();
        int c = num3.nextInt();
        if (a>b&&a>c){
            System.out.println("三个数最大值为："+a);
        }else if (a<b&&b>c){
            System.out.println("三个数最大值为："+b);
        }else{
            System.out.println("三个数最大值为："+c);
        }
    }
}
