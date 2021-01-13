package com.sunday.HomeWorkday05;

public class Circle {
    private int r;

    public Circle(){

    }
    public Circle(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void showArea(){
        System.out.println("半径为："+getR()+",面积为:"+(3.14*getR()*getR()));
    }

    public void showPerimeter(){
        System.out.println("半径为："+getR()+",周长为:"+(3.14*getR()*2));
    }
}
