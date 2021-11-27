package com.vehicle;

public class Bus extends Vehicle {
private int model;
	
	public void input(int number,String name,int model) {
		this.setNumber(number);
		this.setName(name);
		this.model=model;
	}
	
	public void showBus() {
		display();
		System.out.println("Model : "+model);
		System.out.println("========================");
	}

	public int getModel() {
		return model;
	}
}
