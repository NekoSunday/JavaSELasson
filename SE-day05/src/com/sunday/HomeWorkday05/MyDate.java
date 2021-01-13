package com.sunday.HomeWorkday05;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void showDate(){
        System.out.println("日期："+getYear()+"年"+getMonth()+"月"+getDay()+"日");
    }

    public void isBI(){
        if (getYear()%400!=0||getYear()%4!=0){
            System.out.println(getYear()+"不是润年");
        }else{
            System.out.println(getYear()+"是润年");
        }
    }
}
