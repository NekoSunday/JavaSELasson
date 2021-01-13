package com.sunday.demo02;

public class reflactPratice {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        test02();
    }

    private static void test04() {

    }

    private static void test03() {
        Class<Student> c = Student.class;
        System.out.println(c);
    }

    private static void test02() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c=Class.forName("java.lang.String");
        String name=c.getSimpleName();
        String Index=c.getName();
        String str=(String) c.newInstance();
        System.out.println(str);
    }

    private static void test01() {
        Student stu = new Student();
        Class<? extends Student> c = stu.getClass();
        System.out.println(c);
    }
}
