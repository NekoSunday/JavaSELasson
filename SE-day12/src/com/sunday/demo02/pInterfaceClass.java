package com.sunday.demo02;

public class pInterfaceClass implements pInterface<String>{
    @Override
    public void add(String s) {
        System.out.println("重写输入成功"+ s);
    }

    @Override
    public String getE() {
        return null;
    }
}
