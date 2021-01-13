package com.sunday.HomeWorkday14.HomeWork2.GQ2.HomeWork01;

public class Father {
    public Father() {
    }

    public void eat() throws ToothPainException {
        System.out.println("吃到石子了");
        throw new ToothPainException("牙疼！！！");
    }

    public void drink(){
        System.out.println("喝什么都没有问题");
    }
}
