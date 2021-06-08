package com.springinaction;

public class Employer {
	
	public Employer() {};
	
	private int workHours;
	
	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}
	
	public int getWorkHours() {
		return workHours;
	}
	
	private double salary;
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void recruit() {
		System.out.println("Employer is recruited for:"+ "\n" + 
				 " Salary: " + salary + "\n" + 
				"Number of work hours: " + workHours);
													  
	}
}
