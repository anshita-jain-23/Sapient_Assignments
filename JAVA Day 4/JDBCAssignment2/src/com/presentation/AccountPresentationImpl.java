package com.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.bean.Account;
import com.service.AccountService;
import com.service.AccountServiceImpl;

public class AccountPresentationImpl implements AccountPresentation {
	private AccountService accountService=new AccountServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("Account Transaction");
		System.out.println("==================================");
		System.out.println("1. List Account Details");
		System.out.println("2. Search Account ");
		System.out.println("3. Add Account ");
		System.out.println("4. Delete Account");
		System.out.println("5. Update Account");
		System.out.println("6. Transcation");
		System.out.println("7. Exit");
		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		
		case 1:
			ArrayList<Account> accountList=accountService.searchAllAccount();
			for(Account acc:accountList) {
				System.out.println(acc);
			}
			break;
		
		case 2:
			System.out.println("Enter Account Number to be searched for : ");
			int accNo=scanner.nextInt();
			Account searchedAccount=accountService.searchAccountByAccNo(accNo);
			if(searchedAccount!=null)
				System.out.println(searchedAccount);
			else
				System.out.println("Account with Account Number "+accNo+" does not exist!");
			break;
			
		case 3:
			System.out.println("Enter Account Number : ");
			int num=scanner.nextInt();
			System.out.println("Enter Account Name : ");
			String name=scanner.next();
			System.out.println("Enter Account Type : ");
			String type=scanner.next();
			System.out.println("Enter Account Balance : ");
			int bal=scanner.nextInt();

			Account account=new Account(num, name, type, bal);
			if(accountService.insertAccount(account))
				System.out.println("RECORD ADDED!");
			else
				System.out.println("RECORD NOT ADDED!");
			break;
			
		case 4:
			System.out.println("Enter Account Number : ");
			int accnum=scanner.nextInt();
			if(accountService.removeAccount(accnum))
				System.out.println("RECORD DELETED!");
			else
				System.out.println("RECORD NOT DELETED!");
			break;
			
		case 5:
			System.out.println("Enter Account Number : ");
			int num1=scanner.nextInt();
			System.out.println("Enter Account Name : ");
			String name1=scanner.next();
			if(accountService.updateaccnoByAccNo(num1, name1))
				System.out.println("Updation Successful!");
			else
				System.out.println("Updation Failed!");
			break;
			
		case 6:
			System.out.println("Enter Balance : ");
			int bal1=scanner.nextInt();
			System.out.println("Enter From Account : ");
			int acc1=scanner.nextInt();
			System.out.println("Enter To Account : ");
			int acc2=scanner.nextInt();
			if(accountService.AccTransaction(bal1,acc1,acc2))
				System.out.println("Tanscation Successful!");
			else
				System.out.println("Tanscation Failed!");
			break;

		case 7:
			System.out.println("Thanks for Using our System");
			System.exit(0);
				
		default:
			System.out.println("Invalid Choice");
		}

	}
}
