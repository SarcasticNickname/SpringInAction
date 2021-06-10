package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Bob implements Performer {

	@Value("Bob")
	private String name;
	
	@Value("50")
	private int age;
	
	@Value("15")
	private int experience;
	
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	@Override
	public void perform() {
		instrument.play();
	}
	
	@Override
	public String toString() {
		return "Introdusing " + name + ":" + "\n" +
				"Age: " + age + ", Experience: " + experience;
	}

}
