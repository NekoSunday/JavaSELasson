package com.sunday;

public class Employee extends Worker implements IdentityImpl, SalaryImpl {
    public static int employeeId = 1;

    public Employee(String name, String job, String department, String phoneNum) {
        super(name, job, department, phoneNum);
    }

    public Employee() {
    }

    public Employee(double workTime, double salaryPerHour, double salarySum, double bonusMoney) {
        super(workTime, salaryPerHour, salarySum, bonusMoney);
    }

    public static Employee employee = new Employee();

    public static void setIdentity() {
        employee.setEmployeeIdentity();
    }

    public static void deleteIdentity() {
        employee.deleteEmployeeIdentity();
    }

    public static void changeIdentity() {
        employee.changeEmployeeIdentity();
    }

    public static void showIdentity() {
        employee.showEmployeeIdentity();
    }

    public static void showAllIdentity() {
        employee.showAllEmployeeIdentity();
    }

    public static void setSalary() {
        employee.setEmployeeSalary();
    }

    public static void deleteSalary() {
        employee.deleteEmployeeSalary();
    }

    public static void changeSalary() {
        employee.changeEmployeeSalary();
    }

    public static void showSalary() {
        employee.showEmployeeSalary();
    }

    public static void showAllSalary() {
        employee.showAllEmployeeSalary();
    }

}
