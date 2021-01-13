package com.sunday.HomeWorkday05;

public class Homework06 {
    public static void main(String[] args) {
        Manager Manager1=new Manager("James","9527",15000,3000);
        Coder Coder1=new Coder("Kobe","0025",10000);

        Manager1.intro();
        Manager1.showSalary();
        Manager1.work();
        System.out.println("===========");
        Coder1.intro();
        Coder1.showSalary();
        Coder1.work();
    }
}
