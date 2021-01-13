package com.sunday.anli;

public class Keyboard extends Brand implements USB{

    public Keyboard(String brand, double price) {
        super(brand, price);
    }

    public void enter(){
        System.out.println("键盘键入");
    }

    @Override
    public void open() {
        System.out.println("价格为"+super.getPrice()+"的"+this.getBrand()+"键盘插入");
    }

    @Override
    public void close() {
        System.out.println(this.getBrand()+"键盘拔出");
    }
}
