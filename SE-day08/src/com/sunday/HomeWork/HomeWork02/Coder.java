package com.sunday.HomeWork.HomeWork02;

public class Coder extends Person {

    public Coder(String name, int age) {
        super(name, age);
    }

    public void coding(){
        System.out.println(this.getName()+"敲代码");
    }
}
