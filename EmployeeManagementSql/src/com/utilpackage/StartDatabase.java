package com.utilpackage;

import com.sunday.MainSystem;

import java.sql.SQLException;

public class StartDatabase {
    static {
        try {
            String createDatabase="create database employee_management;";
            String createAdminTable="create table admininfo(" +
                    "username varchar(20) default null," +
                    "password varchar(20) default null ," +
                    "phone_number varchar(13) default null);";
            String createIdentityTable="create table employee_identity(" +
                    "id int(11) not null AUTO_INCREMENT," +
                    "ename varchar(10) not null," +
                    "job varchar(10) default '员工'," +
                    "dept varchar(10) default null," +
                    "phone_number varchar(10) default null," +
                    "primary key (id));";
            String createSalaryTable="create table employee_salary(" +
                    "e_id int (11) not null ," +
                    "e_name varchar (20) default null," +
                    "worktime double default '0'," +
                    "s_per_hour double default '0'," +
                    "bonus_money double default '0'," +
                    "s_sum double default '0'," +
                    "getdate timestamp null default null on update current_timestamp ," +
                    "key e_id(e_id)," +
                    "constraint employee_salary_ibfk_1 foreign key (e_id) references employee_identity(id) ON DELETE CASCADE ON UPDATE CASCADE);";
            MainSystem.stmt.executeUpdate("drop database if exists employee_management;");
            MainSystem.stmt.executeUpdate(createDatabase);
            MainSystem.stmt.executeUpdate("use employee_management;");
            MainSystem.stmt.executeUpdate(createAdminTable);
            MainSystem.stmt.executeUpdate("insert into admininfo values('root','admin',null)");
            MainSystem.stmt.executeUpdate(createIdentityTable);
            MainSystem.stmt.executeUpdate(createSalaryTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void start(){
        System.out.println("数据库初始化成功");
    }
}
