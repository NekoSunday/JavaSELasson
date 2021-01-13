package com.sunday.HomeWork.HomeWork03;

public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财", "黄色", 150);
        Cat cat = new Cat("波斯猫", "白色", 2000);

        dog.eat();
        dog.lookHome();
        System.out.println("--------------------");
        cat.eat();
        cat.catchMouse();
    }
}
