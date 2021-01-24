package com.sunday.demo07;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test {
    @Test
    public void test01(){
        Direction d = Direction.BEHIND;
        switch (d) {
            case FRONT:
                System.out.println("前面");
                break;
            case BEHIND:
                System.out.println("后面");
                break;
            case LEFT:
                System.out.println("左面");
                break;
            case RIGHT:
                System.out.println("右面");
                break;
            default:
                System.out.println("错误的方向");
        }
        Direction d1 = d;
        System.out.println(d1);
        d.show01();

        int ordinal = d.ordinal();
        System.out.println(ordinal);
    }

    @Test
    public void test02(){
        try {
            Direction dc = Direction.BEHIND;
            Class<Direction> declaringClass = dc.getDeclaringClass();
            Method show02 = declaringClass.getDeclaredMethod("show02");
            show02.setAccessible(true);
            show02.invoke(dc, (Object) null);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
