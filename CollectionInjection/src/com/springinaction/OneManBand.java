package com.springinaction;
import java.util.Collection;


public class OneManBand implements Performer {
	
	public OneManBand() {};
	
	private Collection<Instrument> instruments;

	@Override
	public void perform() {
		for(Instrument instrument : instruments) {
			instrument.play();
		}
	}
	
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments = instruments;
	}
}
