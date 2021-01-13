package com.sunday.HomeWorkday10.HomeWork05;

public class Player {
    public void FigheAbleselect(String str){
        if (str.equals("法力角色")){
            System.out.println("选择："+str);
            Magic magic = new Magic();
            magic.specialFight();
            magic.commonFight();
        }else if (str.equals("武力角色")){
            System.out.println("选择："+str);
            Fighter fighter = new Fighter();
            fighter.specialFight();
            fighter.commonFight();
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}