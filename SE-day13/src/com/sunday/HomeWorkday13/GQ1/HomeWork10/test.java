package com.sunday.HomeWorkday13.GQ1.HomeWork10;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        for (Object o : add("123", "456", "789", "10000")) {
            System.out.println(o);
        }
    }
    public static ArrayList add(String... str){
        ArrayList<String> strings = new ArrayList<>();
        for (String s : str) {
            strings.add(s);
        }
        return strings;
    }
}
