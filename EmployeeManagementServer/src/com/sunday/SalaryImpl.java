package com.sunday;

import java.util.Map;
import java.util.Set;

import static com.sunday.Employee.workerList;
import static com.sunday.Manager.EXTRAMONEY;

public interface SalaryImpl {
    default void setEmployeeSalary() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexId=util.getIntegar();
        util.flushBw("工作时长：");
        Double indexWorkTime = util.getDouble();
        util.flushBw("工作单价：");
        Double indexSalaryPerHour = util.getDouble();
        util.flushBw("出勤奖金：");
        Double indexBonusMoney = util.getDouble();
        Employee employee = workerList.get(indexId);
        employee.workTime = indexWorkTime;
        employee.salaryPerHour = indexSalaryPerHour;
        employee.bonusMoney = indexBonusMoney;
        employee.getDate = util.getTime();
        getSumSalary(employee);
        util.printBw("添加成功！");
        util.printBw("员工信息为：");
        printPersonalSalary(employee);
        MainSystem.printSalaryMenu();
    }
    default void deleteEmployeeSalary() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexDelete = util.getIntegar();
        if (!workerList.containsKey(indexDelete)) {
            util.flushBw("输入ID有误");
            MainSystem.printSalaryMenu();
        }
        Employee removeWorkerSalary = workerList.get(indexDelete);
        removeWorkerSalary.getDate = util.getTime();
        util.flushBw("删除成功");
        printPersonalSalary(removeWorkerSalary);
        removeWorkerSalary.salarySum = 0;
        removeWorkerSalary.bonusMoney = 0;
        removeWorkerSalary.workTime = 0;
        removeWorkerSalary.salaryPerHour = 0;
        MainSystem.printSalaryMenu();
    }
    default void showEmployeeSalary() throws Exception {
        util.flushBw("请输入员工姓名：");
        String searchName = util.readClient();
        for (Employee employee : workerList.values()) {
            if (searchName.equals(employee.name)) {
                printPersonalSalary(employee);
                break;
            }
        }
        MainSystem.printSalaryMenu();
    }
    default void changeEmployeeSalary() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexChange = util.getIntegar();
        if (!workerList.containsKey(indexChange)) {
            util.flushBw("输入ID有误");
            changeEmployeeSalary();
        }
        util.printBw("员工信息为：");
        printPersonalSalary(workerList.get(indexChange));
        util.flushBw("该信息是否正确");
        String judgeChange = util.readClient();
        switch (judgeChange) {
            case "正确":
                break;
            case "错误":
                changeEmployeeSalary();
                break;
            default:
                util.flushBw("输入错误");
                changeEmployeeSalary();
                break;
        }
        util.flushBw("工作时长：");
        Double indexWorkTime = util.getDouble();
        util.flushBw("工作单价：");
        Double indexSalaryPerHour = util.getDouble();
        util.flushBw("出勤奖金：");
        Double indexBonusMoney = util.getDouble();
        Employee employee = workerList.get(indexChange);
        employee.workTime = indexWorkTime;
        employee.salaryPerHour = indexSalaryPerHour;
        employee.bonusMoney = indexBonusMoney;
        employee.getDate = util.getTime();
        getSumSalary(employee);
        util.printBw("修改成功！");
        util.flushBw("修改的信息为：");
        printPersonalSalary(employee);
        MainSystem.printSalaryMenu();
    }
    default void showAllEmployeeSalary() throws Exception {
        util.printBw("工资列表：");
        util.printBw("id       姓名      工作时长       工作单价        工资总额      操作日期");
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
    static void printPersonalSalary(Employee employee) throws Exception {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                util.flushBw("ID：" + id + "，姓名：" + employee.name + "，工作时长=" + employee.workTime + "，工时单价=" + employee.salaryPerHour + "，出勤奖金=" + employee.bonusMoney+"，工资总额="+employee.salarySum+"，操作日期："+employee.getDate);
            }
        }
    }

    static void printSalaryList(Employee employee) throws Exception {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                util.printBw(id + "        " + employee.name + "        " + employee.workTime + "         " + employee.salaryPerHour + "          " +employee.salarySum+"          "+employee.getDate);
            }
        }
        util.bw.flush();
    }
}
