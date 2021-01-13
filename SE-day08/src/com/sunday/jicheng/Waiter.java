package com.sunday.jicheng;

public class Waiter extends Employee {

    public Waiter(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("点菜");
    }
}
