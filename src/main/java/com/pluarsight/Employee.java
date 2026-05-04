package com.pluarsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hourWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hourWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hourWorked = hourWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHourWorked() {
        return hourWorked;
    }
    // Dervived getters
    public double getTotalPay(){

    }
    public double getRegularHours(){

    }
    public double getOvertimeHours{

    }
}

