package com.utilpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Timestamp;

public class util {

    public static ServerSocket ss;
    public static Socket socket;
    public static BufferedWriter bw;
    public static BufferedReader br;


    public static Timestamp getTime(){
        return new Timestamp(System.currentTimeMillis());
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
