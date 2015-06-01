package exercises3_17;

import java.util.Scanner;

public class HealthProfileTest {
	
	static String firstName, lastName;
	static int day, month, year, weight, height;
	static boolean sex;
	static Scanner input = new Scanner( System.in );
	
	public static void main(String[]args){
		
		//asking user for there info for program setup.
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
		
		System.out.println("What is your weight in pounds?");
		weight = input.nextInt();
		
		System.out.println("What is your height in inches?");
		height = input.nextInt();
		//set up for boolean female equals true
		System.out.println("Are you male or female?");
		String quest = input.nextLine();
		String question = input.nextLine();
		sex = question.contains("female");
			
		
		HealthProfile person1 = new HealthProfile( firstName, lastName, day, month, year,
				weight, height, sex);
		
		//System.out.println("sex equals " +sex);
		//printout for all nessassary info user needs
		person1.targetHeartRate();
		
		person1.whatSex();
		
	}

}
