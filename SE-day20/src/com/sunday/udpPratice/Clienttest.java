package com.sunday.udpPratice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Clienttest {
    public static void main(String[] args) throws IOException {
        String str="hello world";
        DatagramPacket p = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getLocalHost(), 8080);
        DatagramSocket socket = new DatagramSocket();
        socket.send(p);
        socket.close();
    }
}
