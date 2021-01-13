package com.sunday.demo03;


//定义一个计算的骨架，在实现类中继承，重写，再获取骨架中的方法
abstract class getTime {
    public final long getTime(){
        long start=System.currentTimeMillis();
        Code();
        long end = System.currentTimeMillis();
        return end-start;
    }
    //code是重写方法体，去测试多个不同的方法体所需时间
    public abstract void Code();
}
