package com.sunday.tcpPratice;

public class test {
    private String name;
    private double age;
    private String type;

    public test(String name,double age,String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getType() {
        return type;
    }
    public void printMessage(){
        System.out.println("名字为："+getName()+" 年龄："+getAge()+" 品种："+getType());
    }
}
