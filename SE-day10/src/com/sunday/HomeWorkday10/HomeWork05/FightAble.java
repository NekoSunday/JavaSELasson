package com.sunday.HomeWorkday10.HomeWork05;

public interface FightAble {
    void specialFight();
    default void commonFight(){
        System.out.println("普通打击");
    }
}
