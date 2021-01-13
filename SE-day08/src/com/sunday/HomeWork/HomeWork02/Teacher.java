package com.sunday.HomeWork.HomeWork02;

public class Teacher extends Person {
    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach(){
        System.out.println(this.getName()+"上课");
    }
}
