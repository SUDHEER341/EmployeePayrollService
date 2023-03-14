package com.payrollservice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeData
{
    public  static ArrayList<EmployeeDetails> employeeList = new ArrayList<>();
    public void setEmployee(Scanner scanner)
    {
        System.out.println("Please enter the employee id:  ");
        int id = scanner.nextInt();
        System.out.println("Please enter the employee name :");
        String name = scanner.next();
        System.out.println("Please enter the employee Salary :");
        double salary = scanner.nextInt();
        employeeList.add(new EmployeeDetails(id,name,salary));
    }
    public void getEmployee()
    {
        employeeList.forEach(System.out::println);

    }
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        EmployeeData empObj= new EmployeeData();
        empObj.setEmployee(scanner);
        empObj.getEmployee();
    }
}