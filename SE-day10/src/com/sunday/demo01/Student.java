package com.sunday.demo01;

public class Student extends Person {
    public Student(String name, String id) {
        super(name, id);
    }

    public Student() {
    }

    public void study(){
        System.out.println("学习ing");
    }

}
