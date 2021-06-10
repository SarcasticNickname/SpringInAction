package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Jack implements Performer {

	@Value("Jack")
	private String name;
	
	@Value("25")
	private int age;
	
	@Value("7")
	private int experience;
	
	@Autowired
	@Qualifier("violin")
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
