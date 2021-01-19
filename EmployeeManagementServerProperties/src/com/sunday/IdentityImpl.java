package com.sunday;

import java.util.Map;
import java.util.Set;

import static com.sunday.Employee.employeeId;
import static com.sunday.Worker.indexJudge;
import static com.sunday.Worker.workerList;

public interface IdentityImpl {

    default void setEmployeeIdentity() throws Exception {
        util.flushBw("请输入员工姓名");
        String indexName = util.readClient();
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
        util.flushBw("职位");
        String indexJob = util.readClient();
        indexJudge[1] = indexJob;
        util.flushBw("部门");
        String indexDepartment = util.readClient();
        indexJudge[2] = indexDepartment;
        util.flushBw("电话");
        String indexPhoneNum = util.readClient();
        indexJudge[3] = indexPhoneNum;
        setWorker();
    }

    default void deleteEmployeeIdentity() throws Exception {
       util.flushBw("请输入员工ID：");
        Integer indexDelete = util.getIntegar();
        if (!workerList.containsKey(indexDelete)) {
            util.flushBw("输入ID有误");
            MainSystem.printIdentityMenu();
        }
        Employee removeWorker = workerList.remove(indexDelete);
        System.out.println("删除成功");
        System.out.println(removeWorker.toString());
        MainSystem.printIdentityMenu();
    }


    default void showEmployeeIdentity() throws Exception {
        util.flushBw("请输入员工姓名：");
        String searchName = util.readClient();
            for (Employee employee : workerList.values()) {
            if (searchName.equals(employee.name)) {
                util.printBw("员工信息为：");
                printPersonalIdentity(employee);
                break;
            }
        }
        MainSystem.printIdentityMenu();
    }

    default void changeEmployeeIdentity() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexChange = util.getIntegar();
        if (!workerList.containsKey(indexChange)) {
            System.out.println("输入ID有误");
            changeEmployeeIdentity();
        }
//        util.flushBw(workerList.get(indexChange).toString());
        util.flushBw("请输入员工姓名");
        String indexName = util.readClient();
        indexJudge[0] = indexName;
        util.flushBw("职位");
        String indexJob = util.readClient();
        indexJudge[1] = indexJob;
        util.flushBw("部门");
        String indexDepartment = util.readClient();
        indexJudge[2] = indexDepartment;
        util.flushBw("电话");
        String indexPhoneNum = util.readClient();
        indexJudge[3] = indexPhoneNum;
        workerList.get(indexChange).name = indexJudge[0];
        workerList.get(indexChange).job = indexJudge[1];
        workerList.get(indexChange).department = indexJudge[2];
        workerList.get(indexChange).phoneNum = indexJudge[3];
        workerList.get(indexChange).getDate = util.getTime();
        util.flushBw("修改成功");
        SalaryImpl.getSumSalary(workerList.get(indexChange));
//        System.out.println(workerList.get(indexChange).toString());
        MainSystem.printIdentityMenu();
    }

    default void showAllEmployeeIdentity() throws Exception {
        util.printBw("员工列表：");
        util.flushBw("id       姓名      职务       部门        电话");
        for (Employee employee : workerList.values()) {
            printIdentityList(employee);
        }
        MainSystem.printIdentityMenu();
    }
    static void setWorker() throws Exception {
        Employee employeeIndex=new Employee(indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]);
        workerList.put(employeeId++, employeeIndex);
        util.printBw("添加成功");
        util.bw.write("添加的员工信息为---");
        printPersonalIdentity(employeeIndex);
        MainSystem.printIdentityMenu();
    }
    static void printPersonalIdentity(Employee employee) throws Exception {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                util.flushBw("ID：" + id + "，姓名：" + employee.name + "，职务：" + employee.job + "，部门：" + employee.department + "，电话：" + employee.phoneNum);
            }
        }
    }

    static void printIdentityList(Employee employee) throws Exception {
        Set<Map.Entry<Integer, Employee>> indexSet = workerList.entrySet();
        for (Map.Entry<Integer, Employee> entry : indexSet) {
            if (entry.getValue().name.equals(employee.name)) {
                Integer id = entry.getKey();
                util.printBw(id + "        " + employee.name + "        " + employee.job + "        " + employee.department + "        " + employee.phoneNum);
            }
        }
        util.bw.flush();
    }
}
