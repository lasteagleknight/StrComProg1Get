/*
 * 4.30
 * A palindrome is a sequence of characters that reads the same backward as
 * forward. For example, each og the following five-digit integers is a palindrome
 * 12321, 55555, 45554 and 11611. Write an application that reads in a five-digit 
 * integer and determines whether it's a palindrome. if the number is not five digits
 * long, display an error message and allow the user to enter a new value.
 */
package exercise4_30;

import java.util.Scanner;

public class Paindromes {
	
	static Scanner input = new Scanner( System.in );
	
	static int number, first, second, third, fourth, fifth, first1, second1, third1, fourth1, fifth1;
	
	public static void main( String[] args){
		
		//asking user for number
		System.out.print("Enter a five digit number to cheak if it is palindrome:");
		number = input.nextInt();
		
		System.out.printf("number is %d\n", number);
		
		// adding error if user adds more or less then 5 digits
		while( number <= 9999 || number >= 100000){
			System.out.println("Error, you need to enter a five digit number.");
			System.out.print("Enter a five digit number to cheak if it is palindrome:");
			number = input.nextInt();
		}
		
		//computes the separating of the numbers.
		mathSet();
		
		//Compares the numbers. finding if the palindromes is true.
		if(first == fifth){
			if(second == fourth)
				System.out.println("The number is a palindrome.");
		}
		else
			System.out.println("The number is not a palindrome");
		
		/*System.out.printf("Finished number is %d\n",number);
		System.out.printf("First number is %d\n",first1);
		System.out.printf("second number is %d\n",second1);
		System.out.printf("third number is %d\n",third1);
		System.out.printf("fourth number is %d\n",fourth1);
		System.out.printf("Fifth number is %d\n",fifth1);
		
		System.out.printf("First number is %d\n",first);
		System.out.printf("second number is %d\n",second);
		System.out.printf("third number is %d\n",third);
		System.out.printf("fourth number is %d\n",fourth);
		System.out.printf("Fifth number is %d\n",fifth);*/
	}
	
	public static void mathSet(){
		
		//Separating the numbers 
		fifth1 = number / 10000;
		fourth1= number / 1000;
		third1 = number / 100;
		second1 = number / 10;
		first1 = number / 1;
		
		first = first1 - second1 * 10;
		second = second1 - third1 * 10;
		third = third1 - fourth1 * 10;
		fourth = fourth1 - fifth1 * 10;
		fifth = fifth1;
		
	}
	
	

}
