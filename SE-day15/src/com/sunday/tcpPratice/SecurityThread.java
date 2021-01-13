package com.sunday.tcpPratice;

public class SecurityThread {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket, "广州东站");
        Thread t2 = new Thread(ticket, "广州南站");
        Thread t3 = new Thread(ticket, "广州站");

        t1.start();
        t2.start();
        t3.start();
    }
}
