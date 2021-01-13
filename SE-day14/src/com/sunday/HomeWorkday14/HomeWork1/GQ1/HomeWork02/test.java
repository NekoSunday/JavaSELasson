package com.sunday.HomeWorkday14.HomeWork1.GQ1.HomeWork02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"lucy");
        map.put(2,"amy");
        map.put(3,"jame");
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer);
        }

        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
