package com.sunday.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class newDDZ {
    public static void main(String[] args) {
        Test();
    }

    private static void Test() {
        //创建cards的双列集合，以及花色，牌号的创建
        HashMap<Integer, String> cards = new HashMap<>();
        final ArrayList<String> colors = new ArrayList<>();
        final ArrayList<String> num = new ArrayList<>();

        //添加花色与牌号到colors和num中
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(num, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        //根据key，value的原理，将牌面编号到每一张生成牌到cards
        int count = 1;
        cards.put(count++, "JOKER");
        cards.put(count++, "joker");
        for (String number : num) {
            for (String color : colors) {
                String card = color + number;
                cards.put(count++, card);
            }
        }

        //获取其键值，输出到set集合中再将set放进ArrayList中进行打乱
        Set<Integer> cardsIndex = cards.keySet();

        ArrayList<Integer> keyList = new ArrayList<>(cardsIndex);
        //上与下相同，上列为优化addAll，再创建集合的时候添加另一个集合
//        ArrayList<Integer> keyList = new ArrayList<>();
//        keyList.addAll(cardsIndex);

        Collections.shuffle(keyList);

        //创建玩家牌面的集合，和底牌的集合
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lastCard = new ArrayList<>();

        //创建玩家牌面的键值集合，关联到cards中，利用其key获取其value
        ArrayList<Integer> p1Num = new ArrayList<>();
        ArrayList<Integer> p2Num = new ArrayList<>();
        ArrayList<Integer> p3Num = new ArrayList<>();
        ArrayList<Integer> lcNum = new ArrayList<>();

        //顺序发牌，发打乱后的键值
        for (int i = 0; i < 54; i++) {
            if (i < 51) {
                if (i % 3 == 1) {
                    p1Num.add(keyList.get(i));
                } else if (i % 3 == 2) {
                    p2Num.add(keyList.get(i));
                } else if (i % 3 == 0) {
                    p3Num.add(keyList.get(i));
                }
            } else {
                lcNum.add(keyList.get(i));
            }
        }

        //将其牌面的键值排序
        Collections.sort(p1Num);
        Collections.sort(p2Num);
        Collections.sort(p3Num);
        Collections.sort(lcNum);

        //判定牌面的键值是否和键值为1的作比较，若键值有相同，则该玩家为地主
        if (p1Num.contains(1)) {
            System.out.println("玩家1为地主");
            p1Num.addAll(lcNum);
            Collections.sort(p1Num);
        } else if (p2Num.contains(1)) {
            System.out.println("玩家2为地主");
            p2Num.addAll(lcNum);
            Collections.sort(p2Num);
        } else if (p3Num.contains(1)) {
            System.out.println("玩家3为地主");
            p3Num.addAll(lcNum);
            Collections.sort(p3Num);
        } else {
            System.out.println("无人做地主");
        }

        //使用增强for获取每一个玩家拥有的键值集合，
        // 将其返回到cards获取其value添加到每一个玩家牌面的集合中
        for (Integer index : p1Num) {
            String card = cards.get(index);
            player1.add(card);
        }
        for (Integer index : p2Num) {
            String card = cards.get(index);
            player2.add(card);
        }
        for (Integer index : p3Num) {
            String card = cards.get(index);
            player3.add(card);
        }
        for (Integer index : lcNum) {
            String card = cards.get(index);
            lastCard.add(card);
        }

        //输出牌面
        System.out.println("玩家1手牌为：" + player1);
        System.out.println("玩家2手牌为：" + player2);
        System.out.println("玩家3手牌为：" + player3);
        System.out.println("底牌为：" + lastCard);
    }
}
