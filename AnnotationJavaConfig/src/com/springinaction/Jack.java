package com.springinaction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Jack implements Performer {
	
	public Jack() {};

	@Value("Jack")
	private String name;
	
	@Value("28")
	private int age;
	
	@Value("5")
	private int experience;

	@Override
	public void perform() {
		System.out.println("Jack is singing: " + "La - la - la.");
	}
	
	@Override
	public String toString() {
		return "Introdusing Bob: " + "\n" + 
				"Age: " + age + ", Experience: " + experience;
	}

}
