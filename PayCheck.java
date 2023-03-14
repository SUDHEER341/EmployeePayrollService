package com.payrollservice;
public class PayCheck {
    private String firstName;
    private String lastName;
    private int Id;
    private double netAmount;

    public PayCheck(String first, String last, int id, double wage, double hours) {
        firstName = first;
        lastName = last;
        Id = id;
        netAmount = wage * hours;
    }

    public String toString() {
        return "Paycheck issued for " + netAmount + "to " + firstName + ", "+ lastName + ", employee ID " + Id;
    }
}
