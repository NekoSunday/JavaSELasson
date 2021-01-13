package com.sunday.HomeWorkday05;

public class Dog {
    private String name;
    private int age;

    public Dog(){

    }
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void showMsg(){
        System.out.println("狗的名称为："+getName()+",年龄为："+getAge());
    }
}
