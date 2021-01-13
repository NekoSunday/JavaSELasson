package com.sunday.HomeWork.HomeWork06;

public class test {
    public static void main(String[] args) {
        Rooster rooster = new Rooster(2, "红色", "公鸡");
        Duck duck = new Duck(1, "黑色", "鸭子");

        rooster.eat();
        rooster.dm();
        duck.eat();
        duck.swim();
    }
}
