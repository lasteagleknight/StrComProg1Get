package Blackjack;

import java.util.Scanner;

public class betting {
	
	private static int money = 500, cashIn;
	static Scanner scan=new Scanner(System.in);
	
	public static void bet(){
		do{
			
			System.out.println("\nPlace your bets!");
			currentCash();
			betWork();
			switch(Game.play())
			{
			case 0:
				money += cashIn;
				break;
			case 1:
				System.out.printf("\nYou lost $%d", cashIn);
				break;
			case 2:
				System.out.printf("\nYou won $%d", cashIn);
				money += (cashIn*2);
				break;
			case 3:
				cashIn *= 2.5;
				System.out.printf("\nYou won $%d", cashIn);
				money += cashIn;
				break;
				
			}
			
		
		}while(money > 0);
		
		System.out.println("\nYou lost your shirt!");
		
	}
	
	public static void betWork(){
		do{
			cashIn = 0;
			System.out.println("\nHow much do you want to bet?");
			cashIn = scan.nextInt();
			money -= cashIn;
			if(money < 0){
				money += cashIn;
				System.out.printf("\nYou only have $%d",money);
			}
		}while(cashIn == 0);
	}
	
	public static void currentCash(){
		System.out.printf("\nYou have $%d",money);
	}

}
