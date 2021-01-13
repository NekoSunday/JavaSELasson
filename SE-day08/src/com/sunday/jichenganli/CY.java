package com.sunday.jichenganli;

import java.util.ArrayList;

public class CY extends User {

    public CY(String name, double leftMoney) {
        super(name, leftMoney);
    }

    public void SHB(double money, ArrayList<Double> list){
        double newLeftMoney= money+list.get(0);
        list.remove(0);
        this.setLeftMoney(newLeftMoney);
    }
}
