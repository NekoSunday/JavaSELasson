package com.sunday.demo07;

public enum Direction {
    //枚举类
    FRONT,BEHIND,LEFT,RIGHT;

    public void show01(){
        System.out.println("枚举类的公有方法");
    }

    private void show02(){
        System.out.println("枚举类的私有方法");
    }
}
