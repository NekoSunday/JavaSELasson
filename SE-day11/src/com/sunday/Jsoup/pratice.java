package com.sunday.Jsoup;

public class pratice {
    public static void main(String[] args) {
        Student qq = new Student("qq", 1);
        Student aa = new Student("aa", 2);
        Student student = null;

        System.out.println(qq.equals(aa));
        System.out.println(student.equals(qq));

    }
}
