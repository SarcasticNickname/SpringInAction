package com.springinaction;
import java.util.Map;

public class OneManBand implements Performer {
	
	public OneManBand() {};
	
	private Map<String, Instrument> instruments;
	
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() {
		for(String key : instruments.keySet()) {
			System.out.println("Instrument : " + key);
			instruments.get(key).play();
		}
	}

}
