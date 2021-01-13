package com.sunday.HomeWork.HomeWork07;

public class Cook extends Employee {

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void eat() {
        System.out.println("工号为："+this.getId()+",姓名为："+this.getName()+"，工资为："+this.getSalary()+"在吃肉");
    }

    @Override
    public void work() {
        System.out.println("工号为："+this.getId()+",姓名为："+this.getName()+"，工资为："+this.getSalary()+"在工作，炒菜");
    }
}
