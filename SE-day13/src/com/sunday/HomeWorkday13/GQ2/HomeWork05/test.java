package com.sunday.HomeWorkday13.GQ2.HomeWork05;

import java.util.ArrayList;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        ArrayList<String> strings = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        strings.addAll(set);
        System.out.println(strings);
    }
}
