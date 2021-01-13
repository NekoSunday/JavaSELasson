package com.sunday.HomeWorkday10.HomeWork01;

public interface A {
    void showA();
    default void showB(){
        System.out.println("BBBB");
    }
}
