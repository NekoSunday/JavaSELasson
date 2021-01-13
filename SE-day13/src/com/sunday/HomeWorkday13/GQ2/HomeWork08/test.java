package com.sunday.HomeWorkday13.GQ2.HomeWork08;

import java.util.HashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入整数： 输入-1回车结束");
        HashSet<Integer> integers = new HashSet<>();
        int sum=0;
        double avg=0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();
            if (index != -1) {
                integers.add(index);
            }else
            {
                break;
            }
        }
        for (Integer integer : integers) {
            sum+=integer;
        }
        avg=sum/integers.size();
        System.out.println("总值"+sum);
        System.out.println("平均值"+avg);
    }
}
