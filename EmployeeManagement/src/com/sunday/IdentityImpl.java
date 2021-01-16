package com.sunday;

import java.util.Map;
import java.util.Set;

import static com.sunday.Employee.*;

public interface IdentityImpl {

    default void setEmployeeIdentity() {
        System.out.println("请输入员工姓名");
        String indexName = util.enterStr();
        /*while (true){
            for (Worker worker : workerList.values()) {
                if (indexName.equals(worker.name)){
                    System.out.println("该员工已存在");
                    break;
                }
            }
            MainSystem.printIdentityMenu();
            break;
        }*/
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

    default void deleteEmployeeIdentity() {
        System.out.println("请输入员工ID：");
        int indexDelete = util.getIntegar();
        if (!workerList.containsKey(indexDelete)) {
            System.out.println("输入ID有误");
            MainSystem.printIdentityMenu();
        }
        Employee removeWorker = workerList.remove(indexDelete);
        System.out.println("删除成功");
        System.out.println(removeWorker.toString());
        MainSystem.printIdentityMenu();
    }


    default void showEmployeeIdentity() {
        System.out.println("请输入员工姓名：");
        String searchName = util.enterStr();
            for (Employee employee : workerList.values()) {
            if (searchName.equals(employee.name)) {
                System.out.println("员工信息为：");
                printPersonalIdentity(employee);
                break;
            }
        }
        MainSystem.printIdentityMenu();
    }

    default void changeEmployeeIdentity() {
        System.out.println("请输入员工ID：");
        int indexChange = util.getIntegar();
        if (!workerList.containsKey(indexChange)) {
            System.out.println("输入ID有误");
            changeEmployeeIdentity();
        }
        System.out.println(workerList.get(indexChange).toString());
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
        workerList.get(indexChange).name = indexJudge[0];
        workerList.get(indexChange).job = indexJudge[1];
        workerList.get(indexChange).department = indexJudge[2];
        workerList.get(indexChange).phoneNum = indexJudge[3];
        workerList.get(indexChange).getDate = util.getTime();
        System.out.println("修改成功");
        System.out.println(workerList.get(indexChange).toString());
        MainSystem.printIdentityMenu();
    }

    default void showAllEmployeeIdentity() {
        System.out.println("员工列表：");
        System.out.println("id       姓名      职务       部门        电话");
        for (Employee employee : workerList.values()) {
            printIdentityList(employee);
        }
        MainSystem.printIdentityMenu();
    }
    static void setWorker() {
        Employee employeeIndex=new Employee(indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]);
        workerList.put(employeeId++, employeeIndex);
        System.out.println("添加成功");
        System.out.print("添加的员工信息为---");
        printPersonalIdentity(employeeIndex);
        MainSystem.printIdentityMenu();
    }
    static void printPersonalIdentity(Employee employee) {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                System.out.println("ID：" + id + "，姓名：" + employee.name + "，职务：" + employee.job + "，部门：" + employee.department + "，电话：" + employee.phoneNum);
            }
        }
    }

    static void printIdentityList(Employee employee) {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                System.out.println(id + "        " + employee.name + "        " + employee.job + "        " + employee.department + "        " + employee.phoneNum);
            }
        }
    }
}
