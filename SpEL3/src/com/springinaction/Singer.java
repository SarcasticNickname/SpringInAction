package com.springinaction;

public class Singer implements Performer {
	
	public Singer() {};
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	private Song song;
	
	public void setSong(Song song) {
		this.song  = song;
	}
	
	public Song getSong() {
		return song;
	}

	@Override
	public void perform() {
		System.out.println(name + ", age: " + age + " is going to perform. ");
		song.sing();
	}
	
	public void greet() {
		System.out.println(name + " is greeting the audience.");
	}
	
	public void goodbye() {
		System.out.println(name + " is saying goodbye to the audience.");
	}

}
