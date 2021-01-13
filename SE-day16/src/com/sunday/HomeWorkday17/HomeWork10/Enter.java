package com.sunday.HomeWorkday17.HomeWork10;

import java.util.Scanner;

public class Enter implements Runnable{
    private Person person;

    public Enter(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                System.out.println("输入需要录入的姓名");
                String name = new Scanner(System.in).next();
                System.out.println("输入需要录入的性别");
                String sex = new Scanner(System.in).next();
                if (sex.equals("男") || sex.equals("女")) {
                    System.out.println("录入成功");
                    person.setName(name);
                    person.setSex(sex);
                    try {
                        person.notify();
                        person.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("无法录入其它性别,请重新输入");
                }
            }
        }
    }
}
