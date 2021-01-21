package com.sunday.dynamicProxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class demo {
    @Test
    public void test01() throws Exception {
        /*UserServiceImpl userService = (UserServiceImpl) Proxy.newProxyInstance(
                demo.class.getClassLoader(),
                new Class[]{UserServiceImpl.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(new UserService());
                        System.out.println("test");
                        return null;
                    }
                });*/


        Object test = Proxy.newProxyInstance(
                demo.class.getClassLoader(),
                new Class[]{UserServiceImpl.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(new UserService());
                        System.out.println("test");
                        return null;
                    }
                });

        UserServiceImpl t = (UserServiceImpl) test;

        t.save();
    }
}
