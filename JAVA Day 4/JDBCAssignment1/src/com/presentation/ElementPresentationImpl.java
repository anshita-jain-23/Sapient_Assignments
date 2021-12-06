package com.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.bean.Element;
import com.service.ElementService;
import com.service.ElementServiceImpl;

public class ElementPresentationImpl implements ElementPresentation {
	private ElementService elementService=new ElementServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("ELEMENT TABLE");
		System.out.println("==================================");
		System.out.println("1. List All Elemenmts");
		System.out.println("2. Search Elemenmts ");
		System.out.println("3. Add Elemenmts ");
		System.out.println("4. Delete Elemenmts");
		System.out.println("5. Update Weight on an Elemenmts");
		System.out.println("6. Exit");
		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			ArrayList<Element> elementList=elementService.searchAllElement();
			for(Element ele:elementList) {
				System.out.println(ele);
			}
			break;
		case 2:
			System.out.println("Enter Element name to be searched for : ");
			String elementName=scanner.next();
			Element searchedElement=elementService.searchElementByName(elementName);
			if(searchedElement!=null)
				System.out.println(searchedElement);
			else
				System.out.println("Element with name "+elementName+" does not exist!");
			break;
		case 3:
			System.out.println("Enter Element Weight : ");
			String w=scanner.next();
			System.out.println("Enter Element Name : ");
			String n=scanner.next();
			System.out.println("Enter Element Symbol : ");
			String s=scanner.next();
			Element element=new Element(w,n,s);
			if(elementService.insertElement(element))
				System.out.println("ELEMENT ADDED!");
			else
				System.out.println("ELEMENT NOT ADDED!");
			break;
		case 4:
			System.out.println("Enter Element Name : ");
			String elname=scanner.next();
			if(elementService.removeElement(elname))
				System.out.println("RECORD DELETED!");
			else
				System.out.println("RECORD NOT DELETED!");
			break;
		case 5:
			System.out.println("Enter Element Name : ");
			String ename=scanner.next();
			System.out.println("Enter New Weight : ");
			String w2=scanner.next();
			if(elementService.updateElementByName(ename, w2))
				System.out.println("Updation Successful!");
			else
				System.out.println("Updation Failed!");
			break;
		case 6:
			System.out.println("Thanks for Using our System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}
}
