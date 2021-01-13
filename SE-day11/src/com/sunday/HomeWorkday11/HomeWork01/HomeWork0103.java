package com.sunday.HomeWorkday11.HomeWork01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork0103 {
    public static void main(String[] args) {
        Date now=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(now));
    }
}
