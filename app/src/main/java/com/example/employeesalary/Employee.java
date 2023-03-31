package com.example.employeesalary;

public class Employee {
    private double salary;
    private double workHours;
    
    public void getInfo(double salary, double workHours) {
        this.salary = salary;
        this.workHours = workHours;
}
public void addSal() {
    if (salary < 600) {
        salary += 200;
}
}
public void addWork() {
if (workHours > 6) {
salary += 100;
}
 }
public double getSalary() {
return salary;
 }
}