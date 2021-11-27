package com.abstraction;

public class Cylinder {
	private double radius, height;

	
	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	public void volume() {
		double volume = 3.14 * radius * radius * height;
		System.out.println("Volume of Cylinder : "+volume);
	}
	public void surfaceArea() {
		double surfaceArea = 2 * 3.14 * radius * (height+radius);
		System.out.println("Surface Area of Cylinder : "+surfaceArea);
	}

}
