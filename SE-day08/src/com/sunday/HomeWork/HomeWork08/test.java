package com.sunday.HomeWork.HomeWork08;

public class test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("666", "傅红雪");
        Tutor t = new Tutor("668", "顾棋");
        Maintainer m = new Maintainer("686", "庖丁");
        Buyer b = new Buyer("888", "景甜");

        l.work();
        t.work();
        m.work();
        b.work();
    }
}
