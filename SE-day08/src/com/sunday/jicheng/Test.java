package com.sunday.jicheng;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager(111,"james",2.33);
        Cook cook = new Cook(222,"may",1.53);
        Waiter waiter = new Waiter(333, "lucy", 1.03);

        cook.work();
        manager.work();
        waiter.work();

        cook.show();
        manager.show();
        waiter.show();
    }
}
