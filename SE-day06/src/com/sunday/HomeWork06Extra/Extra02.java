package com.sunday.HomeWork06Extra;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Extra02 {
    public static void main(String[] args) {
        ArrayList<Integer> diceList = new ArrayList<>();
        getLists(diceList);
        guessDice(diceList);
        System.out.print("3个骰子投出的数字为："+diceList);
    }

    public static int randomDice() {
        Random dice = new Random();
        int diceNum = dice.nextInt(6) + 1;
        return diceNum;
    }

    public static Scanner guessEnter() {
        return new Scanner(System.in);
    }

    public static ArrayList getLists(ArrayList<Integer> list) {
        for (int i = 0; i < 3; i++) {
            int diceNum = randomDice();
            list.add(diceNum);
        }
        return list;
    }

    public static void guessDice(ArrayList<Integer> list) {
        System.out.println("请输入大或者小");
        String guess = guessEnter().next();
        if (guess.equals("大")) {
            boolean flag = true;
            if (dice(list) == flag) {
                System.out.println("赢了");
            } else {
                System.out.println("输了");
            }
        } else if (guess.equals("小")) {
            boolean flag = false;
            if (dice(list) == flag) {
                System.out.println("赢了"); 
            } else {
                System.out.println("输了");
            }
        } else {
            System.out.println("输入错误");
        }
    }

    public static boolean dice(ArrayList<Integer> list) {
        int sum = 0;
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        if (sum <= 10) {
            flag = false;
        }
        return flag;
    }

}
