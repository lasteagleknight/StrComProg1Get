package labs;

import java.util.Scanner;

public class GuessingGame {
	
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[]args){
		
		int random = (int)(Math.random() * 100 +1);
		int guess = 0;
		int answer;
		boolean win= false;
		
		while( guess < 5 && win == false){
			System.out.println("What do you think the number is?");
			answer = scan.nextInt();
			
			if(answer == random){
				System.out.println("You got it");
				win = true;
			}
			else if(answer< random)
				System.out.println("higher");
			else if(answer> random)
				System.out.println("lower");
			else
				System.out.println("you broke me");
			guess++;
		}
		System.out.println("Number is "+random);
		
		
	}

}
