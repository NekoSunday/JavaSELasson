package com.sunday.demo02;

public class Dog extends Animal implements InterfaceWork{
    public Dog(String name, String id) {
        super(name, id);
    }

    @Override
    public void eat() {
        System.out.println("狗狗吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("狗狗睡觉了");
    }

    @Override
    public void work() {
        System.out.println("在抓猫呢！");
    }
}
