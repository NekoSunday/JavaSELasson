package com.sunday.tcpPratice;

public class InterfaceImplPratice implements InterfacePratice2,InterfacePratice {

    static {
        System.out.println("子类在运作中");
    }
    @Override
    public void test01() {
        System.out.println("test01作用中……");
    }

    @Override
    public void test02() {

    }


}
