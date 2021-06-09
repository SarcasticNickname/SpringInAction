package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Piano implements Instrument {

	@Override
	public void play() {
		System.out.println("Playing piano: " + "Pam - pam - pam");
	}
	
	@Override
	public String toString() {
		return "piano";
	}

}
