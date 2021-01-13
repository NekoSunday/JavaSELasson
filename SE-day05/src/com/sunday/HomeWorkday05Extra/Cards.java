package com.sunday.HomeWorkday05Extra;

public class Cards {
    private String[] color={"♦", "♣", "♥", "♠"};
    private String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    private String[] player1;
    private String[] player2;
    private String[] player3;
     String[] cards = new String[num.length * color.length + 2];


    public void setPlayer1(String[] player1) {
        this.player1 = player1;
    }

    public void setPlayer2(String[] player2) {
        this.player2 = player2;
    }

    public void setPlayer3(String[] player3) {
        this.player3 = player3;
    }

    public void xipai(){
        int count = 0;
        cards[count] = "joker";
        cards[count + 1] = "JOKER";
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                cards[count + 2] = color[j] + num[i];
                count++;
            }
        }
        index();
        printCards(this.player1);
        System.out.println();
        printCards(this.player2);
        System.out.println();
        printCards(this.player3);

    }

    public void printCards(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }

    public void index(){
        int length = cards.length;
        for (int i = 0; i < cards.length; i++) {
            int cardsRandom = (int) Math.floor((Math.random() * (length - 1)));
            String temp = cards[i];
            cards[i] = cards[cardsRandom];
            cards[cardsRandom] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(cards[i]+" ");
        }
        for (int i = 0; i < 3; i++) {
            String[] index=new String[17];
            int count=0;
            for (int j = 0; j < length-3; j++) {
                if (j%3==i){
                    index[count++]=cards[j];
                    if (i==0){
                        setPlayer1(index);
                    }else if(i==1){
                        setPlayer2(index);
                    }else{
                        setPlayer3(index);
                    }
                }
            }
        }
        System.out.println();
    }
}
