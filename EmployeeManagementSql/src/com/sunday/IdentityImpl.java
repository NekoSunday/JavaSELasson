package com.sunday;

import com.utilpackage.sqlUtils;
import com.utilpackage.util;

import static com.sunday.Worker.indexJudge;

public interface IdentityImpl {

    default void setEmployeeIdentity() throws Exception {
        util.flushBw("������Ա������");
        String indexName = util.readClient();
        indexJudge[0] = indexName;
        util.flushBw("ְλ");
        String indexJob = util.readClient();
        indexJudge[1] = indexJob;
        util.flushBw("����");
        String indexDepartment = util.readClient();
        indexJudge[2] = indexDepartment;
        util.flushBw("�绰");
        String indexPhoneNum = util.readClient();
        indexJudge[3] = indexPhoneNum;
        if (sqlUtils.checkIdentityValue(indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3])!=-1){
            util.flushBw("��Ա���Ѵ���");
            MainSystem.printIdentityMenu();
        }else {
            setWorker();
        }
    }

    default void deleteEmployeeIdentity() throws Exception {
        util.flushBw("������Ա��ID��");
        Integer indexDelete = util.getIntegar();
        if (indexDelete==-1){
            util.flushBw("����ID����");
            MainSystem.printIdentityMenu();
        }else {
            String sql = "select * from employee_identity where id =" + indexDelete + ";";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            if (!MainSystem.rs.next()) {
                util.flushBw("����ID����");
                MainSystem.printIdentityMenu();
            } else {
                printPersonalIdentity(sql);
                MainSystem.stmt.executeUpdate(sqlUtils.deleteIdentityValue("employee_identity", indexDelete));
                util.flushBw("ɾ���ɹ�");
                MainSystem.printIdentityMenu();
            }
        }
    }


    default void showEmployeeIdentity() throws Exception {
        util.flushBw("������Ա��������");
        String searchName = util.readClient();
        printPersonalIdentity(searchName);
        MainSystem.printIdentityMenu();
    }

    default void changeEmployeeIdentity() throws Exception {
        util.flushBw("������Ա��ID��");
        Integer indexChange = util.getIntegar();
        if (indexChange==-1){
            util.flushBw("����ID����");
            MainSystem.printIdentityMenu();
        }else {
            String sql = "select * from employee_identity where id = '" + indexChange + "';";
            MainSystem.rs = MainSystem.stmt.executeQuery(sql);
            if (!MainSystem.rs.next()) {
                util.flushBw("����ID����");
                MainSystem.printIdentityMenu();
            } else {
                util.flushBw("������Ա������");
                String indexName = util.readClient();
                indexJudge[0] = indexName;
                util.flushBw("ְλ");
                String indexJob = util.readClient();
                indexJudge[1] = indexJob;
                util.flushBw("����");
                String indexDepartment = util.readClient();
                indexJudge[2] = indexDepartment;
                util.flushBw("�绰");
                String indexPhoneNum = util.readClient();
                indexJudge[3] = indexPhoneNum;
                MainSystem.stmt.executeUpdate(sqlUtils.updateIdentityValue("employee_identity", indexChange, indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]));
                util.flushBw("�޸ĳɹ�");
                MainSystem.stmt.executeUpdate(sqlUtils.updateSalaryValue("employee_salary", indexChange, "0", "0", "0", "" + sqlUtils.checkJob(indexChange) + "", indexName));
                MainSystem.printIdentityMenu();
            }
        }
    }

    default void showAllEmployeeIdentity() throws Exception {
        util.printBw("Ա���б�");
        util.flushBw("id       ����      ְ��       ����        �绰");
        printIdentityList();
        MainSystem.printIdentityMenu();
    }

    static void setWorker() throws Exception {
        MainSystem.stmt.executeUpdate(sqlUtils.insertValue("employee_identity", 5, "null", indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]));
        int indexid=sqlUtils.checkIdentityValue(indexJudge[0], indexJudge[1], indexJudge[2], indexJudge[3]);
        MainSystem.stmt.executeUpdate(sqlUtils.insertValue("employee_salary",7,""+indexid+"",""+indexJudge[0]+"","0","0","0",""+sqlUtils.checkJob(indexid)+"",""+util.getTime()+""));
        util.printBw("��ӳɹ�");
        util.bw.write("��ӵ�Ա����ϢΪ---");
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
