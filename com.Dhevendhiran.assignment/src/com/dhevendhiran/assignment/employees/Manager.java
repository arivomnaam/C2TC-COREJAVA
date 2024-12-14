package com.dhevendhiran.assignment.employees;

//Using extends to Inherit Employee Class data.
public class Manager extends Employee {
	//Creating a separate file for manager
	    private String department;
	    public Manager(String name, int employeeId, double salary, String department) {
	    	//Implement super class to access the name, employeeId and salary from Employee class.
	        super(name, employeeId, salary);
	        //Adding extra attributes to manager
	        this.department = department;
	    }
	    //Get the Department
	    public String getDepartment() {
	        return department;
	    }
	    //Set the department
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	}