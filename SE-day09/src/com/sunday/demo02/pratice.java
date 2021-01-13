package com.sunday.demo02;

public class pratice {
    public static void main(String[] args) {
        Animal a=new Cat("Tom","9527");
        Animal b=new Dog("Jame","1125");
        //向下转型
        Cat c=(Cat)a;
        /*Cat d=(Dog)b;*///错误，已经向上转型的建立的对象无法将其向下转型为另一个子类的对象
        //向上转型
        showAnimal(a);
        showAnimal(b);
        c.work();
    }

    public static void showAnimal(Animal a){
        a.eat();
        a.sleep();
    }
}
