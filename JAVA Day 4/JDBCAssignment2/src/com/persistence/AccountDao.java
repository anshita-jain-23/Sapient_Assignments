package com.persistence;

import java.util.ArrayList;

import com.bean.Account;

public interface AccountDao {
	ArrayList<Account> getAllAccount();
	Account getAccountById(int accNo);
	int addAccount(Account account);
	int deleteAccount(int account);
	int updateAccountByAccNo(int num,String name);
	int Transaction(int bal,int acc1,int acc2);

}
