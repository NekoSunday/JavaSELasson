package com.sunday.tcpPratice;

public interface InterfacePratice {

    void test01();

    default void test02() {
        System.out.println("调用了默认方法test02");
        test04();
    }

    static void test03(){
        System.out.println("调用了静态方法test03");
    }

    private void test04(){
        System.out.println("调用私有方法test04");
    }

}
