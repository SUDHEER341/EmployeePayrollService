package com.payrollservice;

public class EmployeeDetails {
    int id;
    String name;
    double salary;
    public EmployeeDetails(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee Details{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
