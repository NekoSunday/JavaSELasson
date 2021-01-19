package com.sunday;

import com.utilpackage.util;

import java.util.HashMap;

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
    public static HashMap<Integer, Employee> workerList = new HashMap<>();
    public String getDate;

    public Worker(String name, String job, String department, String phoneNum) {
        this.name = name;
        this.job = job;
        this.department = department;
        this.phoneNum = phoneNum;
        this.getDate = util.getTime();
    }

    public Worker(double workTime, double salaryPerHour, double salarySum, double bonusMoney) {
        this.workTime = workTime;
        this.salaryPerHour = salaryPerHour;
        this.bonusMoney = bonusMoney;
        this.salarySum = salarySum;
        this.getDate = util.getTime();
    }

    public Worker() {
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", department='" + department + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", workTime=" + workTime +
                ", salaryPerHour=" + salaryPerHour +
                ", bonusMoney=" + bonusMoney +
                ", salarySum=" + salarySum +
                ", getDate=" + getDate +
                '}';
    }

}