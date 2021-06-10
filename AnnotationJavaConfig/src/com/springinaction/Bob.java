package com.springinaction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bob implements Performer {
	
	public Bob() {};
	
	@Value("Bob")
	private String name;
	
	@Value("30")
	private int age;
	
	@Value("10")
	private int experience;

	@Override
	public void perform() {
		System.out.println("Bob is singing: " + "La - la - la.");
	}
	
	@Override
	public String toString() {
		return "Introdusing Bob: " + "\n" + 
				"Age: " + age + ", Experience: " + experience;
	}
	
	

}
