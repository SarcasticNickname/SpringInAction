package com.springinaction;

public class Ikotika implements Performer {
	
	private Info info;
	
	private Instrument voice;
	
	public Ikotika(Info info, Instrument voice) {
		this.info = info;
		this.voice  = voice; 
	}

	@Override
	public void perform() {
		System.out.println("Presenting Ikotika: ");
		info.getInfo();
		System.out.println("Ikotika is going to sing: ");
		voice.play();
	}

}
