package interactiveClasses;

import java.util.Scanner;

import classAndDriver.ClassAnatomy;

public class InteractiveClasses {

	public static void main(String[] args) {
		ClassAnatomy tester;
		Scanner scan=new Scanner(System.in);
		String inputString;
		int inputInt;
		
		
		//Testing next() and nextLine()
		System.out.println("Please enter your first name: ");
		inputString=scan.next();
		inputString=scan.nextLine(); //needed to stop the enter lines
		System.out.println("Please enter your first and last name separated by a space: ");
		inputString=scan.nextLine();
		
		System.out.printf("Your name is %s", inputString);
		
		System.out.println("Please enter your age: ");
		inputInt=scan.nextInt();
		
		tester=new ClassAnatomy(inputString, inputInt);
		
		//implicit call to toString
		System.out.println(tester);
		
		System.out.println("Please enter your weight: ");
		//you can pass a method call to a method parameter if it returns the correct type of data.
		tester.setWeight(scan.nextInt());//pass the scanner to the setWeight() it will return an int!
		
		
	}

}
