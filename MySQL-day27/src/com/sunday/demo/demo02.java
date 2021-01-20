package com.sunday.demo;

import com.sun.java.accessibility.AccessBridge;
import org.junit.Test;

public class demo02 {
    @Test
    public void test01(){
        System.out.println(String.class.getClassLoader());

        System.out.println(AccessBridge.class.getClassLoader());

        System.out.println(demo01.class.getClassLoader());
    }
}
