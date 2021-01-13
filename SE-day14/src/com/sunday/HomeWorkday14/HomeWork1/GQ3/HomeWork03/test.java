package com.sunday.HomeWorkday14.HomeWork1.GQ3.HomeWork03;

import java.util.*;

public class test {
    public static void main(String[] args) {
        String[] fruit = {"苹果", "香蕉", "西瓜", "橘子"};
        HashMap<String, String> map = new HashMap<>();
        HashSet<String> goodsNum=new HashSet<>();
        int index=0;
        while (goodsNum.size()<4) {
            goodsNum.add(number());
        }
        for (String strings : goodsNum) {
            map.put(strings,fruit[index++]);
        }
        System.out.println(map);
        System.out.println("请输入需要查找的商品号：");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        Set<String> set = map.keySet();
        if (set.contains(next)){
            System.out.println("根据商品号："+next+"，查询到对应的商品为："+map.get(next));
        }else {
            System.out.println("查无此商品");
        }
        }


    public static String number() {
        Random randomNumber = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = randomNumber.nextInt(10);
            builder.append(index);
        }
        String number= String.valueOf(builder);
        return number;
    }
}

