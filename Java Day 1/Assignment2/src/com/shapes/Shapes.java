package com.shapes;

public class Shapes {
	public void area(int length,int breadth) {
		int area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}
	
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square : "+area);
	}
	
	public void area(double radius) {
		double area=3.142*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	public void perimeter(int length, int breadth) {
		int perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
	public void perimeter(int side) {
		int perimeter=4*side;
		System.out.println("Perimeter of square : "+perimeter);
	}
	public void perimeter(double radius) {
		double perimeter = 2 * 3.142 * radius;
		System.out.println("Perimeter of circle : "+perimeter);
	}
}
