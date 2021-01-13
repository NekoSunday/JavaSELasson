package com.sunday.HomeWorkday05;

public class Coder {
    private String name;
    private String num;
    private int money;

    public Coder(){

    }

    public Coder(String name,String num,int money){
        this.name = name;
        this.num = num;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public int getMoney() {
        return money;
    }

    public void intro(){
        System.out.println("程序员姓名："+getName()+"\n"+"工号："+getNum());
    }

    public void showSalary(){
        System.out.println("基本工资为："+getMoney()+",奖金无");
    }

    public void work(){
        System.out.println("正在努力写代码……");
    }
}
