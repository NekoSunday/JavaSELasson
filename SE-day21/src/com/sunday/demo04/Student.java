package com.sunday.demo04;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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

    Student(int age){
        System.out.println("默认构造");
        this.age=age;
    }
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
