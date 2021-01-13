package com.sunday.HomeWorkday13.GQ3.HomeWork01;

import java.util.HashSet;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random red = new Random();
        Random blue = new Random();
        int bluePoint = blue.nextInt(16) + 1;
        HashSet<Integer> ballList = new HashSet<>();
        while (true){
            int redPoint = red.nextInt(33) + 1;
            if (ballList.size()<7){
                ballList.add(redPoint);
            }else{
                break;
            }
        }
        System.out.println("双色球号码为：");
        for (Integer integer : ballList) {
            System.out.print(integer+" ");
        }
        System.out.println(bluePoint);
    }
}
