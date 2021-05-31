package com.springinaction;

public class HappyBirthday implements Song {

	@Override
	public void sing() {
		System.out.println("Happy birthday to you, \n"
				+ "Happy birthday to you, \n"
				+ "Happy birthday, happy birthday, \n"
				+ "Happy birthday to you.");
	}

}
