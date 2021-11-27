package bankImpl;

import bank.*;

public class FDAcc  implements DepositAcc,CreditInterest {
	public void createAcc(){
		System.out.println(Fixed+" Account is Created");
	}
	
	public void calcInt() {
		System.out.println(FixedDepositAccount+" FD Account Interest");
	}
	
	public void withdraw() {
		System.out.println("Money withdrawn from your FD");
	}
	
	public void deposit() {
		System.out.println("Money deposited to your FD");
	}
	
	public void getBalance() {
		System.out.println("Your FD account balance is x");
	}
	
	public void addMonthlyInt() {
		System.out.println("Monthly interest added");
	}
	
	public void addHalfYrlyInt() {
		System.out.println("Half yearly interest added");
	}
	
	public void addAnnualInt() {
		System.out.println("annual interest added");
	}
}
