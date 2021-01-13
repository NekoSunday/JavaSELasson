package com.sunday.demo01;

public class homeWork {
    public static void main(String[] args) {
        Test01();
        Test02();
        Test03();
        Test04();
        printNum();
        printString();
        add();
        sub();
        mul();
        div();
        remain();
        Test08();
        System.out.println(-3>>2);
    }

    public static void Test01() {
        int rectLong = 20;
        int rectWidth = 15;
        int rectSquare = rectLong * rectWidth;
        int rectGirth = 2 * (rectLong + rectWidth);
        System.out.println("长方形面积为：" + rectSquare + "\n" + "长方形周长为" + rectGirth);
    }

    public static void Test02() {
        byte b1 = 10;
        byte b2 = 20;
        short s1 = 1000;
        short s2 = 2000;

        byte b3 = (byte) (b1 + b2);
        short s3 = (short) (s1 + s2);

        System.out.println("byte的类型b1和b2的和为：" + "\n" + b3);
        System.out.println("short的类型s1和s2的和为：" + "\n" + s3);
    }

    public static void Test03() {
        int i1 = 100;
        long l1 = 200;
        long l2 = 1000000;
        float f2 = 0.44f;
        int i3 = 1000000;
        double d3 = 0.45;
        long add = i1 + l1;
        float add2 = l2 + f2;
        double add3 = i3 + d3;
        System.out.println("add的值：" + add);
        System.out.println("add2的值：" + add2);
        System.out.println("add3的值：" + add3);
    }

    public static void Test04() {
        int a1 = 10, a2 = 11;
        int b1 = 12, b2 = 13;
        System.out.println("10是偶数？" + (a1 % 2 > 0 ? "false" : "true"));
        System.out.println("11是偶数？" + (a2 % 2 > 0 ? "false" : "true"));
        System.out.println("12是奇数？" + (b1 % 2 == 0 ? "false" : "true"));
        System.out.println("11是奇数？" + (b2 % 2 == 0 ? "false" : "true"));
    }

    public static void printNum() {
        float f1 =  12345.01f;
        float f2 =  12345.00f;
        float var1 = f1 > f2 ? 12456 :  12456.02f;
        float var2 = var1 + 1024;
        System.out.println("var1的值为：" + var1 + " var2的值为：" + var2);
    }

    public static void printString() {
        int num = 69;
        String str = num % 2 == 0 ? "是偶数" : "是奇数";
        System.out.println("num：" + num + str);
    }

    public static void add() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的和为：" + (x + y));
    }

    private static void sub() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的差为：" + (x - y));
    }

    private static void mul() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的积为：" + (x * y));
    }

    private static void div() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的商为：" + (x / y));
    }

    private static void remain() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的余数为：" + (x % y));
    }

    private static void Test08() {
        char ch = 'J';
        ch = (char) (ch + 32);
        char ch2 = 'a';
        ch2 -= 32;
        double d3 = 3.5;
        int i3 = 100;
        double sum3 = d3 + i3;
        double d4 = 3.5;
        int i4 = 100;
        int mul4 = (int) (d4 * i4);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println("sum3的值为：" + sum3);
        System.out.println("sum3的整数部分：" + (int) sum3);
        System.out.println("mul4的整数部分：" + mul4);
    }



}
