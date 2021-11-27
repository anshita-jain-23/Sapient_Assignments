package com.vehicle;

public class Road {

	public static void main(String[] args) {
		Car c = new Car();
		Truck t = new Truck();
		Bus b = new Bus();
		t.input(103232, "Tata", 23);
		t.showTruck();
		b.input(11134, "Volvo", 1);
		b.showBus();
		c.input(123422, "BMW", 33);
		c.showCar();
		}

}
