package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

@Component("Jack")
public class Jack implements Performer {
	
	@Value("Jack")
	private String name;
	
	@Value("23")
	private int age;

	@Value("3")
	private int experience;

	@Autowired
	@Qualifier("classic")
	private Song song;
	
	@Override
	public void perform() {
		System.out.println("Presenting " + name + ": " + "\n" +
							"Age: " + age + " Experience: " + experience);
		song.sing();
	}

}
