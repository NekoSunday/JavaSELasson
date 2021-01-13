package com.sunday.demo03;

public class pratice {
    public static void main(String[] args) {
        //创建内部类
        car.engine engine = new car().new engine();
        engine.start();
        engine.waibuL();//读取外部类成员变量

        new car().test();
    }
}
