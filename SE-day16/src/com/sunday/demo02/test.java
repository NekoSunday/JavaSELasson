package com.sunday.demo02;

public class test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        SaleBaoZi sale=new SaleBaoZi(bz);
        ProductBaoZi product=new ProductBaoZi(bz);

        new Thread(sale).start();
        new Thread(product).start();
    }
}
