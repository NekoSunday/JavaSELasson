package com.sunday.HomeWork.HomeWork06;

public class Rooster extends Animal{

    private String name;


    public Rooster(int age, String color, String name) {
        super(age, color);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的"+this.name+"在啄米");
    }

    public void dm(){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的"+this.name+"在打鸣");
    }
}
