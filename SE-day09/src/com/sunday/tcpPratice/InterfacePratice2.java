package com.sunday.tcpPratice;

public interface InterfacePratice2 {

    void test01();

    default void test02() {
        System.out.println("调用了默认方法test02");
        test04();
    }

    static void test03(){
        System.out.println("调用了静态方法test03");
    }

    private static void test04(){
        System.out.println("调用静态私有方法test04");
    }

}
