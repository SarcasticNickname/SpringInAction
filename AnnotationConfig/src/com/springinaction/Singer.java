package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Singer {
	
	@Value("Bob")
	private String name;
	
	@Value("33")
	private int age;
	
	@Value("5")
	private int experience;
	
	@Autowired
	private Instrument instrument;
	
	
	public Singer() {
		
	}
	
	public void getInfo() {
		System.out.println("Introdusing " + name + "!" + "\n" + 
							"Age: " + age + ", Experience: " + experience + " years." + "\n" +
							"Instrument: " + instrument);
	}
	
	public void sing() {
		
		instrument.play();
		System.out.println("La - la - la, " + "\n"
							+ "Lu - lu - lu " + "\n" + 
							"Li - li - li .");
	}

}
