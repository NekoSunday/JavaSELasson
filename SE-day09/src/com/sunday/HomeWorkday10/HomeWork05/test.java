package com.sunday.HomeWorkday10.HomeWork05;

public class test {
    public static void main(String[] args) {
        Animal d=new Dog("jame",7);
        Animal c=new Cat("jerry",2);

        d.eat();
        c.eat();

        if (d instanceof Dog){
            Dog dog=(Dog)d;
            dog.lookHome();
        }
        if(c instanceof Cat){
            Cat cat=(Cat)c;
            cat.catchMouse();
        }
    }

}
