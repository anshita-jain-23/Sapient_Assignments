package com.workers;

public class DailyWorker extends Worker {
	private int days;
	
	
	public DailyWorker(String name, int salrate, int days) {
		super(name, salrate);
		this.days = days;
	}


	public void compay()
	{
	show();
	double pay=salrate*days;
	System.out.println("Salary : "+pay);
	}
}
