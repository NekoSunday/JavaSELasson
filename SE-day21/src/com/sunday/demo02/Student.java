package com.sunday.demo02;

public class Student {
    static {
        System.out.println("学生加载中……");
    }

    public String name="zs";
    public int age=20;
    public String sex="男";

    public Student() {
        System.out.println("空参");
    }

    public Student(String name, int age, String sex) {
        System.out.println("满参");
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private Student(String name, int age){
        System.out.println("私有构造");
        this.name=name;
        this.age=age;
    }
    protected Student(String name){
        System.out.println("保护构造");
        this.name=name;
    }
}
