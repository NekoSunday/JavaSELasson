package com.sunday.HomeWork.HomeWork02;

public class test {
    public static void main(String[] args) {
        Coder coder=new Coder("马化腾",40);
        Teacher teacher = new Teacher("马云", 40);

        coder.eat();
        coder.sleep();
        coder.coding();
        System.out.println("-------------------------");
        teacher.eat();
        teacher.sleep();
        teacher.teach();
    }
}
