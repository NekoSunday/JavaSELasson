package com.sunday.jicheng;

public class Cook extends Employee {

    public Cook(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }
}
