package com.eggs;

public class CalculateEgg {
	private int totalNoOfEggs;
	private EggUnit eggs= new EggUnit();
	public void setTotalNoOfEggs(int totalNoOfEggs) {
		this.totalNoOfEggs = totalNoOfEggs;
	}
	public int getTotalNoOfEggs() {
		
		return calculateEggs();
	}
	public int calculateEggs() {
		int gross = eggs.getGross();
		int dozens = eggs.getDozens();
		int remaining = eggs.getRemaining();
		
		gross = totalNoOfEggs / 144;
		int abovegross = totalNoOfEggs % 144;
		dozens = abovegross / 12;
		remaining = abovegross % 12;
		System.out.println("Total no. of eggs : "+totalNoOfEggs);
		System.out.println("Gross : "+gross);
		System.out.println("Dozens : "+dozens);
		System.out.println("Remaining : "+remaining);
		return totalNoOfEggs;
		
	}
}
