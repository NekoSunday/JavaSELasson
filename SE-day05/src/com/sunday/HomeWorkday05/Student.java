package com.sunday.HomeWorkday05;

public class Student {
    private String name;
    private int age;
    private String content;

    public Student(String name,int age,String content){
        this.age=age;
        this.name=name;
        this.content=content;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }

    public void eat(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"正在"+getContent());
    }
    public void study(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"正在专心致志地听着"+getContent());
    }
}
