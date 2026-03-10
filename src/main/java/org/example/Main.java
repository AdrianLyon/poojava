package org.example;

import org.example.entities.Employee;
import org.example.services.Menu;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.showMenus();
        Path path = Paths.get("data.txt");

        if (!Files.exists(path)){
            System.out.println("No existe file");
        }
        String newLine = "d";
        Files.write(path,
                (newLine + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE,StandardOpenOption.APPEND);

        System.out.println("****** Read files ******");
        List<String> lines = Files.readAllLines(path);

        for(String line : lines){
            System.out.println(line);
        }
    }
}
/*Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        employee.setFullName(scanner.nextLine());
        System.out.println("Enter your worked hours: ");
        employee.setHours(scanner.nextDouble());
        System.out.println("Enter your salary: ");
        employee.setSalary(scanner.nextDouble());
        String newLine = employee.getFullName() + ";"+employee.getHours()+";"+employee.getSalary();
        scanner.close();*/