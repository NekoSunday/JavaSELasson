package com.sunday.HomeWorkday21.HomeWork06;

import com.sunday.HomeWorkday21.HomeWork05.A;

import java.lang.reflect.Field;

public class test{
    public static void main(String[] args) throws Exception{
        A a = new A();
        System.out.println(getProperty(a, "str"));
        setProperty(a,"str",10);
        System.out.println(getProperty(a, "str"));
    }
    public static void setProperty(Object obj,String propertyName,Object value) throws Exception{
        Class<?> c = obj.getClass();
        Field df = c.getDeclaredField(propertyName);
        df.setAccessible(true);
        df.set(obj,value);
    }
    public static Object getProperty(Object obj,String propertyName) throws Exception{
        Class<?> c = obj.getClass();
        Field df = c.getDeclaredField(propertyName);
        df.setAccessible(true);
        Object o = df.get(obj);
        return o;
    }
}
