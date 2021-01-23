package com.sunday;

public class Worker {
    public String name;
    public String job;
    public String department;
    public String phoneNum;
    public double workTime;
    public double salaryPerHour;
    public double bonusMoney;
    public double salarySum;
    public static String[] indexJudge = new String[4];

    public Worker(String name, String job, String department, String phoneNum) {
        this.name = name;
        this.job = job;
        this.department = department;
        this.phoneNum = phoneNum;
    }

    public Worker(double workTime, double salaryPerHour, double salarySum, double bonusMoney) {
        this.workTime = workTime;
        this.salaryPerHour = salaryPerHour;
        this.bonusMoney = bonusMoney;
        this.salarySum = salarySum;
    }

    public Worker() {
    }

}