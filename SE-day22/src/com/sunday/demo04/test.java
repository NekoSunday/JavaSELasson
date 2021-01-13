package com.sunday.demo04;

public class test {
    public static void main(String[] args) {
        FruitFactory ff = new FruitFactory();
        Apple apple = (Apple) ff.createFruit("Apple");
        Pear pear = (Pear) ff.createFruit("Pear");
    }
}
