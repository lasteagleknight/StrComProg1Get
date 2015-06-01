package labs;

import java.util.Scanner;

public class Preformance {
	static Scanner input = new Scanner( System.in );
	public static void main(String[]args){
	
		String name;
		int review;
		double salary;
		boolean probation;
		
		System.out.println("What is employees name");
		name = input.nextLine();
		
		System.out.println("What is there current salary?");
		salary = input.nextInt();
		
		System.out.println("Are they currently on probation? yes or no");
		String quest = input.nextLine();
		String question = input.nextLine();
		probation = question.contains("yes");
		
		System.out.println("out of %100 how was there review?");
		review = input.nextInt();
		
		if(review > 95){
			salary = salary * 1.06;
			probation = false;
		}
		else if(review > 85){
			salary = salary * 1.04;
			probation = false;
		}
		else if(review > 75){
			salary = salary * 1.03;
			probation = false;
		}
		else if(review < 75 && probation == false){
			probation = true;
		}
		else
			System.out.println(name +" is to be told they are no longer working with this company.");
		
		System.out.println(name +" is to have a set pay of $" +salary);
		System.out.println(probation?name+" is on probation":name+" is not on probation");
	}

}
