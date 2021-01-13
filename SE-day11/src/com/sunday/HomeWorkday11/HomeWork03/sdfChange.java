package com.sunday.HomeWorkday11.HomeWork03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class sdfChange {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Date time = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(time);
        System.out.println("转换格式之前的日期:"+format);
        sdf.applyPattern("yyyy年MM月dd日");
        String format2=sdf.format(time);
        System.out.println("转换格式之后的日期:"+format2);
    }
}
