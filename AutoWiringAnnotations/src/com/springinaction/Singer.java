package com.springinaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Singer implements Performer {
	
	@Autowired
	private Info info;
	
	private Instrument instrument;
	
	@Autowired
	@Qualifier("violin")
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.println("Introdusing performer: ");
		info.getInfo();
		System.out.println("Performer is going to perform: ");
		instrument.play();
	}

}
