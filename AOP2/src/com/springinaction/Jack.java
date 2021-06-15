package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component("Jack")
public class Jack implements Performer {

	@Value("Jack")
	private String name;
	
	@Value("30")
	private int age;
	
	@Value("5")
	private int experience;
	
	@Value("Traa - laa - laa")
	private String song;
	
	@Override
	public void perform() {
		System.out.println("Introdusing " + name  + "\n " + 
							"Age: " + age + " Experience: " + experience );
		
		System.out.println( name + " is going to perform: ");
		System.out.println(song);
	}

}
