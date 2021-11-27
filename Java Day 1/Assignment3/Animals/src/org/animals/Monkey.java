package org.animals;

public class Monkey {
	private String color,weight;
	private int age;
	
	
	public Monkey() {
		super();
		this.color = "Brown";
		this.weight = "50 KG";
		this.age = 9;
	}
	public void isVegetarian() {
		System.out.println("Monkey is not vegetarian");
	}
	public void canClimb() {
		System.out.println("Monkey can climb");
	}
	public void display() {
		System.out.println("Monkey color : " +color+ " weight : "+weight+" age : "+age+" years");
	}
}


