package com.sunday.HomeWork.HomeWork03;

public class Cat extends Animal {
    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    public void catchMouse(){
        System.out.println(this.getName()+"猫抓老鼠");
    }
}
