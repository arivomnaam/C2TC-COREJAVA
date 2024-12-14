package com.dhevendhiran.assignment.utilities;
import com.dhevendhiran.assignment.employees.*;

public class EmployeeUtilities {
	//Display the details of an employee
	 public static void printEmployeeDetails(Employee employee) {
	        if (employee instanceof Manager) {
	            System.out.println("Manager Details:");
	        } else if (employee instanceof Developer) {
	            System.out.println("Developer Details:");
	        } else {
	            System.out.println("Employee Details:");
	        }
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }
	 //To increase the salary of an employee
	    public static void increaseSalary(Employee employee, double percentage) {
	        if (percentage > 0) {
	            double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
	            employee.setSalary(newSalary);
	            System.out.println("Salary updated successfully.");
	        } else {
	            System.out.println("Percentage must be positive.");
	        }
	    }
	}

