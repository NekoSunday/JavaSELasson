package com.sunday.HomeWorkday10.HomeWork04;

public class test {
    public static void main(String[] args) {
        Oldphone oldphone = new Oldphone();
        Newphone newphone = new Newphone();
        oldphone.call();
        oldphone.sendMessage();
        newphone.call();
        newphone.sendMessage();
        newphone.playGame();
    }
}
