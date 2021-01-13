package com.sunday.HomeWorkday12.DDZ;

import java.util.ArrayList;
import java.util.Collections;

public class DDZ {
    public static void main(String[] args) {
       Test();
    }

    private static void Test() {
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♦", "♣", "♥", "♠"};
        ArrayList<String> card = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                card.add(color[j] + num[i]);
            }
        }

        card.add("joker");
        card.add("JOKER");

        Collections.shuffle(card);
        System.out.println("这副牌洗完牌之后：" + card);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lastCard = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            if (i < 51) {
                if (i % 3 == 1) {
                    player1.add(card.get(i));
                } else if (i % 3 == 2) {
                    player2.add(card.get(i));
                } else if (i % 3 == 0) {
                    player3.add(card.get(i));
                }
            } else {
                lastCard.add(card.get(i));
            }
        }
        if (player1.contains("JOKER")){
            System.out.println("玩家1为地主");
            player1.addAll(lastCard);
        }else if (player2.contains("JOKER")){
            System.out.println("玩家2为地主");
            player2.addAll(lastCard);
        }else if (player3.contains("JOKER")){
            System.out.println("玩家3为地主");
            player3.addAll(lastCard);
        }else{
            System.out.println("无人做地主");
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        System.out.println("玩家1手牌为：" + player1);
        System.out.println("玩家2手牌为：" + player2);
        System.out.println("玩家3手牌为：" + player3);
        System.out.println("底牌为：" + lastCard);


    }
}
