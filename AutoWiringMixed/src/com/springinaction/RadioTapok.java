package com.springinaction;

public class RadioTapok implements Performer {
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	private Info info;
	
	public void setInfo(Info info) {
		this.info = info;
	}

	@Override
	public void perform() {
		System.out.println("Presenting RadioTapok: ");
		info.getInfo();
		System.out.println("RadioTapok is going to perform: ");
		instrument.play();
	}
}
