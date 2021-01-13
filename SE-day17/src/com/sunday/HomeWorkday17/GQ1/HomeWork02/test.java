package com.sunday.HomeWorkday17.GQ1.HomeWork02;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\a.txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
