package com.sunday.HomeWorkday1501.HomeWork08;

public class test {
    public static void main(String[] args) {
        ticket saleTicket = new ticket();
        Thread t1 = new Thread(saleTicket, "窗口a");
        Thread t2 = new Thread(saleTicket, "窗口b");
        Thread t3 = new Thread(saleTicket, "窗口c");
        Thread t4 = new Thread(saleTicket, "窗口d");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
