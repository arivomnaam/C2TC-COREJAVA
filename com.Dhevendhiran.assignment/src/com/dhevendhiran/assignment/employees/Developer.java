package com.dhevendhiran.assignment.employees;

//Using extends to inherit Employee class data.
public class Developer extends Employee {
	//Creating a new attribute for Developer class called programming language
	    private String programmingLanguage;
	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }
	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
	    }
	
}