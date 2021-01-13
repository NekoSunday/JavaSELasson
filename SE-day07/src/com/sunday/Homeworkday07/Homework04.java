package com.sunday.Homeworkday07;

import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }
        System.out.println(Arrays.toString(chars));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("o","6"));
        System.out.println(str.replace("ll","LL"));
    }
}
