package basics;

import java.util.Scanner;

public class banking {
	
	Scanner scan=new Scanner(System.in);
	double balance=0, withdraw, deposit;
	int numTransactions=0;
	int response=0;
	
	public void question(){
		System.out.println("What type of transaction would you like to make?");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Print Balance");
		response = scan.nextInt();
	}
	
	public int getresponse(){
		return response;
	}

	public void deposit(){
		System.out.println("Plese enter a deposit amount");
		deposit=scan.nextDouble();
		while(deposit<0){
			System.out.println("You may not deposit a negative amount!");
			System.out.println("Plese enter a withdraw amount");
			deposit=scan.nextDouble();
		}
		balance+=deposit;
	}
	
	public void withdraw(){

		System.out.println("Plese enter a withdraw amount");
		withdraw=scan.nextDouble();
		
		while(withdraw<0){
			System.out.println("You may not withdraw a negative amount!");
			System.out.println("Plese enter a withdraw amount");
			withdraw=scan.nextDouble();
		}
		while(balance-withdraw<0){
			System.out.println("Insufficient funds.");
			System.out.println("Plese enter a withdraw amount");
			withdraw=scan.nextDouble();
		}
		balance-=withdraw;
	}
	
	public void balance(){
		System.out.printf("Balance: $%,.2f\n",balance);
	}
}
