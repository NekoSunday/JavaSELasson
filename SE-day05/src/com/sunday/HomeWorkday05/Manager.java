package com.sunday.HomeWorkday05;

public class Manager {

    private String name;
    private String num;
    private int money;
    private int extraMoney;

    public Manager() {

    }

    public Manager(String name, String num, int money, int extraMoney) {
        this.name = name;
        this.num = num;
        this.money = money;
        this.extraMoney = extraMoney;
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

    public void setExtraMoney(int extraMoney) {
        this.extraMoney = extraMoney;
    }

    public int getExtraMoney() {
        return extraMoney;
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

    public void intro() {
        System.out.println("程序员姓名：" + getName() + "\n" + "工号：" + getNum());
    }

    public void showSalary() {
        System.out.println("基本工资为：" + getMoney() + ",奖金:" + getExtraMoney());
    }

    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码……");
    }
}
