package com.sunday.HomeWork06Extra;

import java.util.Random;
import java.util.Scanner;

public class Extra01 {
    public static void main(String[] args) {
        guess();
    }

    public static Scanner getGuess() {
        return new Scanner(System.in);
    }

    public static int randomNum() {
        Random num = new Random();
        int guessNum = num.nextInt(100) + 1;
        return guessNum;
    }

    public static void guess() {
        System.out.println("游戏开始，请玩家1输入猜想的数字：");
        int num = randomNum();
        player: while (true) {
            while (true) {
                int index = getGuess().nextInt();
                if (index > num) {
                    System.out.println("大了");
                    System.out.println("请玩家2输入猜想的数字：");
                    break;
                } else if (index < num) {
                    System.out.println("小了");
                    System.out.println("请玩家2输入猜想的数字：");
                    break;
                } else {
                    System.out.println("玩家1对了");
                    break player;
                }
            }
            while (true) {
                int index = getGuess().nextInt();
                if (index > num) {
                    System.out.println("大了");
                    System.out.println("请玩家1输入猜想的数字：");
                    break;
                } else if (index < num) {
                    System.out.println("小了");
                    System.out.println("请玩家1输入猜想的数字：");
                    break;
                } else {
                    System.out.println("玩家2对了");
                    break player;
                }
            }
        }
    }
}
