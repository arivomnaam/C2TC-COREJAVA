package com.dhevendhiran.assignment.employees;
//Importing scanner utilities.
import java.util.Scanner;
//Import EmployeeUtilities class to print data.
import com.dhevendhiran.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		//Scanner to get input from user.
		Scanner scanner = new Scanner(System.in);
		//input for Manager
        System.out.println("Enter Manager Details");
        System.out.println("---------------------");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();//create  newline
        System.out.print("Employee ID: ");
        int managerId = scanner.nextInt();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        Manager manager = new Manager(managerName, managerId, managerSalary, department);
        // Input for Developer
        System.out.println("\nEnter Developer Details");
        System.out.println("-----------------------"); 
        System.out.print("Name: ");
        String developerName = scanner.nextLine();
        System.out.print("Employee ID: ");
        int developerId = scanner.nextInt();
        System.out.print("Salary: ");
        double developerSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Programming Language: ");
        String programmingLanguage = scanner.nextLine();
        Developer developer = new Developer(developerName, developerId, developerSalary, programmingLanguage);
        // Display details
        System.out.println("\nBefore Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
        // Input salary increase percentages
        System.out.print("\nEnter salary increase percentage for Manager: ");
        double managerIncrease = scanner.nextDouble();
        EmployeeUtilities.increaseSalary(manager, managerIncrease);
        System.out.print("Enter salary increase percentage for Developer: ");
        double developerIncrease = scanner.nextDouble();
        EmployeeUtilities.increaseSalary(developer, developerIncrease);
        // Display updated details
        System.out.println("\nAfter Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        scanner.close();
	}

}
