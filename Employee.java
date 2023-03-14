package com.payrollservice;

public class Employee {
    private String firstName;
    private String lastName;
    private int ID;
    private double hourlyWage;
    private double hoursWorked;

    public Employee(String first, String last, int id, double wage, double hours) {
        firstName = first;
        lastName = last;
        ID = id;
        hourlyWage = wage;
        hoursWorked = hours;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double calcPay(double wage, double hours) {
        wage = getHourlyWage();
        hours = getHoursWorked();

        return wage * hours;
    }
}
