package com.sunday.demo02;

public class pInterfaceClass02<E> implements pInterface2<E> {
    @Override
    public void add(E e) {
        System.out.println("输入成功02"+e.toString());
    }

    @Override
    public E getE() {
        return null;
    }
}
