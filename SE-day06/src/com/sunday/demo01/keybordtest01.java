package com.sunday.demo01;

import java.util.Scanner;

public class keybordtest01 {
    public static void main(String[] args) {
        threeNum();
    }

    public static Scanner scannerNum(){
        return new Scanner(System.in);
    }

    public static void twoNum(){
        System.out.println("请输入第一个数：");
        Scanner num1=scannerNum();
        int Num1 = num1.nextInt();
        System.out.println("请输入第二个数：");
        Scanner num2=scannerNum();
        int Num2 = num2.nextInt();
        if (Num1>Num2){
            System.out.println("最大值为："+Num1);
        }else{
            System.out.println("最大值为："+Num2);
        }
    }

    public static void threeNum(){
        System.out.println("请输入第一个数：");
        Scanner num1=scannerNum();
        int Num1 = num1.nextInt();
        System.out.println("请输入第二个数：");
        Scanner num2=scannerNum();
        int Num2 = num2.nextInt();
        System.out.println("请输入第三个数：");
        Scanner num3=scannerNum();
        int Num3 = num3.nextInt();
        if (Num1>Num2&&Num1>Num3){
            System.out.println("最大值为："+Num1);
        }else if (Num1<Num2&&Num2>Num3){
            System.out.println("最大值为："+Num2);
        }else{
            System.out.println("最大值为："+Num3);
        }
    }
}
