package com.sunday.HomeWorkday21.HomeWork09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\JavaSE\\SE-day21\\src\\com\\sunday\\HomeWorkday21\\HomeWork09\\test.properties");
        if (!file.isFile()){
            file.createNewFile();
        }

        Properties prop = new Properties();
        prop.load(new InputStreamReader(new FileInputStream(file)));
        String count = prop.getProperty("count");
        if (count==null){
            count="0";
        }
        int inCount = Integer.parseInt(count);
        if (inCount<3){
            System.out.println("程序使用了1次，还剩余"+(2-inCount)+"次");
            inCount=inCount+1;
            String newcount = String.valueOf(inCount);
            prop.setProperty("count",newcount);
            prop.store(new FileOutputStream("D:\\JavaSE\\SE-day21\\src\\com\\sunday\\HomeWorkday21\\HomeWork09\\test.properties",true),"");
        }else {
            System.out.println("程序使用次数已满，请续费");
        }
    }
}
