package com.sunday.HomeWorkday10.HomeWork04;

public class Worker{
    public void pickApple(CompareAble compareAble,Apple a1,Apple a2){
        System.out.println(compareAble.compare(a1, a2).getSize()+"-"+compareAble.compare(a1, a2).getColor());
    }
}
