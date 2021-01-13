package com.sunday.tcpPratice;

import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
//        TestScanner();
//        Test05();
//        NarcissisticNum();
//        getSum();
//        getSeven();
//        getRabbit();
//        getSum1();
//        getAtoZ();
        Test06();
    }

    public static void TestScanner() {
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("偶数");
            } else {
                System.out.println("奇数");
            }
        } else {
            System.out.println("请正确输入");
        }
    }

    public static void Test01() {
        int mons;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入月份");
        if (scan.hasNextInt()) {
            mons = scan.nextInt();
            if (mons == 12 || mons == 1 || mons == 2) {
                System.out.println("winter");
            } else if (mons == 3 || mons == 4 || mons == 5) {
                System.out.println("spring");
            } else if (mons == 6 || mons == 7 || mons == 8) {
                System.out.println("summer");
            } else if (mons == 9 || mons == 10 || mons == 11) {
                System.out.println("autumn");
            }
        }
    }

    public static void Test02() {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数");
        if (scan.hasNextInt()) {
            x = scan.nextInt();
            if (x >= 3) {
                y = 2 * x + 1;
                System.out.println(y);
            } else if (-1 <= x && x < 3) {
                y = 2 * x;
                System.out.println(y);
            } else if (x <= -1) {
                y = 2 * x - 1;
                System.out.println(y);
            }
        }
    }

    public static void Test03() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num % 6 == 0) {
                System.out.println("该数为6的倍数");
            } else {
                System.out.println("该数不为6的倍数");
            }
        } else {
            System.out.println("请正确输入");
        }
    }

    public static void Test04() {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
            if (num >= 90 && num <= 100) {
                System.out.println("优秀");
            } else if (num >= 80 && num < 90) {
                System.out.println("好");
            } else if (num >= 70 && num < 80) {
                System.out.println("良");
            } else if (num >= 60 && num < 70) {
                System.out.println("及格");
            } else if (num < 60) {
                System.out.println("不及格");
            } else {
                System.out.println("输入成绩错误");
            }
        }
    }

    //枚举
    enum color {
        yellow, green, red, grey;
    }

    //switch使用枚举作为判断标准
    public static void Test05() {
        color color = pratice.color.red;
        switch (color) {
            case red:
                color = pratice.color.green;
                break;
            case grey:
                color = pratice.color.yellow;
                break;
            case green:
                color = pratice.color.grey;
                break;
            case yellow:
                color = pratice.color.red;
                break;
        }
        //ordinal()为获取索引，values()为获取成员，values().length为枚举长度
        for (int i = 0; i < color.values().length; i++) {
            System.out.println("枚举输出为" + color.values()[i] + " 索引为" + color.values()[i].ordinal());
        }
    }

    public static void NarcissisticNum() {
        int bw;
        int sw;
        int gw;
//        for (int i = 100; i < 1000; i++) {
//            bw = i / 100;
//            sw = i % 100 / 10;
//            gw = i % 10;
//            if (((bw * bw * bw) + (sw * sw * sw) + (gw * gw * gw)) == i) {
//                System.out.println("水仙花数为：" + i);
//            }
//        }

//        int j = 100;
//        while (j < 1000) {
//            bw = j / 100;
//            sw = j % 100 / 10;
//            gw = j % 10;
//            if (((bw * bw * bw) + (sw * sw * sw) + (gw * gw * gw)) == j) {
//                System.out.println("水仙花数为：" + j);
//            }
//            j++;
//        }

        int k=100;
        do {
            bw = k / 100;
            sw = k % 100 / 10;
            gw = k % 10;
            if (((bw * bw * bw) + (sw * sw * sw) + (gw * gw * gw)) == k) {
                System.out.println("水仙花数为：" + k);
            }
            k++;
        }while (k<1000);
    }

    public static void getSum() {
        int oddSum = 0;
        int evenSum = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 != 0) {
//                oddSum += i;
//            } else {
//                evenSum += i;
//            }
//        }

//        int j = 0;
//        while (j < 100) {
//            if (j % 2 != 0) {
//                oddSum += j;
//            } else {
//                evenSum += j;
//            }
//            j++;
//        }

        int k =0;
        do {
            if (k% 2 != 0) {
                oddSum += k;
            } else {
                evenSum += k;
            }
            k++;
        }while (k<100);
        System.out.println("奇数和为：" + oddSum);
        System.out.println("偶数和为：" + evenSum);
    }

    public static void getSeven() {
        int Sum = 1;
//        for (int i = 1; i < 8; i++) {
//            Sum *= i;
//        }

//        int j = 1;
//        while (j < 8) {
//            Sum *= j;
//            j++;
//        }
        int k=1;
        do {
            Sum *= k;
            k++;
        }while (k<8);
        System.out.println("7的阶乘为：" + Sum);
    }

    public static void getRabbit() {
        int Sum = 1;
        int temp = 1;//小
        int temp2 = 0;//大
//        for (int i = 1; i < 21; i++) {
//            if (i > 1) {
//                temp2 = temp;
//                temp = Sum;
//                Sum = temp + temp2;
//            }
//        }

//        int j = 1;
//        while (j < 21) {
//            if (j > 1) {
//                temp2 = temp;
//                temp = Sum;
//                Sum = temp + temp2;
//            }
//            j++;
//        }

        int k=1;
        do {
            if (k > 1) {
                temp2 = temp;
                temp = Sum;
                Sum = temp + temp2;
            }
            k++;
        }while (k<21);
        System.out.println(Sum);
    }

    public static void getSum1() {
        int sum = 0;
//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0 || i % 7 == 0) {
//                sum += i;
//            }
//        }

//        int j=0;
//        while (j<100){
//            if (j % 3 == 0 || j % 7 == 0) {
//                sum += j;
//            }
//            j++;
//        }

        int k=0;
        do {
            if (k % 3 == 0 || k % 7 == 0) {
                sum += k;
            }
            k++;
        }while (k<100);
        System.out.println(sum);
    }

    public static void getAtoZ(){
        char ch='a';
//        int j=0;
//        while (j<26){
//            System.out.print(ch);
//            ch+=1;
//            j++;
//        }

        int k=0;
        do {
            System.out.print(ch);
            ch+=1;
            k++;
        }while (k<26);
    }


    public static void Test06(){
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            if (i%3==0||i%7==0){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);
    }
}
