package com.sunday.HomeWorkday21.HomeWork08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class testSout {
    public static void main(String[] args) throws Exception {
        Student student = creatObj();
        System.out.println(student);

        Class<DemoClass> dc = DemoClass.class;
        DemoClass demoClass = dc.newInstance();
        Method run = dc.getMethod("run");
        //run.invoke(demoClass);为运行方法
        Object invoke = run.invoke(demoClass);
        System.out.println(invoke);
    }
    public static Student creatObj() throws Exception{
        Properties prop = new Properties();
        prop.load(testSout.class.getResourceAsStream("/stu.properties"));
        String className=prop.getProperty("class");
        Class<?> forName = Class.forName(className);
        Object o = forName.newInstance();
        Set<String> strings = prop.stringPropertyNames();
        for (String s : strings) {
            if (s.equals("class"))continue;
            String value = prop.getProperty(s);
            Field df = forName.getDeclaredField(s);
            df.setAccessible(true);
            Class<?> type = df.getType();
            if (type==int.class){
                df.setInt(o,Integer.parseInt(value));
            }else {
                df.set(o,value);
            }
        }
        return (Student) o;
    }
}
