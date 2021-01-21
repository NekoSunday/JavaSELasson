package com.sunday.Jsoup;

import java.util.Random;
import java.util.Scanner;

public class keyboardtest02 {
    public static void main(String[] args) {
        guess();
    }

    public static Scanner getGuess(){
        return new Scanner(System.in);
    }

    public static int randomNum(int changeNum){
        Random num=new Random();
        int guessNum=num.nextInt(changeNum+1);
        return guessNum;
    }

    public static void guess(){
//        System.out.println("请输入猜想的数字：");
//        int index = getGuess().nextInt();
//        if (index>randomNum()){
//            System.out.println(randomNum()+"大了");
//        }else if (index<randomNum()){
//            System.out.println(randomNum()+"小了");
//        }else{
//            System.out.println(randomNum()+"对了");
//        }

        while (true) {
            System.out.println("请输入猜想数字的范围(0-?)：");
            int changeNum = getGuess().nextInt();
            int num = randomNum(changeNum);
            int count = 4;
            System.out.println("游戏开始，请输入猜想的数字：");
            while (true) {
                if (count < 1) {
                    System.out.println("正确数字为："+num);
                    System.out.println("结束，开始下一把！");
                    break;
                }
                int index = getGuess().nextInt();
                if (index > num) {
                    System.out.println("大了");
                    System.out.println("剩余次数：" + (count));
                    System.out.println("请输入猜想的数字：");
                    count--;
                } else if (index < num) {
                    System.out.println("小了");
                    System.out.println("剩余次数：" + (count));
                    System.out.println("请输入猜想的数字：");
                    count--;
                } else {
                    System.out.println("对了");
                    break;
                }
            }
        }

//        System.out.println("请输入猜想的数字：");
//        int num=randomNum();
//        int chance=20;
//        for (int i = 0; i < chance; i++) {
//            int index = getGuess().nextInt();
//            if (19-i==0){
//                System.out.println("游戏结束！！！");
//            }else{
//                if (index > num) {
//                    System.out.println("大了");
//                    System.out.println("剩余次数："+(19-i));
//                    System.out.println("请输入猜想的数字：");
//                } else if (index < num) {
//                    System.out.println("小了");
//                    System.out.println("剩余次数："+(19-i));
//                    System.out.println("请输入猜想的数字：");
//                } else{
//                    System.out.println("对了");
//                    break;
//                }
//            }
//        }
    }

}
