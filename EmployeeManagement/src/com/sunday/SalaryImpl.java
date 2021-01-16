package com.sunday;

import java.util.Map;
import java.util.Set;

import static com.sunday.Employee.workerList;
import static com.sunday.Manager.EXTRAMONEY;

public interface SalaryImpl {
    default void setEmployeeSalary(){
        System.out.println("请输入员工ID：");
        int indexId = util.getIntegar();
        System.out.println("工作时长：");
        double indexWorkTime = util.getDouble();
        System.out.println("工作单价：");
        double indexSalaryPerHour = util.getDouble();
        System.out.println("出勤奖金：");
        double indexBonusMoney = util.getDouble();
        Employee employee = workerList.get(indexId);
        employee.workTime = indexWorkTime;
        employee.salaryPerHour = indexSalaryPerHour;
        employee.bonusMoney = indexBonusMoney;
        employee.getDate = util.getTime();
        getSumSalary(employee);
        System.out.println("添加成功！");
        System.out.println("员工信息为：");
        printPersonalSalary(employee);
        MainSystem.printSalaryMenu();
    }
    default void deleteEmployeeSalary(){
        System.out.println("请输入员工ID：");
        int indexDelete = util.getIntegar();
        if (!workerList.containsKey(indexDelete)) {
            System.out.println("输入ID有误");
            MainSystem.printSalaryMenu();
        }
        Employee removeWorkerSalary = workerList.get(indexDelete);
        removeWorkerSalary.getDate = util.getTime();
        System.out.println("删除成功");
        printPersonalSalary(removeWorkerSalary);
        removeWorkerSalary.salarySum = 0;
        removeWorkerSalary.bonusMoney = 0;
        removeWorkerSalary.workTime = 0;
        removeWorkerSalary.salaryPerHour = 0;
        MainSystem.printSalaryMenu();
    }
    default void showEmployeeSalary(){
        System.out.println("请输入员工姓名：");
        String searchName = util.enterStr();
        for (Employee employee : workerList.values()) {
            if (searchName.equals(employee.name)) {
                printPersonalSalary(employee);
                break;
            }
        }
        MainSystem.printSalaryMenu();
    }
    default void changeEmployeeSalary(){
        System.out.println("请输入员工ID：");
        int indexChange = util.getIntegar();
        if (!workerList.containsKey(indexChange)) {
            System.out.println("输入ID有误");
            changeEmployeeSalary();
        }
        System.out.println("员工信息为：");
        printPersonalSalary(workerList.get(indexChange));
        System.out.println("该信息是否正确");
        String judgeChange = util.enterStr();
        switch (judgeChange) {
            case "正确":
                break;
            case "错误":
                changeEmployeeSalary();
                break;
            default:
                System.out.println("输入错误");
                changeEmployeeSalary();
                break;
        }
        System.out.println("工作时长：");
        double indexWorkTime = util.getDouble();
        System.out.println("工作单价：");
        double indexSalaryPerHour = util.getDouble();
        System.out.println("出勤奖金：");
        double indexBonusMoney = util.getDouble();
        Employee employee = workerList.get(indexChange);
        employee.workTime = indexWorkTime;
        employee.salaryPerHour = indexSalaryPerHour;
        employee.bonusMoney = indexBonusMoney;
        employee.getDate = util.getTime();
        getSumSalary(employee);
        System.out.println("修改成功！");
        System.out.println("修改的信息为：");
        printPersonalSalary(employee);
        MainSystem.printSalaryMenu();
    }
    default void showAllEmployeeSalary(){
        System.out.println("工资列表：");
        System.out.println("id       姓名      工作时长       工作单价        工资总额      操作日期");
        for (Employee employee : workerList.values()) {
            printSalaryList(employee);
        }
        MainSystem.printSalaryMenu();
    }

    static void getSumSalary(Employee employee) {
        if (employee.job.equals("经理")) {
            employee.salarySum = employee.workTime * employee.salaryPerHour * 21 + employee.bonusMoney + EXTRAMONEY;
        } else {
            employee.salarySum = employee.workTime * employee.salaryPerHour * 21 + employee.bonusMoney;
        }
    }
    static void printPersonalSalary(Employee employee) {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                System.out.println("ID：" + id + "，姓名：" + employee.name + "，工作时长=" + employee.workTime + "，工时单价=" + employee.salaryPerHour + "，出勤奖金=" + employee.bonusMoney+"，工资总额="+employee.salarySum+"，操作日期："+employee.getDate);
            }
        }
    }

    static void printSalaryList(Employee employee) {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                System.out.println(id + "        " + employee.name + "        " + employee.workTime + "         " + employee.salaryPerHour + "          " +employee.salarySum+"          "+employee.getDate);
            }
        }
    }
}
