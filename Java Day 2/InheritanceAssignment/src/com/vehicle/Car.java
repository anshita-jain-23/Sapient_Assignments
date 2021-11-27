package com.vehicle;

public class Car extends Vehicle {
private int model;
	
	public void input(int number,String name,int model) {
		this.setNumber(number);
		this.setName(name);
		this.model=model;
	}
	
	public void showCar() {
		display();
		System.out.println("Car Model : "+model);
		System.out.println("========================");

	}

	public int getModel() {
		return model;
	}
}
