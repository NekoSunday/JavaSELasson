package com.sunday.jichenganli;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        CY cy1 = new CY("成员1", 10);
        CY cy2 = new CY("成员2", 9);
        CY cy3 = new CY("成员3", 3);
        QZ qz = new QZ("群主", 60);

        ArrayList<Double> list=new ArrayList<>();
        list=qz.FHB(30,3);

        cy1.SHB(cy1.getLeftMoney(),list);
        cy2.SHB(cy2.getLeftMoney(),list);
        cy3.SHB(cy3.getLeftMoney(),list);

        qz.show();
        cy1.show();
        cy2.show();
        cy3.show();


    }
}
