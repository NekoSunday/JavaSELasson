package com.sunday.demo02;

public class Single {
    //饿汉式
    /*private static Single s=new Single();
    //私有化构造，保证其他人不能使用构造方法创建对象
    private Single(){};

    public static Single getSingle() {
        return s;
    }
*/
    //懒汉式(有多线程隐患,synchronized同步避免隐患)
    private static Single s=new Single();
    private Single(){};
    public static synchronized Single getSingle(){
        if (s==null){
            s=new Single();

        }
        return s;
    }
}
