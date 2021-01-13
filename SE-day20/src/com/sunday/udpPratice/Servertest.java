package com.sunday.udpPratice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servertest {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8080);
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);
        int len = packet.getLength();
        System.out.println(len);
        System.out.println(new String(bytes,0,len));
        int port = packet.getPort();
        String ip = packet.getAddress().getHostAddress();
        System.out.println(port);
        System.out.println(ip);
    }
}
