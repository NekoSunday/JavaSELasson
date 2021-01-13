package com.sunday.HomeWork.HomeWork08;

public class Lecturer extends Teacher {

    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

    @Override
    public void work() {
        System.out.println("工号为："+this.getId()+"的讲师"+this.getName()+"在讲课");
    }
}
