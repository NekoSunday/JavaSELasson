package com.sunday.Jsoup;

public class test {
    public static void main(String[] args) {
//        System.out.println("hello world");
        byte num1 = 127;
        byte num2 = 1;
        short result = (short) (num1 + num2);
        System.out.println(result);


//        i+1<i题目
        byte result2 = (byte) (num1 + num2);
        System.out.println(result2);

        char num3 = 'A';
        int result3 = num3 + num2;
        System.out.println(result3);

        double num4 = 5.66;
        float result4 = (int) (num4 + num1);
        System.out.println(result4);

        //溢出后 -128+溢出数 -128+(132-128)
        byte result5 = (byte) (num4 + num1);
        System.out.println(result5);

//       可以使用数字转ASCII
        char result7 = (char) (num2);
        char result6 = (char) (num3 + num2);
        System.out.println(result6);
        System.out.println(result7);
        int num5 = 041;
        int num6 = 00001111;//不是二进制
        System.out.println(num5);
        System.out.println(num6); //585？？
        char result8 = (char) (num5);
        System.out.println(result8);


        float result9 = (float) (num4 % num3);
        float result10=(float)(num5*num4);
        System.out.println(result9);
        System.out.println(result10);
    }
}