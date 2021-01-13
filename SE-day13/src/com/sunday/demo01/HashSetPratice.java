package com.sunday.demo01;

import java.util.Collections;
import java.util.HashSet;

public class HashSetPratice {
    public static void main(String[] args) {
        test02();
    }

    private static void test02() {
        //类中重写equals和hashCode方法，使得可以比较对象内容，
        // 若没有重写则比较内存地址全部对象压入people中
        Person p1 = new Person("Lucy", 18);
        Person p2 = new Person("Jame", 18);
        Person p3 = new Person("Amy", 18);
        Person p4 = new Person("Lucy", 20);//内容与p1不同则压入
        Person p5 = new Person("Lucy", 20);//内容与p4相同也不压入
        HashSet<Person> people = new HashSet<>();
        Collections.addAll(people,p1,p2,p3,p4,p5);
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//        people.add(p4);
//        people.add(p5);
        System.out.println(people);


    }

    private static void test01() {
        String str1 = new String("abc");
        String str2 = new String("cba");
        String str3 = new String("bca");
        HashSet<String> set = new HashSet<>();
        set.add(str1);
        set.add(str2);
        set.add(str3);
        System.out.println(set);

    }
}
