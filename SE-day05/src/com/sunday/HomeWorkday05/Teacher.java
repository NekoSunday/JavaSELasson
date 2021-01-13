package com.sunday.HomeWorkday05;

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContent(String content) {
        this.content = content;
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
    public void teach(){
        System.out.println("年龄为"+getAge()+"的"+getName()+"正在亢奋地讲着"+getContent());
    }
}
