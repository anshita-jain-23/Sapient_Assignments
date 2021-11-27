package org.animals;

public class Tiger {
	private String color,weight;
	private int age;
	
	
	public Tiger() {
		super();
		this.color = "Orange";
		this.weight = "90 KG";
		this.age = 10;
	}
	public void isVegetarian() {
		System.out.println("Tiger is not vegetarian");
	}
	public void canClimb() {
		System.out.println("Tiger cannot climb");
	}
	public void display() {
		System.out.println("Tiger color : " +color+ " weight : "+weight+" age : "+age+" years");
	}
}
