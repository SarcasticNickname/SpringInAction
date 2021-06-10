package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Bob implements Performer {

	@Value("Bob")
	private String name;
	
	@Value("25")
	private int age;
	
	@Value("5")
	private int experience;
	
	@Qualifier("guitar")
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	@Override
	public void perform() {
		System.out.println("Introdusing " + name + ": " + "\n" + 
							"Age: " + age + ", Experience: " + experience);
		instrument.play();
	}

}
