package com.sunday.demo02;

import java.util.ArrayList;

public class ArrayClass<T> {
    private T t;
    private ArrayList<T> list=new ArrayList<>();

    public void addList(T t){
        list.add(t);
    }

    public void showList(){
        System.out.println(list);
    }

    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }
}
