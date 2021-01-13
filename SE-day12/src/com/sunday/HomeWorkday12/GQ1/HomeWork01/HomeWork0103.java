package com.sunday.HomeWorkday12.GQ1.HomeWork01;

import java.util.ArrayList;
import java.util.Collection;

public class HomeWork0103 {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("456");
        strings.add("789");

        strings.remove("123");
        System.out.println(strings.size());
        System.out.println(strings);
        strings.clear();
    }
}
