package com.sunday.HomeWorkday13.GQ2.HomeWork06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();

        HashSet<Integer> hs = new HashSet<>();
        while (hs.size()<=10){
            int index = random.nextInt(20) + 1;
            hs.add(index);
        }
        Iterator<Integer> it=hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
