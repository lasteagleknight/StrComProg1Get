package basics;

import java.util.Scanner;

public class Banking {

	double balance = 0;
	double withdrawl, deposit;
	int response = 0;
	
	Scanner input = new Scanner(System.in);
	
	public Banking (double balance) {
		this.balance = balance;
	}
	
	public void withdraw () {
		balance -= withdrawl;
	}
	public void deposit () {
		balance += deposit;
	}
	public void transaction () {
		do{
			System.out.println("What type of transaction would you like to make?");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Print Balance");
			response=input.nextInt();
		}while(response>3||response<1);
	}
	public void doTrans () {
		boolean check = true;
		switch(response){
		case 1: 
			do{
				System.out.println("Please enter a deposit amount");
				deposit=input.nextDouble();
				if (deposit > 0) {
					this.deposit();
					check = false;
				}
			}while(check);
			break;
			
		case 2:				
			do{
				System.out.println("Please enter a withdrawl amount");
				withdrawl=input.nextDouble();
				if (withdrawl > 0) {
					this.withdraw();
					check = false;
				}
			}while(check);
			break;
			
		case 3:
			System.out.printf("Balance: $%,.2f\n", balance);
			break;
	}//end switch
	}
	public void doAgain () {
		int repeat;
		do {
			System.out.println("Would you like to make another transaction? \n1. yes\n0. quit");
			repeat = input.nextInt();
			if (repeat == 1) {
				this.transaction();
				this.doTrans();
			}
		}while (repeat==1);
	}
}
