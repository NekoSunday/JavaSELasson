package com.sunday.Jsoup;

public class test {
    public static void main(String[] args) {
        Student s = new Student();
        s.study();
        StudentStrong ss = new StudentStrong(s);
        ss.study();
    }
}
