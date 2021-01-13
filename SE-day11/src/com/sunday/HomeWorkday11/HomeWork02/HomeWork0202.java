package com.sunday.HomeWorkday11.HomeWork02;

public class HomeWork0202 {
    public static void main(String[] args) {
//        testString();
        testStringBuilder();
    }

    private static void testStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder str=new StringBuilder("1");
        for (int i = 0; i < 10000; i++) {
            str.append("2");
            System.out.print(str);
        }
        System.out.println();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testString() {
        long start = System.currentTimeMillis();
        String str="1";
        for (int i = 0; i < 10000; i++) {
            str+="2";
            System.out.print(str);
        }
        System.out.println();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
