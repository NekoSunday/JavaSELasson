package com.sunday;

import com.utilpackage.sqlUtils;
import com.utilpackage.util;

//import static com.sunday.Employee.workerList;

public interface SalaryImpl {
    default void setEmployeeSalary() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexId=util.getIntegar();
        String sql = "select * from employee_salary where e_id = '" + indexId + "';";
        MainSystem.rs = MainSystem.stmt.executeQuery(sql);
        if (!MainSystem.rs.next()) {
            util.flushBw("输入ID有误");
            MainSystem.printSalaryMenu();
        }
        util.flushBw("工作时长：");
        Double indexWorkTime = util.getDouble();
        util.flushBw("工作单价：");
        Double indexSalaryPerHour = util.getDouble();
        util.flushBw("出勤奖金：");
        Double indexBonusMoney = util.getDouble();
        MainSystem.stmt.executeUpdate(sqlUtils.updateSalaryValue("employee_salary",indexId,indexWorkTime.toString(),indexSalaryPerHour.toString(),indexBonusMoney.toString(),getSumSalary(indexId,indexWorkTime,indexSalaryPerHour,indexBonusMoney).toString()));
        util.printBw("添加成功！");
        util.printBw("员工信息为：");
        printPersonalSalary(sql);
        MainSystem.printSalaryMenu();
    }
    default void deleteEmployeeSalary() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexDelete = util.getIntegar();
        String sql = "select * from employee_salary where e_id = '" + indexDelete + "';";
        MainSystem.rs = MainSystem.stmt.executeQuery(sql);
        if (!MainSystem.rs.next()) {
            util.flushBw("输入ID有误");
            MainSystem.printSalaryMenu();
        }
        printPersonalSalary(sql);
        MainSystem.stmt.executeUpdate(        sqlUtils.updateSalaryValue("employee_salary",indexDelete,"0","0","0","0"));
        util.flushBw("删除成功");
        MainSystem.printSalaryMenu();
    }
    default void showEmployeeSalary() throws Exception {
        util.flushBw("请输入员工姓名：");
        String searchName = util.readClient();
        String sql="select * from employee_salary where e_id=(select id from employee_identity where ename='"+searchName+"');";
        sqlUtils.printSalaryValues(sql);
        MainSystem.printSalaryMenu();
    }
    default void changeEmployeeSalary() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexChange = util.getIntegar();
        String sql = "select * from employee_salary where e_id = '" + indexChange + "';";
        MainSystem.rs = MainSystem.stmt.executeQuery(sql);
        if (!MainSystem.rs.next()) {
            util.flushBw("输入ID有误");
            MainSystem.printSalaryMenu();
        }
        util.printBw("员工信息为：");
        sqlUtils.printSalaryValues(sql);
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
        MainSystem.stmt.executeUpdate(sqlUtils.updateSalaryValue("employee_salary",indexChange,indexWorkTime.toString(),indexSalaryPerHour.toString(),indexBonusMoney.toString(),getSumSalary(indexChange,indexWorkTime,indexSalaryPerHour,indexBonusMoney).toString()));
        util.printBw("修改成功！");
        util.flushBw("修改的信息为：");
        printPersonalSalary(sql);
        MainSystem.printSalaryMenu();
    }
    default void showAllEmployeeSalary() throws Exception {
        util.printBw("工资列表：");
        util.printBw("id       姓名      工作时长       工作单价        工资总额      操作日期");
        String sql = "select * from employee_salary;";
        sqlUtils.printSalaryValues(sql);
        MainSystem.printSalaryMenu();
    }

    static Double getSumSalary(int id,double workTime,double salaryPerHour,double bonusMoney) {
        return workTime*salaryPerHour*21+bonusMoney+sqlUtils.checkJob(id);

    }
    static void printPersonalSalary(String sql) throws Exception {
        sqlUtils.printSalaryValues(sql);
    }
}
