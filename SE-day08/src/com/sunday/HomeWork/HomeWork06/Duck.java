package com.sunday.HomeWork.HomeWork06;

public class Duck extends Animal{

    private String name;

    public Duck(int age, String color, String name) {
        super(age, color);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的"+this.name+"在吃饭");
    }

    public void swim(){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的"+this.name+"在游泳");
    }
}
