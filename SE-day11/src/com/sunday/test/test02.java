package com.sunday.test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        demo();
    }

    private static void demo() {

        System.out.println("请输入经过几个月后：");
        Scanner sc=new Scanner(System.in);
        int months = sc.nextInt();
        int bigRabbit=0;
        int smallRabbit=1;
        int sum=0;

        for (int i = 0; i < months; i++) {
            bigRabbit=smallRabbit;
            smallRabbit=sum;
            sum=bigRabbit+smallRabbit;
        }
        System.out.println("兔子经过"+months+"个月后，数量为："+sum);
    }
}
