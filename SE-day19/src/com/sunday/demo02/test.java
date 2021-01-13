package com.sunday.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.name="张三";
        employee.adress="北京市";
        employee.age=20;
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d:/aaa/employee.txt"));
        out.writeObject(employee);
        out.close();
        System.out.println("Serialized data is saved");

    }
}
