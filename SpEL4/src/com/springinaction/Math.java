package com.springinaction;

public class Math {
	
	public Math() {};
	
	private double number1;
	
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	
	
	public double getNumber1() {
		return number1;
	}
	
	
	private double number2;
	
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	
	
	public double getNumber2() {
		return number2;
	}
	
	
	private double add;
	
	public void setAdd(double add) {
		this.add = add;
	}
	
	private double subtract;
	
	public void setSubtract(double subtract) {
		this.subtract = subtract;
	}
	
	private double divide;
	
	public void setDivide(double divide) {
		this.divide = divide;
	}
	
	private double PI;
	
	public void setPI(double PI) {
		this.PI = PI;
	}
	
	@Override
	public String toString() {
		return "1 Number: " + number1 + "\n" + 
			   "2 Number: " + number2 + '\n' +
			   "Summ: " + add + "\n" +
			   "Subtraction: " + subtract + "\n" +
			   "Division: " + divide + "\n" +
			   "PI: " + PI;
	
	}
	
}
