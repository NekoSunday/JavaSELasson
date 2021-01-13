package com.sunday.HomeWork.HomeWork08;

public class Tutor extends Teacher{

    public Tutor(String id, String name) {
        super(id, name);
    }

    public Tutor() {
    }

    @Override
    public void work() {
        System.out.println("工号为："+this.getId()+"的助教"+this.getName()+"在帮助学生解决问题");
    }
}
