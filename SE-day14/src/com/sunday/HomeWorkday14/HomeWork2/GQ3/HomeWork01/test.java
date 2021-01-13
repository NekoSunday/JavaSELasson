package com.sunday.HomeWorkday14.HomeWork2.GQ3.HomeWork01;

public class test {
    public static void main(String[] args) {
        try {
            DebitCard("1564812",-3025.3);
        } catch (NoMoneyException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public static void DebitCard(String accountNumber,double money) throws NoMoneyException {
        System.out.println("借记卡的账号："+accountNumber);
        if (money<0){
            throw new NoMoneyException("余额为负数了！");
        }
        System.out.println("借记卡的余额："+money);
    }
}
