package org.example.services;

import org.example.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addEmployee(){
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter hours: ");
        double hours = scanner.nextDouble();
        System.out.println("Enter your name: ");
        double salary = scanner.nextDouble();
    }
}
