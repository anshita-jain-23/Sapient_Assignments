package org.animals;

public class Elephant {
	private String color,weight;
	private int age;
	
	
	public Elephant() {
		super();
		this.color = "Black";
		this.weight = "150 KG";
		this.age = 20;
	}
	public void isVegetarian() {
		System.out.println("Elephant is vegetarian");
	}
	public void canClimb() {
		System.out.println("Elephant cannot climb");
	}
	public void display() {
		System.out.println("Elephant color : " +color+ " weight : "+weight+" age : "+age+" years");
	}
}


