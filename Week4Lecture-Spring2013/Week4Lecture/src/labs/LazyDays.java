package labs;

import java.util.Scanner;

public class LazyDays {
	
	static Scanner input = new Scanner( System.in );
	
	public static void main(String[]args){
		
		int temp;
		
		System.out.println("What is the temp?");
		temp = input.nextInt();
		
		if(temp > 80 && temp < 90)
			System.out.println("Go Swimming");
		else if(temp > 60 && temp <= 80)
			System.out.println("Go cycling or climbing");
		else if(temp > 40 && temp <= 60)
			System.out.println("Go golfing");
		else if(temp <= 40 && temp >= 10)
			System.out.println("Go sking");
		else
			System.out.println("Might as well program that game you have been putting off");
	}
}
