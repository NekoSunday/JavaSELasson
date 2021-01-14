package com.sunday.DDZ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Cards {
    final static String[] color = {"♠", "♦", "♥", "♣"};
    final static String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    static HashMap<Integer, String> cards = new HashMap<>();
    static Set<Integer> cardsNum;
    static ArrayList<Integer> keyList;
    static ArrayList<String> player;
    static ArrayList<Integer> playerNum;
    static ArrayList<Integer> lastCardNum;
    static int count = 1;

    static {
        for (String indexNumber : number) {
            for (String indexColor : color) {
                String indexCards = indexColor + indexNumber;
                cards.put(count++, indexCards);
            }
        }
        cards.put(count++, "joker");
        cards.put(count, "JOKER");
        cardsNum = cards.keySet();
        keyList = new ArrayList<>(cardsNum);
    }

    public ArrayList<String> getPlayerCards(int playerId) {
        player = new ArrayList<>();
        playerNum = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            if (i % 3 == (playerId - 1)) {
                playerNum.add(keyList.get(i));
            }
        }
        /*if (playerNum.contains(count)) {
            playerNum.addAll(lastCardNum);
        }*/
//        System.out.println("玩家" + playerId + player);
        return sortCards(playerNum);
    }

    public ArrayList<String> getStarCards(String str){
        if (str.equals("1")){
            playerNum.addAll(lastCardNum);
        }
        return sortCards(playerNum);
    }

    public ArrayList<String> sortCards(ArrayList<Integer> playerNum){
        Collections.sort(playerNum);
        for (Integer index : playerNum) {
            String card = cards.get(index);
            player.add(card);
        }
        return player;
    }
}
