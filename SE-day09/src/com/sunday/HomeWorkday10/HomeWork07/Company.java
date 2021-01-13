package com.sunday.HomeWorkday10.HomeWork07;

public class Company implements Money {

    private double CompanyMoney;

    public Company(double companyMoney) {
        CompanyMoney = companyMoney;
    }

    public double getCompanyMoney() {
        return CompanyMoney;
    }

    public void setCompanyMoney(double companyMoney) {
        CompanyMoney = companyMoney;
    }

    @Override
    public void paySalary(Employee employee) {
        setCompanyMoney(getCompanyMoney()-employee.getSalary());
        System.out.println("给"+employee.getName()+"发工资"+employee.getSalary()+"元,公司剩余"+getCompanyMoney()+"元");
    }
}
