package com.sunday.anli;

public class Mouse extends Brand implements USB{


    public Mouse(String brand, double price) {
        super(brand, price);
    }

    public void Click(){
        System.out.println("鼠标点击");
    }

    @Override
    public void open() {
        System.out.println("价格为"+super.getPrice()+"的"+this.getBrand()+"鼠标插入");
    }

    @Override
    public void close() {
        System.out.println(this.getBrand()+"鼠标拔出");
    }
}
