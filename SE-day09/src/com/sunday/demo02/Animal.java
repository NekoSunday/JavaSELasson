package com.sunday.demo02;

public abstract class Animal {
    private String name;
    private String id;

    public Animal(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void eat();

    public abstract void sleep();

}
