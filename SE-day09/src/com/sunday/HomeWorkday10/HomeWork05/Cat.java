package com.sunday.HomeWorkday10.HomeWork05;

public class Cat extends Animal {
    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
