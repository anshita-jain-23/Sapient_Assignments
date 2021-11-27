package com.vehicle;

public abstract class Vehicle {
	private int number;
	private String name;
	
	public void input(int number,String name) {
		this.setNumber(number);
		this.setName(name);
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Number : "+getNumber());
		System.out.println("Name : "+getName());
	}
	
}
