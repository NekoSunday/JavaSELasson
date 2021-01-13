package com.sunday.HomeWorkday11.HomeWork01;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeWork0105 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH,500);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = calendar.getTime();
        System.out.println(sdf.format(date));
    }
}
