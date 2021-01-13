package com.sunday.HomeWorkday06;

import java.util.Random;

public class HomeWork03 {
    public static void main(String[] args) {
       randomNum();
    }

    public static void randomNum(){
        Random num=new Random();
        for (int i = 0; i < 5; i++) {
            int guessNum=num.nextInt(10)+1;
            System.out.println(guessNum);
        }
    }
}
