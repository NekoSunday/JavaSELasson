package com.sunday.HomeWorkday05;

public class Homework03 {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setAge(30);
        t.setName("周老师");
        t.setContent("java面向对象的知识");
        t.eat();
        t.teach();

        Student stu=new Student("韩同学",18,"java面向对象的知识");
        stu.eat();
        stu.study();
    }
}
