package com.sunday.HomeWork.HomeWork08;

public class Maintainer extends AdminStaff {

    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }

    @Override
    public void work() {
        System.out.println("工号为："+this.getId()+"的维护专员"+this.getName()+"在解决不能共享屏幕问题");
    }
}
