package com.sunday;

import com.utilpackage.sqlUtils;
import com.utilpackage.util;

import static com.sunday.Worker.indexJudge;
import static com.sunday.Worker.workerList;

public interface IdentityImpl {

    default void setEmployeeIdentity() throws Exception {
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
        printPersonalIdentity(searchName);
        MainSystem.printIdentityMenu();
    }

    default void changeEmployeeIdentity() throws Exception {
        util.flushBw("请输入员工ID：");
        Integer indexChange = util.getIntegar();
        String sql = "select * from employee_identity where id = '" + indexChange + "';";
        MainSystem.rs = MainSystem.stmt.executeQuery(sql);
        /*if (!workerList.containsKey(indexChange)) {
            System.out.println("输入ID有误");
            changeEmployeeIdentity();
        }*/
        if (!MainSystem.rs.next()) {
            util.flushBw("输入ID有误");
            changeEmployeeIdentity();
        }
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
        MainSystem.stmt.executeUpdate(sqlUtils.updateIdentityValue("employee_identity", indexChange, indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]));
        /* workerList.get(indexChange).name = indexJudge[0];
        workerList.get(indexChange).job = indexJudge[1];
        workerList.get(indexChange).department = indexJudge[2];
        workerList.get(indexChange).phoneNum = indexJudge[3];
        workerList.get(indexChange).getDate = util.getTime();*/
        util.flushBw("修改成功");
//        SalaryImpl.getSumSalary(workerList.get(indexChange));
        MainSystem.printIdentityMenu();
    }

    default void showAllEmployeeIdentity() throws Exception {
        util.printBw("员工列表：");
        util.flushBw("id       姓名      职务       部门        电话");
        printIdentityList();
        MainSystem.printIdentityMenu();
    }

    static void setWorker() throws Exception {
        MainSystem.stmt.executeUpdate(sqlUtils.insertValue("employee_identity", 5, "null", indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]));
        util.printBw("添加成功");
        util.bw.write("添加的员工信息为---");
        printPersonalIdentity(indexJudge[0]);
        MainSystem.printIdentityMenu();
    }

    static void printPersonalIdentity(String str) throws Exception {
        String sql = "select * from employee_identity where ename='" + str + "';";
        sqlUtils.printIdentityValues(sql);
    }

    static void printIdentityList() throws Exception {
        String sql = "select * from employee_identity;";
        sqlUtils.printIdentityValues(sql);
    }
}
