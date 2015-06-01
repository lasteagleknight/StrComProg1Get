package exercise4_21;

import java.util.Scanner;

public class LargestNum {
	
	static Scanner input = new Scanner( System.in );
	
	public static void main(String[] args){
		
		int counter = 0, number, largest = 0;
		
		while(counter < 10){
			System.out.println("\nEnter a number.\n");
			number = input.nextInt();
			
			//System.out.printf("\nYou typed %d the largest number is %d\n", number, largest);
			
			if(number > largest){
				largest = number;
			}
			System.out.printf("\nYou typed %d the largest number is %d\n", number, largest);
			counter++;
		}
		
		System.out.printf("The largest number is %d", largest);
		
	}

}
