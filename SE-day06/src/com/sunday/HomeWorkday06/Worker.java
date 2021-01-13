package com.sunday.HomeWorkday06;

public class Worker {
    private String id;
    private String name;
    private int age;

    public Worker(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Worker() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void show(){
        System.out.println(getId()+" "+getName()+" "+getAge());
    }
}
