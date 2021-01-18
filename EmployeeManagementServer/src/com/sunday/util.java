package com.sunday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class util {

    static ServerSocket ss;
    static Socket socket;
    static BufferedWriter bw;
    static BufferedReader br;

    public static String getTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Integer getIntegar() throws IOException {
        String integarIndex = readClient();
        return Integer.valueOf(integarIndex);
    }

    public static Double getDouble() throws IOException {
        String doubleIndex= readClient();
        return Double.valueOf(doubleIndex);
    }
    public static void printBw(String str) throws Exception {
        util.bw.write(str);
        util.bw.newLine();
    }
    public static void flushBw(String str) throws Exception{
        util.bw.write(str);
        util.bw.newLine();
        util.bw.flush();
    }

    public static String readClient() throws IOException {
        return br.readLine();
    }
}
