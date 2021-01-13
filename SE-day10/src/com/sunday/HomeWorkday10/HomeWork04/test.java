package com.sunday.HomeWorkday10.HomeWork04;

public class test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");
        //new Compare()可以替换成new CompareAble(){}
        worker.pickApple(new Compare() , a1, a2);
        CompareAble compareAble=new CompareAble() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                if (a1.getColor().equals("红色")){
                    return a1;
                }else if (a2.getColor().equals("红色")){
                    return a2;
                }else {
                    return null;
                }
            }
        };
        worker.pickApple(compareAble,a1,a2);
    }
}
