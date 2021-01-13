package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork05;

import java.util.HashMap;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        char[] chars = nextLine.toCharArray();
        HashMap<String, Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if (aChar>=65&&aChar<=90||aChar>=97&&aChar<=122){
                countingKey(map,"字母");
            }else if (aChar>=48&&aChar<=57){
                countingKey(map,"数字");
            }else if (aChar==32){
                countingKey(map,"空格");
            }else{
                countingKey(map,"其它");
            }
        }

        System.out.println(map);
    }
    private static void countingKey(HashMap<String, Integer> map,String key) {
       if (map.get(key)!=null){
           map.put(key,map.get(key)+1);
       }else {
           map.put(key,1);
       }
    }



}
