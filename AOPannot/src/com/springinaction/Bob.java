package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Bob implements Performer {
	
	@Value("Bob")
	private String name;
	
	@Value("25")
	private int age;
	
	@Value("2")
	private int experience;
	
	@Override
	public void perform() {
		System.out.println("Introdusing " + name + "\n" + 
							"Age: " + age + " Experience: " + experience + " years.");
		System.out.println(name + " is going to perform: " + "\n" +
							"Tra-la-la, Traaa - laaa - laaa");
	}

}
