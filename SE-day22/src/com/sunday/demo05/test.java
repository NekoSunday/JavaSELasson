package com.sunday.demo05;

import org.junit.Test;

public class test {
    @Test
    public void test01(){
        fruitFactory factory = new fruitFactory();
        Apple apple = factory.createHuman(Apple.class);
        apple.getFruit();

        Fruit pear = factory.createHuman("com.sunday.demo05.Pear");
        pear.getFruit();
    }
}
