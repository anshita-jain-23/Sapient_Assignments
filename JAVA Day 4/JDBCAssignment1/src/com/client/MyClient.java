package com.client;

import java.util.Scanner;

import com.presentation.ElementPresentation;
import com.presentation.ElementPresentationImpl;

public class MyClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ElementPresentation elePresentation=new ElementPresentationImpl();
		while(true) {
			elePresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			elePresentation.performMenu(choice);
		}
	}

}
