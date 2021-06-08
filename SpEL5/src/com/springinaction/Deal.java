package com.springinaction;

public class Deal {
	
	public Deal() {};
	
	private boolean deal;
	
	public void setDeal(boolean deal) {
		this.deal = deal;
	}
	@Override
	public String toString() {
		return deal ? "Employee is hired.":"Employee is not hired.";
	}
	
}
