package com.sunday.anli;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Laptop laptop=new Laptop("戴尔",10000);
        laptop.run();//调用Laptop中的run方法
        USB m=new Mouse("雷蛇",200);//鼠标m向上转型
        laptop.useUsbDevice(m);
        USB k=new Keyboard("魔力鸭",500);//键盘k向上转型
        laptop.useUsbDevice(k);
        laptop.shutDown();
    }

    public void test01(){
        Scanner scanner = new Scanner(System.in);
    }
}
