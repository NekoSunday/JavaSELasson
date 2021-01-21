package com.sunday;

import com.utilpackage.sqlUtils;
import com.utilpackage.util;


public interface SalaryImpl {
    default void setEmployeeSalary() throws Exception {
        String indexname = null;
        util.flushBw("������Ա��ID��");
        Integer indexId = util.getIntegar();
        if (indexId==-1){
            util.flushBw("����ID����");
            MainSystem.printSalaryMenu();
        }else {
            String sql = "select * from employee_salary where e_id = '" + indexId + "';";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            if (!MainSystem.rs.next()) {
                util.flushBw("����ID����");
                MainSystem.printSalaryMenu();
            } else {
                indexname = MainSystem.rs.getString("e_name");
                util.flushBw("����ʱ����");
                Double indexWorkTime = util.getDouble();
                util.flushBw("�������ۣ�");
                Double indexSalaryPerHour = util.getDouble();
                util.flushBw("���ڽ���");
                Double indexBonusMoney = util.getDouble();
                MainSystem.stmt.executeUpdate(sqlUtils.updateSalaryValue("employee_salary", indexId, indexWorkTime.toString(), indexSalaryPerHour.toString(), indexBonusMoney.toString(), getSumSalary(indexId, indexWorkTime, indexSalaryPerHour, indexBonusMoney).toString(), indexname));
                util.printBw("��ӳɹ���");
                util.printBw("Ա����ϢΪ��");
                printPersonalSalary(sql);
                MainSystem.printSalaryMenu();
            }
        }
    }

    default void deleteEmployeeSalary() throws Exception {
        String indexname = null;
        util.flushBw("������Ա��ID��");
        Integer indexDelete = util.getIntegar();
        if (indexDelete==-1){
            util.flushBw("����ID����");
            MainSystem.printSalaryMenu();
        }else {
            String sql = "select * from employee_salary where e_id = '" + indexDelete + "';";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            if (!MainSystem.rs.next()) {
                util.flushBw("����ID����");
                MainSystem.printSalaryMenu();
            } else {
                indexname = MainSystem.rs.getString("e_name");
                printPersonalSalary(sql);
                MainSystem.stmt.executeUpdate(sqlUtils.updateSalaryValue("employee_salary", indexDelete, "0", "0", "0", "" + sqlUtils.checkJob(indexDelete) + "", indexname));
                util.flushBw("ɾ���ɹ�");
                MainSystem.printSalaryMenu();
            }
        }
    }

    default void showEmployeeSalary() throws Exception {
        util.flushBw("������Ա��������");
        String searchName = util.readClient();
        String sql = "select * from employee_salary where e_id=(select id from employee_identity where ename='" + searchName + "');";
        sqlUtils.printSalaryValues(sql);
        MainSystem.printSalaryMenu();
    }

    default void changeEmployeeSalary() throws Exception {
        String indexname = null;
        util.flushBw("������Ա��ID��");
        Integer indexChange = util.getIntegar();
        if (indexChange==-1){
            util.flushBw("����ID����");
            MainSystem.printSalaryMenu();
        }else {
            String sql = "select * from employee_salary where e_id = '" + indexChange + "';";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            if (!MainSystem.rs.next()) {
                util.flushBw("����ID����");
                MainSystem.printSalaryMenu();
            } else {
                indexname = MainSystem.rs.getString("e_name");
            }
            util.printBw("Ա����ϢΪ��");
            sqlUtils.printSalaryValues(sql);
            util.flushBw("����Ϣ�Ƿ���ȷ");
            String judgeChange = util.readClient();
            switch (judgeChange) {
                case "��ȷ":
                    break;
                case "����":
                    changeEmployeeSalary();
                    break;
                default:
                    util.flushBw("�������");
                    changeEmployeeSalary();
                    break;
            }
            util.flushBw("����ʱ����");
            Double indexWorkTime = util.getDouble();
            util.flushBw("�������ۣ�");
            Double indexSalaryPerHour = util.getDouble();
            util.flushBw("���ڽ���");
            Double indexBonusMoney = util.getDouble();
            MainSystem.stmt.executeUpdate(sqlUtils.updateSalaryValue("employee_salary", indexChange, indexWorkTime.toString(), indexSalaryPerHour.toString(), indexBonusMoney.toString(), getSumSalary(indexChange, indexWorkTime, indexSalaryPerHour, indexBonusMoney).toString(), indexname));
            util.printBw("�޸ĳɹ���");
            util.flushBw("�޸ĵ���ϢΪ��");
            printPersonalSalary(sql);
            MainSystem.printSalaryMenu();
        }
    }

    default void showAllEmployeeSalary() throws Exception {
        util.printBw("�����б�");
        util.printBw("id       ����      ����ʱ��       ��������        �����ܶ�      ��������");
        String sql = "select * from employee_salary;";
        sqlUtils.printSalaryValues(sql);
        MainSystem.printSalaryMenu();
    }

    static Double getSumSalary(int id, double workTime, double salaryPerHour, double bonusMoney) {
        return workTime * salaryPerHour * 21 + bonusMoney + sqlUtils.checkJob(id);

    }

    static void printPersonalSalary(String sql) throws Exception {
        sqlUtils.printSalaryValues(sql);
    }
}
