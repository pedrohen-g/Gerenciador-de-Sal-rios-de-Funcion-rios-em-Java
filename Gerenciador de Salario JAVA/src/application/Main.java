package application;

import entities.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee : " + employee);
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println();
        System.out.printf("Updated Data : " +employee);
        sc.close();
    }
}