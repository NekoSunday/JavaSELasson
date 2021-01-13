package com.sunday.HomeWorkday12.GQ1.HomeWork01;

import java.util.ArrayList;
import java.util.Collection;

public class HomeWork0102 {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("456");
        strings.add("789");

        strings.remove("123");
        System.out.println(strings.size());
        strings.clear();
    }
}
