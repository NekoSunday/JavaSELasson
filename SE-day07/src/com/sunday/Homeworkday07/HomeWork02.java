package com.sunday.Homeworkday07;

public class HomeWork02 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.startsWith("He"));
        System.out.println(str1.startsWith("abc"));
        System.out.println(str1.endsWith("o"));
        System.out.println(str1.endsWith("l"));

    }
}
