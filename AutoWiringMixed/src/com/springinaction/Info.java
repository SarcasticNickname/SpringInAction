package com.springinaction;

public class Info {
	
	private String name;
	
	private int age;
	
	private boolean talent;
	
	public Info(String name, int age, boolean talent) {
		this.name = name;
		this.age = age;
		this.talent = talent;
	}
	
	public void getInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Is Talented: " + talent);
	}

}
