package com.sunday.demo03;

import org.junit.Test;


public class test {
    @Test
    public void test(){
        demoClass dc = new demoClass();
        long time = dc.getTime();
        System.out.println(time);
    }
}
