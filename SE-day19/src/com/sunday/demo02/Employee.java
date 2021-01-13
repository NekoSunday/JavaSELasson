package com.sunday.demo02;

import java.io.Serializable;

public class Employee implements Serializable {
    public String name;
    public String adress;
    public transient int age;
    public void adressCheck(){
        System.out.println("Adress check:"+name+"--"+adress);
    }
}
