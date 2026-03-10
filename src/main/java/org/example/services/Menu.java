package org.example.services;


import java.util.Scanner;

public class Menu {
    private static final EmployeeService employeeService= new EmployeeService();
    private static final Scanner scanner= new Scanner(System.in);
    public void showMenus(){
        while (true) {
            showMenu();
            int option = readOption();

            switch (option) {
                case 1 -> employeeService.addEmployee();
                case 2 -> System.out.print("reading");
                case 3 -> System.out.print("exit");
                default -> throw new IllegalStateException("Unexpected value: " + option);
            }
            if (option == 3) break;
        }
        scanner.close();
    }
    private static void showMenu(){
        System.out.println("1.- Create employee");
        System.out.println("2.- Read all data");
        System.out.println("3.- exit");
        System.out.print("Selection any option: ");
    }
    private static int readOption(){
        try{
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e){
            return -1;
        }
    }
}
