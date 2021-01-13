package com.sunday.Example;

import com.sunday.Example.reflact.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, IOException {
        Student student = creatStudent();
        System.out.println(student);
    }

    public static Student creatStudent() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Properties prop = new Properties();
        InputStream is = test.class.getResourceAsStream("/stu.properties");
        prop.load(is);
        String classname = prop.getProperty("class");
        Class<?> c = Class.forName(classname);
        Object o = c.newInstance();
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            if (s.equals("class"))continue;
            String value = prop.getProperty(s);
            Field df = c.getDeclaredField(s);
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
