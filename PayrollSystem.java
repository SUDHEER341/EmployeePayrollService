package com.payrollservice;

import java.util.List;
import java.util.ArrayList;

public class PayrollSystem {
    public List<Employee> employees = new ArrayList<Employee>();
    public String companyName;

    PayrollSystem(String company) {
        companyName = company;
    }

    void addEmployee(Employee a) {
        employees.add(a);
    }

    void getHoursWorked(double hrs) {
        this.a.getHoursWorked();
    }

    void issueCheck() {
        double checkAmount = this.a.calcPay(a.getHoursWorked(), a.getHourlyWage());

        PayCheck check = new PayCheck(a.getFirstName(), a.getLastName(),  a.getID(), a.getHoursWorked(), a.getHourlyWage());

        check.toString();
    }
}
