package com.service;

import java.util.ArrayList;

import com.bean.Account;
import com.persistence.AccountDao;
import com.persistence.AccountDaoImpl;

public class AccountServiceImpl implements AccountService  {
private AccountDao accountDao=new AccountDaoImpl();
	
	@Override
	public ArrayList<Account> searchAllAccount() {
		return accountDao.getAllAccount();
	}

	@Override
	public Account searchAccountByAccNo(int num) {
		return accountDao.getAccountById(num);
	}

	@Override
	public boolean insertAccount(Account account) {
		int rows=accountDao.addAccount(account);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean removeAccount(int accno) {
		int rows=accountDao.deleteAccount(accno);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateaccnoByAccNo(int num, String name) {
		int rows=accountDao.updateAccountByAccNo(num, name);
		if(rows>0)
			return true;
		return false;
	}
	
	@Override
	public boolean AccTransaction(int bal,int acc1,int acc2) {
		int rows=accountDao.Transaction(bal,acc1,acc2);
		if(rows>0)
			return true;
		return false;
	}
}
