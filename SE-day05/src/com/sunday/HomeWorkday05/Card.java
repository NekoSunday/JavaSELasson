package com.sunday.HomeWorkday05;

public class Card {
    private String color;
    private String num;

    public Card(String color, String num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public String getNum() {
        return num;
    }

    public void showCard() {
        System.out.println(getColor() + getNum());
    }
}


