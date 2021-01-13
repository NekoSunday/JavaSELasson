package com.sunday.HomeWork.HomeWork04;

public class C extends B {

    private int numc=30;

    public int getNumc() {
        return numc;
    }

    public void setNumc(int numc) {
        this.numc = numc;
    }

    @Override
    public void showB() {
        System.out.println("B类中的numb:"+this.getNumb());
    }

    @Override
    public void showA() {
        System.out.println("A类中的numa:"+this.getNuma());
    }

    public void showC(){
        System.out.println("C类中的numc:"+this.numc);
    }
}
