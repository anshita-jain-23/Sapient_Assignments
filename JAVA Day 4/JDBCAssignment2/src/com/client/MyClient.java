package com.client;

import java.util.Scanner;

import com.presentation.AccountPresentation;
import com.presentation.AccountPresentationImpl;

public class MyClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AccountPresentation accPresentation=new AccountPresentationImpl();
		while(true) {
			accPresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			accPresentation.performMenu(choice);
		}
	}

}
