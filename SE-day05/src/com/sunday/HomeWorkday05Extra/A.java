package com.sunday.HomeWorkday05Extra;

public class A {
    private int v=100;
    private int num;

    public int getV() {
        return v;
    }

    public int getNum() {
        return num;
    }

    public void guess(int num){
        this.num=num;
        if(getNum()<getV()){
            System.out.println("小了");
        }else if (getNum()>getV()){
            System.out.println("打了");
        }else{
            System.out.println("猜测成功");
        }
    }
}
