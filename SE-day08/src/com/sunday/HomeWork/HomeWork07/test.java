package com.sunday.HomeWork.HomeWork07;

public class test {
    public static void main(String[] args) {
        Cook cook = new Cook("c110", "小王", 6000.0);
        Manager manager = new Manager("m110", "老王", 10000.0);
        manager.eat();
        manager.work();
        cook.eat();
        cook.work();
    }
}
