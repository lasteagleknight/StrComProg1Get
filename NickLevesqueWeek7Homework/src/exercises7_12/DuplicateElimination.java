/*
 * Use a one-dimensional array to solve the following problem:
 * Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
 * is read,display it only if it's not a duplicate of a number already read. Provide for the "worse case in 
 * which all five number are different. Use the smallest possible array to solve this problem. Display
 * the complete set of unique values input after the user enters each new value.
 */

package exercises7_12;

import java.util.Scanner;

public class DuplicateElimination {
	
	private static int[] numbers = new int[5];
	static Scanner scan=new Scanner(System.in);
	
	static int responce = 0;
	
	public static void main(String[] args){
		
		for(int count=0; count < numbers.length;count++){
			number();
			numbers[count]=responce;
		}
		System.out.println();
		check();
	}
	
	public static void request(){
		System.out.println("Enter a number between 10 and 100:");
	}
	
	public static void number(){
		do{
			request();
			responce=scan.nextInt();
		}while(responce < 10 || responce > 100);
	}
	
	public static void check(){
		System.out.printf("1 is %d\n",numbers[0]);
		if(numbers[1] != numbers[0])
			System.out.printf("2 is %d\n",numbers[1]);
		if(numbers[2] != numbers[0])
			if(numbers[2] != numbers[1])
				System.out.printf("3 is %d\n",numbers[2]);
		if(numbers[3] != numbers[0])
			if(numbers[3] != numbers[1])
				if(numbers[3] != numbers[2])
					System.out.printf("4 is %d\n",numbers[3]);
		if(numbers[4] != numbers[0])
			if(numbers[4] != numbers[1])
				if(numbers[4] != numbers[2])
					if(numbers[4] != numbers[3])
						System.out.printf("5 is %d\n",numbers[4]);
	}
	
}
