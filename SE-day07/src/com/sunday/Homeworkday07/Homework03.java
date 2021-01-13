package com.sunday.Homeworkday07;

public class Homework03 {
    public static void main(String[] args) {
        String str = "HelloWorld广州";
        System.out.println(str.length());
        char[] chars = str.toCharArray();
        System.out.println(chars[2]);
        System.out.println(str.indexOf("o"));
        System.out.println(str.substring(6));
        System.out.println(str.substring(2,7));
    }
}
