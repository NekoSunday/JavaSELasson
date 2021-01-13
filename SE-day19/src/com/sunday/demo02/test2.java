package com.sunday.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee=null;
        FileInputStream fileIn=new FileInputStream("d:/aaa/employee.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        employee=(Employee)in.readObject();
        in.close();
        fileIn.close();

        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.adress);
    }
}
