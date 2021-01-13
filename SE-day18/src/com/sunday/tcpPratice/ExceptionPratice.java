package com.sunday.tcpPratice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionPratice {
    public static void main(String[] args) {
        //try()写进创建流可以避免异常抛出，在方法内自己处理异常
        try( FileReader reader = new FileReader("d:/aaa/d.txt");
             FileWriter writer = new FileWriter("d:/aaa/e.txt",true)) {
            int len;
            while ((len = reader.read()) != -1) {
                writer.write(len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
