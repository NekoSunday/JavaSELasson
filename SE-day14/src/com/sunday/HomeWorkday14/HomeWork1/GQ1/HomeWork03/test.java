package com.sunday.HomeWorkday14.HomeWork1.GQ1.HomeWork03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"lucy");
        map.put(2,"amy");
        map.put(3,"jame");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Iterator<String> it=values.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
