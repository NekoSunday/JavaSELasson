package com.sunday.demo02;

public class Cat extends Animal implements InterfaceWork{
    public Cat(String name, String id) {
        super(name, id);
    }

    @Override
    public void eat() {
        System.out.println("猫猫在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("猫猫睡觉了");
    }

    @Override
    public void work() {
        System.out.println("在抓老鼠呢！");
    }
}
