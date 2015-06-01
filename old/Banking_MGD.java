package basics;

import java.util.Scanner;

public class Banking {
	Scanner scan=new Scanner(System.in);
	double balance=0, withdraw, deposit;
	int numTransactions=0;
	int response=1;
	
	public static void main(String[]args){
		Banking bank=new Banking();
		bank.transaction();
	}
	
	public void transaction(){
		
		while(response!=0){
			
			displaySelect();
			setResponse();
			validateSelect();
			if(response==0)break;
			
			switch(response){
			case 1: 					
				deposit();
				break;
			case 2:	
				withdraw();
				break;
			case 3:
				printBalance();
				break;
			}
		}
	}
	
	private void displaySelect(){
		System.out.println("What type of transaction would you like to make?");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Print Balance");
		System.out.println("0. Quit");
	}
	
	private void setResponse(){
		response=scan.nextInt();
	}
	
	private void setDeposit(){
		deposit=scan.nextDouble();
	}
	
	private void setWithdraw(){
		withdraw=scan.nextDouble();
	}
	
	
	private void validateSelect(){
		while(response>3||response<0){
			System.out.println("Invalid input!");
			displaySelect();
			setResponse();
		}
	}
	
	private void deposit(){
		System.out.println("Plese enter a deposit amount");
		setDeposit();
		validateDeposit();
		balance+=deposit;
	}
	
	private void validateDeposit(){
		while(deposit<0){
			System.out.println("You may not deposit a negative amount!");
			System.out.println("Plese enter a withdraw amount");
			setDeposit();
		}
	}
	
	private void withdraw(){
		System.out.println("Plese enter a withdraw amount");
		setWithdraw();
		validateWithdraw();
		balance-=withdraw;
	}
	
	private void validateWithdraw(){
		while(withdraw<0){
			System.out.println("You may not withdraw a negative amount!");
			System.out.println("Plese enter a withdraw amount");
			setWithdraw();
		}
	}
	
	private void printBalance(){
		System.out.printf("Balance: $%,.2f\n",balance);
	}
	

}
