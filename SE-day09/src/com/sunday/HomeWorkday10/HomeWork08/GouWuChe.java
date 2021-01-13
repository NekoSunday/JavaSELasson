package com.sunday.HomeWorkday10.HomeWork08;

import java.util.ArrayList;

public class GouWuChe {
    ArrayList<Goods> list = new ArrayList<>();

    public ArrayList<Goods> getList() {
        return list;
    }


    public void addGoods(Goods goods) {
        list.add(goods);
        System.out.println("加入"+goods.getName()+"成功");
    }

    public void showGoods() {
        System.out.println("您选购的商品为：");
        for (int i = 0; i < list.size(); i++) {
//            Goods g=list.get(i);
            System.out.println(list.get(i).getId()+","+list.get(i).getName()+","+list.get(i).getPrice());
        }
    }

    public void total() {
        double sum=0;
        double offsum=0;
        System.out.println("----------------------------");
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i).getPrice();
            if (list.get(i) instanceof EGoods){
                offsum+=list.get(i).getPrice()*0.88;
            }else{
                offsum+=list.get(i).getPrice();
            }
        }
        System.out.println("原价为："+sum);
        System.out.println("折后价为："+offsum);
    }

}
