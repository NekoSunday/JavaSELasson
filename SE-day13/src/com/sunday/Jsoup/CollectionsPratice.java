package com.sunday.Jsoup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPratice {
    public static void main(String[] args) {
        Person p1 = new Person("黄晓明", 40);
        Person p2 = new Person("陈小春", 40);
        Person p3 = new Person("张小龙", 18);
        Person p4 = new Person("孔明", 40);
        List<Person> list = new ArrayList<>();
        Collections.addAll(list,p1,p2,p3,p4);
        Collections.sort(list);
        System.out.println(list);
    }
}
