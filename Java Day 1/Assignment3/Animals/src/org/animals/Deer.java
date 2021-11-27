package org.animals;

public class Deer {
	private String color,weight;
	private int age;
	
	
	public Deer() {
		super();
		this.color = "Yellow";
		this.weight = "50 KG";
		this.age = 9;
	}
	public void isVegetarian() {
		System.out.println("Deer is not vegetarian");
	}
	public void canClimb() {
		System.out.println("Deer cannot climb");
	}
	public void display() {
		System.out.println("Deer color : " +color+ " weight : "+weight+" age : "+age+" years");
	}
}
