package com.dhevendhiran.assignment.employees;

public class Employee {
	//Creating a private class indirect access
	  private String name;
	  private int employeeId;
	  private double salary;
	//Accessing public class Employee to access private attributes
	  public Employee(String name, int employeeId, double salary) {
	      this.name = name;
	      this.employeeId = employeeId;
	      this.salary = salary;
	  }
	//Get the name attribute
	  public String getName() {
	      return name;
	  }
	//Set the name value
	  public void setName(String name) {
	      this.name = name;
	  }
	//Get employeeId
	  public int getEmployeeId() {
	      return employeeId;
	  }
	//Set the employeeId
	  public void setEmployeeId(int employeeId) {
	      this.employeeId = employeeId;
	  }
	//Get the salary
	  public double getSalary() {
	      return salary;
	  }
	//Set the salary value with correct value to give
	  public void setSalary(double salary) {
	      if (salary >= 0){
	          this.salary = salary;
	      }
	      else{
	            System.out.println("Salary cannot be negative.");
	      }
	  }
}
	
	