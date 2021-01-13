package com.sunday.HomeWorkday12.GQ2.HomeWork02;

public class Person {
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Person() {
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void showMax(){
        System.out.println("最高的人是："+this.name+",身高"+this.height);
    }
    public void showMin(){
        System.out.println("最矮的人是："+this.name+",身高"+this.height);
    }
}
