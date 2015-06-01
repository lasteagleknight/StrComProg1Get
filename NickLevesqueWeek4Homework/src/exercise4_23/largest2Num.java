package exercise4_23;

import java.util.Scanner;

public class largest2Num {

static Scanner input = new Scanner( System.in );
	
	public static void main(String[] args){
		
		int counter = 0, number, largest = 0, secondLargest=0;
		
		while(counter < 10){
			System.out.println("\nEnter a number.\n");
			number = input.nextInt();
			
			//System.out.printf("\nYou typed %d the largest number is %d\n", number, largest);
			
			if(number > largest){
				secondLargest = largest;
				largest = number;
				
			}
			else if(number > secondLargest){
				secondLargest = number;
			}
			System.out.printf("\nYou typed %d, the largest number is %d,\n"
					+ "after that it is %d\n", number, largest, secondLargest);
			counter++;
		}
		
		System.out.printf("The largest number is %d\n", largest);
		System.out.printf("The second largest number is %d", secondLargest);
		
	}
}
