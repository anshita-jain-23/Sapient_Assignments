package org.animals;

public class Lion {
	private String color,weight;
	private int age;
	
	
	public Lion() {
		super();
		this.color = "Aztec Gold";
		this.weight = "100 KG";
		this.age = 15;
	}
	public void isVegetarian() {
		System.out.println("Lion is not vegetarian");
	}
	public void canClimb() {
		System.out.println("Lion cannot climb");
	}
	public void display() {
		System.out.println("Lion color : " +color+ " weight : "+weight+" age : "+age+" years");
	}
}


