package com.sunday.demo01;

import java.util.Calendar;

public class CalendarPratice {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();

//        getDay(c);
//        setDay(c);
        addDay(c);
    }

    private static void addDay(Calendar c) {
        c.add(c.YEAR,2);
        c.add(c.MONTH,-5);
        c.add(c.DAY_OF_MONTH,-2);
        getDay(c);
    }

    private static void setDay(Calendar c) {
        c.set(c.YEAR,2012);
        c.set(c.MONTH,2);
        c.set(c.DAY_OF_MONTH,25);
        getDay(c);
    }

    private static void getDay(Calendar c) {
        System.out.println(c.get(c.YEAR));
        System.out.println(c.get(c.MONTH));
        System.out.println(c.get(c.DAY_OF_MONTH));
        System.out.println(c.get(c.DAY_OF_WEEK));
    }
}
