package com.sunday.HomeWorkday12.GQ2.HomeWork05;



import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("小明",12,1.50);
        Person person2 = new Person("小红",18,1.70);
        Person person3 = new Person("小黄",21,1.83);
        Person person4 = new Person("小杨",18,1.75);
        Person person5 = new Person("小冰",20,1.65);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        Iterator<Person> index=people.iterator();
        while (index.hasNext()){
            Person next = index.next();
            next.setAge(next.getAge()+2);
        }

        for (Person person : people) {
            person.show();
        }
    }
}
