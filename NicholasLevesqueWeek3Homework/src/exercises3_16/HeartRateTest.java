package exercises3_16;

import java.util.Scanner;

public class HeartRateTest {
	
	static String firstName, lastName;
	static int day, month, year;
	static Scanner input = new Scanner( System.in );
	
	public static void main(String[]args){
		
		
		//asking user for all the info for heart rate.
		System.out.println("What is your first name?");
		firstName = input.nextLine();
		
		System.out.println("What is your last name?");
		lastName = input.nextLine();
		
		System.out.println("What is your birth year?");
		year = input.nextInt();
		
		System.out.println("What is your birth month?");
		month = input.nextInt();
		
		System.out.println("What is your birth day?");
		day = input.nextInt();
		
		HeartRate person1 = new HeartRate( firstName, lastName, day, month, year );
		
		person1.targetHeartRate();
		
	}

}
