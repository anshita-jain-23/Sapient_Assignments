package com.workers;

public class SalariedWorker extends Worker {
	
	private int hour;
	
	
	public SalariedWorker(String name, int salrate, int hour) {
		super(name, salrate);
		this.hour = hour;
	}


	public void compay()
	{
	show();
	double pay = salrate*hour;
	System.out.println("Salary : "+pay);
	}
}
