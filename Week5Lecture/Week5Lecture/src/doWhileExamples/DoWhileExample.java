package doWhileExamples;

import java.util.Scanner;

public class DoWhileExample {
	
	public static void main(String[]args){
		String response = "", pizzaOrder="";
		Scanner scan=new Scanner(System.in);		
		int size=0, toppings=0;
		int price=0;
		int dolars=0, cents=0;
		System.out.println("Order a pizza!");
		do{
			System.out.println("What size would you like? ");
			System.out.println("1. large\n2. medium\n3. small ");
			size=scan.nextInt();
			
			System.out.println("What toppings would you like? ");
			System.out.println("1. Sausage\n2. pepperoni\n3. extra cheese ");
			toppings=scan.nextInt();
			
			switch(size){
				case 1: 
					price+=1099;
					pizzaOrder="large";
					break;
				case 2: 
					price+=899;
					pizzaOrder="medium";
					break;
				case 3:
					price+=699;
					pizzaOrder="small";
					break;
			}
			
			switch(toppings){
				case 1:		
					pizzaOrder+=" sausage";
					break;
				case 2: 
					price+=99;
					pizzaOrder+=" pepperoni";
					break;
				case 3: 
					price+=49;
					pizzaOrder+=" cheese";
					break;	
			}
			
			dolars=price/100;
			cents=price%100;
			
			System.out.println("Your Order:");
			System.out.println("========================================");
			System.out.printf("%s pizza\t$%s.%s\n", pizzaOrder, dolars, cents);
			
			System.out.println("Would you like another pizza? yes or no");
			response=scan.next();
			
		}while(!response.equalsIgnoreCase("no"));
	}
}
