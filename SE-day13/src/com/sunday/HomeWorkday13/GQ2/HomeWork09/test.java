package com.sunday.HomeWorkday13.GQ2.HomeWork09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        ArrayList<String> Array1 = new ArrayList<>();
        ArrayList<String> Array2 = new ArrayList<>();

        Collections.addAll(Array1, "a","b","a","c","d");
        Collections.addAll(Array2, "e","f","a","d","g");

        HashSet<String> set = new HashSet<>();
        for (String s : Array1) {
            set.add(s);
        }
        for (String s : Array2) {
            set.add(s);
        }
        for (String s : set) {
            System.out.print(s+" ");
        }
    }
}
