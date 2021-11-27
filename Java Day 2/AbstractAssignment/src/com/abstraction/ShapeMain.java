package com.abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cb = new Cube(4);
		cb.volume();
		cb.surfaceArea();
		System.out.println("========================================");
		Sphere sp = new Sphere(5);
		sp.volume();
		sp.surfaceArea();
		System.out.println("========================================");
		Cylinder cyl = new Cylinder(2,3);
		cyl.volume();
		cyl.surfaceArea();
	}

}
