package com.sunday.jichenganli;

import java.util.ArrayList;

public class QZ extends User {
    public QZ(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public ArrayList FHB(double money, int count) {
        ArrayList<Double> list=new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(i,money/count);
        }
        double newLeftMoney = super.getLeftMoney() - money;
        this.setLeftMoney(newLeftMoney);
        return list;
    }
}
