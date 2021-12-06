package com.service;

import java.util.ArrayList;

import com.bean.Account;

public interface AccountService {
	ArrayList<Account> searchAllAccount();
	Account searchAccountByAccNo(int accno);
	boolean insertAccount(Account account);
	boolean removeAccount(int accno);
	boolean updateaccnoByAccNo(int accno,String name);
	boolean AccTransaction(int amount,int accno1,int accno2);

}
