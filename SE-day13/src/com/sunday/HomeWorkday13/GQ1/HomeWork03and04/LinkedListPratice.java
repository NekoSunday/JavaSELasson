package com.sunday.HomeWorkday13.GQ1.HomeWork03and04;

import java.util.LinkedList;

public class LinkedListPratice {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("123");
        list.add("456");
        list.add("789");

        list.addLast("56");
        list.addFirst("111");
        System.out.println(list);
        list.set(2,"555");
        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
    }
}
