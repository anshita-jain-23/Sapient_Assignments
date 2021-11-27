package bankImpl;

import bank.*;

public class HousingLoanAcc implements LoanAcc,DebitInterest {
	public void createAcc() {
		System.out.println(HousingLoan+" Account is Created");
	}
	
	public void calcInt() {
		System.out.println(HousingLoanAccount+" House Loan Interest");
	}
	
	public void repayPrincipal() {
		System.out.println("Pricipal repaid");
	}
	
	public void payInterest() {
		System.out.println("Interest paid");
	}
	
	public void payPartialPrincipal() {
		System.out.println("Partial principal paid");
	}
	
	public void deductMonthlyInt() {
		System.out.println("Monthly interest deducted");
	}
	
	public void deductHalfYrlyInt() {
		System.out.println("Halfyrly interest deducted");
	}
	
	public void deductAnnualInt() {
		System.out.println("Annual Interest deducted");
	}
}
