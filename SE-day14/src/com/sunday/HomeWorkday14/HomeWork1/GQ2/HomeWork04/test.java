package com.sunday.HomeWorkday14.HomeWork1.GQ2.HomeWork04;

import java.util.*;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        char[] chars = next.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) { ;
            if (map.get(aChar)!=null) {
                map.put(aChar,map.get(aChar)+1);
            }else{
                map.put(aChar, 1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character character : set) {
            System.out.print(character+"("+map.get(character)+")");
        }
    }
}
