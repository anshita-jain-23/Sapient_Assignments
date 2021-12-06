package com.bean;

public class Account {
	private int AccNo;
	private String AccName;
	private String AccType;
	private int Balance;

	public Account() {
		
	}
	
	public Account(int accNo, String accName, String accType, int balance) {
		super();
		this.AccNo = accNo;
		this.AccName = accName;
		this.AccType = accType;
		this.Balance = balance;
	}
	
	
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getAccType() {
		return AccType;
	}
	public void setAccType(String accType) {
		AccType = accType;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [AccNo=" + AccNo + ", AccName=" + AccName + ", AccType=" + AccType + ", Balance=" + Balance
				+ "]";
	}
}
