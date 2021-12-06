package com.client;

import java.util.Scanner;

import com.presentation.TravelPresentationImpl;

public class MyClient {

	public static void main(String[] args) {
		TravelPresentationImpl travel=new TravelPresentationImpl();
		Scanner sc= new Scanner(System.in);
		while(true) {
			travel.showMenu();
			System.out.println("Enter your Choice");
			int choice =sc.nextInt();
			travel.performMenu(choice);
		}

	}

}
