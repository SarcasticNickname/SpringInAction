package com.springinaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Jack implements Performer {
	
	@Value("Jack")
	private String name;

	@Value("30")
	private int age;
	
	@Value("10")
	private int experience;
	
	@Qualifier("violin")
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
