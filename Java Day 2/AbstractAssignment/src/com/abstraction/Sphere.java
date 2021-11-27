package com.abstraction;

public class Sphere {
	private double radius;

	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}
	public void volume() {
		double volume = (4/3) * 3.14 * radius * radius;
		System.out.println("Volume of Sphere : "+volume);
	}
	public void surfaceArea() {
		double surfaceArea = 4 * 3.14 * radius;
		System.out.println("Surface Area of Spehere : "+surfaceArea);
	}

}
