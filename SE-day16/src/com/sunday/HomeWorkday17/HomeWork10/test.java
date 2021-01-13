package com.sunday.HomeWorkday17.HomeWork10;

public class test {
    public static void main(String[] args) {
        Person person = new Person();

        Enter enter = new Enter(person);
        Print print = new Print(person);

        new Thread(enter).start();
        new Thread(print).start();
    }
}
