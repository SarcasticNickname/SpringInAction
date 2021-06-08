package com.springinaction;

public class Employee {
	
	public Employee() {};
	
	private boolean educated;
	
	public void setEducated(boolean educated) {
		this.educated = educated;
	}
	
	public boolean getEducated() {
		return educated;
	}
	
	private int experienceYears;
	
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	public int getExperienceYears() {
		return experienceYears;
	}
}
