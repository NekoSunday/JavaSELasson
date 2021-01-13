package com.sunday.HomeWorkday11.HomeWork03;

public class Goods {
    private String id;
    private String name;
    private double SinglePrice;
    private String PriceUnit;
    private int buyNum;

    public int getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(int buyNum) {
        this.buyNum = buyNum;
    }

    public Goods(String id, String name, double singlePrice, String priceUnit) {
        this.id = id;
        this.name = name;
        SinglePrice = singlePrice;
        PriceUnit = priceUnit;
    }

    public Goods() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSinglePrice() {
        return SinglePrice;
    }

    public void setSinglePrice(double singlePrice) {
        SinglePrice = singlePrice;
    }

    public String getPriceUnit() {
        return PriceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        PriceUnit = priceUnit;
    }
}
