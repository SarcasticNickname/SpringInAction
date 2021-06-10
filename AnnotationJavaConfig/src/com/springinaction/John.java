package com.springinaction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class John implements Performer {
	
	public John() {};

	@Value("John")
	private String name;
	
	@Value("25")
	private int age;
	
	@Value("4")
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
