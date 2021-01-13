package com.sunday.HomeWorkday13.GQ2.HomeWork03;

import java.util.Iterator;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        String[] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933"};
        for (String str : strs) {
            if (!strings.equals(str)) {
                strings.add(str);
            }
        }
        System.out.println("增强for遍历");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("迭代器遍历");
        Iterator<String> it=strings.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
