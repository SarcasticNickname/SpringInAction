package com.springinaction;

import org.springframework.stereotype.Component;

@Component
public class GratefulContestant implements Contestant {

	@Override
	public void receiveAward() {
		System.out.println("Contestant is very grateful for the award.");
	}

}
