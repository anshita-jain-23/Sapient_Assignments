package com.shapes;

public class ShapesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape=new Shapes();

		shape.area(7, 5);
		shape.area(6.5);
		shape.area(8);
		
		System.out.println("=====================");
		shape.perimeter(7, 5);
		shape.perimeter(8);
		shape.perimeter(6.5);
	}

}
