package com.sunday.HomeWorkday21.HomeWork07;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) throws Exception{
        Class<Person> person=Person.class;
        Constructor<Person> constructor = person.getConstructor(String.class, int.class);
        Person zs = constructor.newInstance("zs", 20);

        Method setname = person.getMethod("setName", String.class);
        Object ls = setname.invoke(zs, "ls");
        System.out.println(ls);

        Field age = person.getDeclaredField("age");
        age.setAccessible(true);
        age.set(zs,23);
        Object o = age.get(zs);
        System.out.println(o);
    }
}
