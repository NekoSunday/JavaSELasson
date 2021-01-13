package com.sunday.HomeWorkday13.GQ1.HomeWork07;

import java.util.Collections;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person p1 = new Person("Lucy", 18);
        Person p2 = new Person("Jame", 20);
        Person p3 = new Person("Amy", 21);
        Person p4 = new Person("Amy", 21);
        Collections.addAll(people,p1,p2,p3,p4);
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
