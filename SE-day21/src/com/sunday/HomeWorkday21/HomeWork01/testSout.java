package com.sunday.HomeWorkday21.HomeWork01;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class testSout {

    static Calculator c;

    @BeforeClass
    public static void beforeClass(){
        c=new Calculator();
    }
    @Test
    public void test01(){
        System.out.println(c.add(20, 20));
    }
    @Test
    public void test02(){
        System.out.println(c.minus(20, 20));
    }
    @Test
    public void test03(){
        System.out.println(c.cheng(20, 20));
    }
    @Test
    public void test04(){
        System.out.println(c.chu(20, 20));
    }

    @AfterClass
    public static void after(){
        c=null;
    }
}
