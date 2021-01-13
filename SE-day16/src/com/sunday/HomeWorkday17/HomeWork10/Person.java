package com.sunday.HomeWorkday17.HomeWork10;

public class Person {
    private String name;
    private String Sex;

    public Person() {
    }

    public Person(String name, String sex) {
        this.name = name;
        Sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
