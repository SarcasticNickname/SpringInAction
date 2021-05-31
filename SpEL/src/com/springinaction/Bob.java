package com.springinaction;
import java.util.Collection;

public class Bob implements Performer {
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	private Collection<Instrument> instruments;
	
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	public Bob() {};
	
	public void thankForApplause() {
		System.out.println("Bob is very happy. He's grateful "
				+ "to audience for applauses. Bob is leaving the stage");
	}
	
	@Override
	public void perform() {
		for(Instrument instrument : instruments) {
			instrument.play();
		}
	}

	
}
