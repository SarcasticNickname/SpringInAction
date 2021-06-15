package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

@Component("Bob")
public class Bob implements Performer {

	@Value("Bob")
	private String name;
		
	@Value("30")
	private int age;

	@Value("6")
	private int experience;

	@Autowired
	@Qualifier("rock")
	private Song song;
		
	@Override
	public void perform() {
		System.out.println("Presenting " + name + ": " + "\n" +
							"Age: " + age + " Experience: " + experience);
		song.sing();
	}
}
