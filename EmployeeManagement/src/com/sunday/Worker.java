package com.sunday;

import java.util.HashMap;

public class Worker{
    public static int employeeId=1;
    public String name;
    public String job;
    public String department;
    public String phoneNum;
    public double workTime;
    public double salaryPerHour;
    public double salarySum;
    public double bonusMoney;
    public static String[] indexJudge = new String[4];
    public static HashMap<Integer,Worker> workerList=new HashMap<>();

    public Worker(String name, String job, String department, String phoneNum) {
        this.name = name;
        this.job = job;
        this.department = department;
        this.phoneNum = phoneNum;
    }

    public Worker(double workTime, double salaryPerHour, double salarySum, double bonusMoney) {
        this.workTime = workTime;
        this.salaryPerHour = salaryPerHour;
        this.salarySum = salarySum;
        this.bonusMoney = bonusMoney;
    }

    public Worker() {
    }

    public static void employeeJudge() {
        System.out.println("请输入员工姓名");
        String indexName = util.enterStr();
        indexJudge[0] = indexName;
        System.out.println("职位");
        String indexJob = util.enterStr();
        indexJudge[1] = indexJob;
        System.out.println("部门");
        String indexDepartment = util.enterStr();
        indexJudge[2] = indexDepartment;
        System.out.println("电话");
        String indexPhoneNum = util.enterStr();
        indexJudge[3] = indexPhoneNum;
        setWorker();
    }

    public static void enployeeSalary(){
        System.out.println("请输入员工ID：");
        String indexSearchId = util.enterStr();
        System.out.println("工作时长：");
        String setWorkTime = util.enterStr();
        System.out.println("工作单价：");
        String setSalaryPerHour = util.enterStr();
        System.out.println("出勤奖金：");
        String setBonusMoney = util.enterStr();
        int indexId = Integer.parseInt(indexSearchId);
        double indexWorkTime = Double.parseDouble(setWorkTime);
        double indexSalaryPerHour = Double.parseDouble(setSalaryPerHour);
        double indexBonusMoney = Double.parseDouble(setBonusMoney);
        Worker worker = workerList.get(indexId);
        worker.workTime=indexWorkTime;
        worker.salaryPerHour=indexSalaryPerHour;
        worker.bonusMoney=indexBonusMoney;
        System.out.println(worker.toString());
    }

    public static void setWorker(){
        workerList.put(employeeId++,new Worker(indexJudge[0],indexJudge[1],indexJudge[2],indexJudge[3]));
        MainSystem.printIdentityMenu();
    }

    public static void setSalary(){

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
                ", salarySum=" + salarySum +
                ", bonusMoney=" + bonusMoney +
                '}';
    }
}