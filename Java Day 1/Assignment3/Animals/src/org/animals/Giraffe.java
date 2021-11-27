package org.animals;

public class Giraffe {
	private String color,weight;
	private int age;
	
	
	public Giraffe() {
		super();
		this.color = "Light tan";
		this.weight = "60 kG";
		this.age = 25;
	}
	public void isVegetarian() {
		System.out.println("Giraffe is not vegetarian");
	}
	public void canClimb() {
		System.out.println("Giraffe cannot climb");
	}
	public void display() {
		System.out.println("Giraffe color : " +color+ " weight : "+weight+" age : "+age+" years");
	}
}


