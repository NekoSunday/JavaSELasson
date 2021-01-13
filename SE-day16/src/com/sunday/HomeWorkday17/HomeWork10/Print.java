package com.sunday.HomeWorkday17.HomeWork10;

public class Print implements Runnable{
    private Person person;

    public Print(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            synchronized (person){
                System.out.println("姓名为："+person.getName()+",性别为："+person.getSex());
                try {
                    person.notify();
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
