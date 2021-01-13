package com.sunday.jichenganli;

public class User {
    private String name;
    private double leftMoney;

    public User(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public void show(){
        System.out.println(this.name+","+this.leftMoney);
    }
}
