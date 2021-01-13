package com.sunday.HomeWork.HomeWork03;

public class Dog extends Animal{

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    public void lookHome(){
        System.out.println(this.getName()+"狗看家");
    }
}
