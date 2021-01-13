package com.sunday.HomeWorkday12.GQ2.HomeWork02;

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

        double maxHeight=person1.getHeight();
        double minHeight=person1.getHeight();
        Iterator<Person> index=people.iterator();
        while (index.hasNext()){
            double i=index.next().getHeight();
            if (maxHeight<i){
                maxHeight=i;
            }
            if (minHeight>i){
                minHeight=i;
            }
        }
        for (Person person : people) {
            if (person.getHeight()==maxHeight){
                person.showMax();
            }
            if (person.getHeight()==minHeight){
               person.showMin();
            }
        }

    }
}
