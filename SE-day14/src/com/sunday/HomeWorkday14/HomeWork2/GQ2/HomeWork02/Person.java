package com.sunday.HomeWorkday14.HomeWork2.GQ2.HomeWork02;

public class Person {
    private String name;
    private int lifeValue;

    public Person(String name, int lifeValue) {
        this.name = name;
        if (lifeValue<0){
            throw new NoLifeValueExption("生命值不能为负数:"+this.name);
        }
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue<0){
            throw new NoLifeValueExption("生命值不能为负数:"+this.name);
        }
        this.lifeValue = lifeValue;
    }

    public Person() {
    }
}
