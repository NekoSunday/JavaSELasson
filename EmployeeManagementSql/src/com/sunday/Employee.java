package com.sunday;

public class Employee extends Worker implements IdentityImpl, SalaryImpl {
    public static int employeeId = 1;

    static {
        try {
            MainSystem.stmt = MainSystem.system.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public Employee(String name, String job, String department, String phoneNum) {
        super(name, job, department, phoneNum);
    }

    public Employee() {
    }

    public Employee(double workTime, double salaryPerHour, double salarySum, double bonusMoney) {
        super(workTime, salaryPerHour, salarySum, bonusMoney);
    }

    public static Employee employee = new Employee();

    public static void setIdentity() throws Exception {
        employee.setEmployeeIdentity();
    }

    public static void deleteIdentity() throws Exception {
        employee.deleteEmployeeIdentity();
    }

    public static void changeIdentity() throws Exception {
        employee.changeEmployeeIdentity();
    }

    public static void showIdentity() throws Exception {
        employee.showEmployeeIdentity();
    }

    public static void showAllIdentity() throws Exception {
        employee.showAllEmployeeIdentity();
    }

    public static void setSalary() throws Exception {
        employee.setEmployeeSalary();
    }

    public static void deleteSalary() throws Exception {
        employee.deleteEmployeeSalary();
    }

    public static void changeSalary() throws Exception {
        employee.changeEmployeeSalary();
    }

    public static void showSalary() throws Exception {
        employee.showEmployeeSalary();
    }

    public static void showAllSalary() throws Exception {
        employee.showAllEmployeeSalary();
    }

}
