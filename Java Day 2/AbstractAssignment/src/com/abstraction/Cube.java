package com.abstraction;

public class Cube extends Shape3D {
	private double side;

	public Cube(double side) {
		super();
		this.side = side;
	}
	public void volume() {
		double volume = side * side * side;
		System.out.println("Volume of Cube : "+volume);
	}
	public void surfaceArea() {
		double surfaceArea = 6 * side * side;
		System.out.println("Surface Area of Cube : "+surfaceArea);
	}
}
