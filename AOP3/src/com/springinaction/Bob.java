package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component("Bob")
public class Bob implements Performer {

	@Value("Bob")
	private String name;
	
	@Value("15")
	private int age;
	
	@Value("1")
	private int experience;
	
	@Value("Tra - la - la")
	private String song;
	
	@Override
	public void perform() {
		System.out.println("Introdusing " + name  + "\n " + 
							"Age: " + age + " Experience: " + experience );
		
		System.out.println( name + " is going to perform: ");
		System.out.println(song);
	}

}
