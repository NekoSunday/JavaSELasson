package com.sunday.demo01;

import java.io.*;
import java.util.HashMap;

public class softBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:/aaa/i.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/aaa/ou.txt"));

        HashMap<String, String> map = new HashMap<>();
        String line=null;
        while ((line=br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(split[0],split[1]);
        }
        br.close();

        for (int i = 1; i <= map.size(); i++) {
            String key=String.valueOf(i);
            String value=map.get(key);
            bw.write(key+"."+value);
            bw.newLine();
        }
        bw.close();
    }
}
