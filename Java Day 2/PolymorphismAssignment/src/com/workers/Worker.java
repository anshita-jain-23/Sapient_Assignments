package com.workers;

public class Worker {
	
	private String name;
	protected int salrate;
	
	
	public Worker(String name, int salrate) {
		super();
		this.name = name;
		this.salrate = salrate;
	}
	public  void compay() {
	
	}
	public void show()
	{
	System.out.println("\n--------------------------");
	System.out.println("Employee name : "+name);
    System.out.println("Employee salary rate : "+salrate);
	}
}

