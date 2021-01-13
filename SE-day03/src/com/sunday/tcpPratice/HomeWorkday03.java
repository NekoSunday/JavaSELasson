package com.sunday.tcpPratice;

import java.util.Scanner;

public class HomeWorkday03 {
    public static void main(String[] args) {
//        Mark();
//        oddSum();
//        evenPrint();
//        star();
//        DrawX();
//        Triangle();
//        antiTriangle();
        IsoscelesTriangle();
//        Extra01();
//        Extra02();
//        System.out.println(3 & 1);
    }


    public static void Mark() {
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

    public static void oddSum() {
        int Sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                Sum += i;
            }
        }
        System.out.println("1-100的奇数累加和为：" + Sum);
    }

    public static void Test03() {
        int Sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i);
                Sum += i;
            }
        }
        System.out.println("1-100之间既是3又是5倍的数字之和：" + Sum);
    }

    public static void PraticeWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.println("i:" + i);
            i++;
        }
    }

    public static void PraticeFor() {
        for (int i = 0; i <= 15; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void NarcissisticNum() {
        int bw;
        int sw;
        int gw;
        for (int i = 100; i <= 999; i++) {
            bw = i / 100;
            sw = i % 100 / 10;
            gw = i % 10;
            if (((bw * bw * bw) + (sw * sw * sw) + (gw * gw * gw)) == i) {
                System.out.println("水仙花数为：" + i);
            }
        }
    }

    public static void evenPrint() {
        int count = 0;
        for (int i = 0; i <= 60; i++) {
            if (i != 0 && i % 2 == 0) {
                System.out.print(" " + i);
                count++;
            }
            if (count != 0 && count % 5 == 0) {
                System.out.println();
            }
        }
    }

    public static void star() {
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 1:
                    System.out.println(i + ":水瓶");
                    break;
                case 2:
                    System.out.println(i + ":双鱼");
                    break;
                case 3:
                    System.out.println(i + ":白羊");
                    break;
                case 4:
                    System.out.println(i + ":金牛");
                    break;
                case 5:
                    System.out.println(i + ":双子");
                    break;
                case 6:
                    System.out.println(i + ":巨蟹");
                    break;
                case 7:
                    System.out.println(i + ":狮子");
                    break;
                case 8:
                    System.out.println(i + ":处女");
                    break;
                case 9:
                    System.out.println(i + ":天秤");
                    break;
                case 10:
                    System.out.println(i + ":天蝎");
                    break;
                case 11:
                    System.out.println(i + ":射手");
                    break;
                case 12:
                    System.out.println(i + ":摩羯");
                    break;
            }
        }
    }

    public static void DrawX() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i) {
                    System.out.print("O");
                } else if ((i + j) == 8) {
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Triangle() {
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= 10; j++) {
//                if (j < i) {
//                    System.out.print("*");
//                    System.out.print(" ");
//                } else {
//                    continue;
//                }
//            }
//            if (i != 0) {
//                System.out.println();
//            }
//        }

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void antiTriangle() {
//        for (int i = 5; i >= 0; i--) {
//            if (i != 5) {
//                System.out.println();
//            }
//            for (int j = 5; j >= 0; j--) {
//                if (j < i) {
//                    System.out.print("*");
//                    System.out.print(" ");
//                } else {
//                    continue;
//                }
//            }
//        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void IsoscelesTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void Extra02() {
        int a = 10;
        int b = 12;
//使用了3次交换，浪费资源
//        int temp=0;
//        temp=a;
//        a=b;
//        b=temp;

//用了两个式子作为ab的交换，但是需要常量计算
//        a+=(b-a);
//        b-=(a-10);

//异或使用的资源少，只需要进行二进制运算即可
        System.out.println(a ^ 6);
        System.out.println(b ^ 6);
    }

    public static void Extra01() {
        boolean[] bos = new boolean[1000];
        for (int i = 0; i < 1000; i++) {
            bos[i] = true;
            for (int j = 0; j < 1000; j++) {
                int res = i & j;
                if (res != 0 && res != i) {
                    bos[i] = false;
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (bos[i]) {
                System.out.print(i + " ");
            }
        }
    }
}


