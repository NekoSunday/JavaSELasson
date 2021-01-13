package com.sunday.demo02;

public class pratice {
    public static void main(String[] args) {
        test01();

    }
    //当在方法前都不清楚数据类型的时候，在主方法内再进行数据类型的配置，
    // 但实现类名必须加上与接口相同的数据类型定义
    private static void test04() {
        pInterfaceClass02<Integer> integerpInterfaceClass02 = new pInterfaceClass02<>();
        integerpInterfaceClass02.add(178243330);
    }
    //在实现类中了解到要使用的数据类型时，调用接口时，接口名后加<数据类型>
    private static void test03() {
        pInterfaceClass pInterfaceClass = new pInterfaceClass();
        pInterfaceClass.add("1592211");
    }
    //在实现类中自定义数据类型的用法
    private static void test02() {
        ShowClass showClass = new ShowClass();
        showClass.show("123123");
    }
    //在实现类中自定义数据类型作为在主方法创建不同的数据类型的对象，减少代码重复
    public static void test01(){
        ArrayClass<String> stringArrayClass = new ArrayClass<>();
        stringArrayClass.setT("123456");
        String t = stringArrayClass.getT();
        System.out.println(t);

        ArrayClass<Integer> integerArrayClass = new ArrayClass<>();
        integerArrayClass.setT(123456);
        Integer t1 = integerArrayClass.getT();
        System.out.println(t1);

        ArrayClass<Integer> test=new ArrayClass<>();
        test.addList(123);
        test.showList();
    }
}
