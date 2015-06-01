package basics;

import java.util.Scanner;

public class BankingCleanup {
	
	/*
	 * How many distinct tasks are being performed in the main?
	 * comment the code to explain each task being performed,
	 * rewrite the class such that it has no main method 
	 * and each task is performed by a method.  
	 * You may have methods calling methods in their implementation.
	 * Set the class up such that user input is performed by a class with a main method.
	 *
	 * */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int response=0;
		
		banking bank = new banking();
		do{
			bank.question();
			
			while( bank.getresponse()>3 || bank.getresponse()<1 ){
				System.out.println("invald input.");
				bank.question();
			}
				
			switch(bank.getresponse()){
				case 1: 					
					bank.deposit();
					break;
				case 2:	
					bank.withdraw();
					break;
				case 3:
					bank.balance();
					break;
			}//end switch
			
			System.out.println("Would you like to make another transaction? \n1. yes\n0. quit");
			response=scan.nextInt();
			
			
		}while(response!=0);

	}
}
