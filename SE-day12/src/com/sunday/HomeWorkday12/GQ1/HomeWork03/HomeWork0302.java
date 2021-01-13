package com.sunday.HomeWorkday12.GQ1.HomeWork03;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork0302 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc1");
        strings.add("abc2");
        strings.add("abc3");
        strings.add("abc4");

        Iterator<String>it=strings.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
    }
}
