package com.sunday.HomeWorkday18.GQ1.HomeWork08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("d:/aaa/info.txt");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String enter = sc.next();
            if (!enter.equals("886")) {
                writer.write(enter);
            }else{
                writer.close();
                break;
            }
        }
    }
}
