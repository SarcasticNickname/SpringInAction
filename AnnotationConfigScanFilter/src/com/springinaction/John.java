package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class John implements Performer {

	@Value("John")
	private String name;
	
	@Value("19")
	private int age;
	
	@Value("4")
	private int experience;
	
	@Autowired
	@Qualifier("piano")
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
