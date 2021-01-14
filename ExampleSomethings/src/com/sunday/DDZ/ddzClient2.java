package com.sunday.DDZ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ddzClient2 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String card = br.readLine();
        System.out.println(card);
        br.close();
    }
}
