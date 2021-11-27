package bankImpl;

import bank.*;

public class SavingsAcc implements DepositAcc,CreditInterest,Interest {
	public void createAcc(){
		System.out.println(Savings+" Account is Created");
	}
	public void calcInt() {
		System.out.println(SavingsAccount+" Savings Account Interest");
	}
	public void withdraw() {
		System.out.println("Money withdrawn from your savings acc");
	}
	public void deposit() {
		System.out.println("Money deposited to your savings acc");
	}
	public void getBalance() {
		System.out.println("your savings acc balance is x");
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
