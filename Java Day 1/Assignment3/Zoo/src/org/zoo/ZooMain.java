package org.zoo;
import org.animals.*;
public class ZooMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer deer = new Deer();
		Elephant elephant = new Elephant();
		Giraffe giraffe = new Giraffe();
		Lion lion = new Lion();
		Monkey monkey = new Monkey();
		Tiger tiger = new Tiger();
		
		deer.display();
		deer.isVegetarian();
		deer.canClimb();
		
		System.out.println("====================");
		elephant.display();
		elephant.isVegetarian();
		elephant.canClimb();
		
		System.out.println("====================");
		giraffe.display();
		giraffe.isVegetarian();
		giraffe.canClimb();
		
		System.out.println("===================");
		lion.display();
		lion.isVegetarian();
		lion.canClimb();
		
		System.out.println("====================");
		monkey.display();
		monkey.isVegetarian();
		monkey.canClimb();
		
		System.out.println("====================");
		tiger.display();
		tiger.isVegetarian();
		tiger.canClimb();
	}

}
