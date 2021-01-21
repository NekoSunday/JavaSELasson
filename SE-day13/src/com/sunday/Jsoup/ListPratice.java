package com.sunday.Jsoup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ListPratice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Lucy");
        list.add("Mary");
        list.add("Lisa");
        list.add("Jame");
        list.add("Jack");

        System.out.println(list);
        list.add(3, "Rose");
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.set(0, "Mimi"));
        System.out.println(list);


        Vector<String> strings = new Vector<>(list);
        System.out.println(strings);


        System.out.println(suffule(test(list)));

    }

    private static <T> List<T> test(List<T> list) {
        Collections.shuffle(list);
        return list;
    }

    private static List suffule(List<String> list){
        Collections.sort(list);
        return list;
    }
}
