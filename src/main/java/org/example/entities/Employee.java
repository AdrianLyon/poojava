package org.example.entities;

public class Employee {
    private String fullName;
    private double hours;
    private double salary;

    public Employee(){}
    public Employee(String fullName, double hours, double salary) {
        this.fullName = fullName;
        this.hours = hours;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getHours(){
        return hours;
    }
    public void setHours(double hours){
        this.hours = hours;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
