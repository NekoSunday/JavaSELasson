package com.sunday.demo02;

public class BaoZi {
    private String name;
    private Double price;
    //用于改变线程状态的判断值
    private Integer flag=0;

    public BaoZi(String name, Double price, Integer flag) {
        this.name = name;
        this.price = price;
        this.flag = flag;
    }

    public BaoZi() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
