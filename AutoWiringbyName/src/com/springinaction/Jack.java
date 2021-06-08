package com.springinaction;

public class Jack implements Performer {
	
	private Instrument piano;
	private Instrument sax;
	private Instrument guitar;
	
	public void setPiano(Instrument piano) {
		this.piano = piano;
	}
	
	public void setSax(Instrument sax) {
		this.sax = sax;
	}
	
	public void setGuitar(Instrument guitar) {
		this.guitar = guitar;
	}

	@Override
	public void perform() {
		System.out.println("Jack's performance:  ");
		guitar.play();
		sax.play();
		piano.play();
	}
	
	public void greet() {
		System.out.println("Jack is greeting the audience");
	}
	
	public void goodbye() {
		System.out.println("Jack is saying goodbye to the audience.");
	}

}
