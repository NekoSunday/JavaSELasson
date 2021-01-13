package com.sunday.tcpPratice.ClientToServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SocketPratice {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8800);
        OutputStream os = socket.getOutputStream();
        os.write("112233".getBytes());
        os.close();
        socket.close();
    }
}
