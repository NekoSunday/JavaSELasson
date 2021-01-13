package com.sunday.HomeWorkday13.GQ2.HomeWork07;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            set.add(aChar);
        }
        for (Character character : set) {
            System.out.print(character);
        }
    }
}
