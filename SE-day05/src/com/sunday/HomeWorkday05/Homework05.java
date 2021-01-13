package com.sunday.HomeWorkday05;

public class Homework05 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setR(8);
        circle.showArea();
        circle.showPerimeter();

        Circle circle1=new Circle(8);
        circle1.showArea();
        circle1.showPerimeter();
    }
}

