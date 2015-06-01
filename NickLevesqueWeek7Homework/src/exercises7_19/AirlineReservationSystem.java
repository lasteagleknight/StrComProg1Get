/*
 * A small airline has just purchased a computer for its new automated reservations system. You've been asked
 * to develop the new system. You're to write an application to assign seats an each flight of the airline's
 * only plane (capacity: 10 seats).
 * Your application should display the following alternatives: pleas type 1 for first Class and please type 2 for economy.
 * if the user types 1
 */
package exercises7_19;

import java.util.Scanner;

public class AirlineReservationSystem {
	
	static boolean[] seats = new boolean[10];
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[]args){
		
		do{
			if(replay()){
				if(!firstClassFull()){
					firstClass();
				}
				else if(changeClass())
					economy();
				else
					System.out.println("Next flight leaves in 3 hours.");
			}
			else{
				if(!economyFull())
					economy();
				else if(changeClass())
					firstClass();
				else
					System.out.println("Next flight leaves in 3 hours.");
			}
				
			
		}while(!fullPlane());
		
		System.out.println("Plane is full");
		for(int counter = 0; counter < 9; counter++){
			System.out.printf("seat: %d is ", counter);
			System.out.println(seats[counter]);
		}
		
	}
	
	public static void question(){
		System.out.println("Please type 1 for First Class");
		System.out.println("Please type 2 for Economy");
	}
	
	public static boolean replay(){
		question();
		int replay;
		boolean firstClass;
		replay = scan.nextInt();
		while(replay != 1 && replay != 2){
			System.out.println("Error not a real result.");
			question();
			replay = scan.nextInt();
		}
		if(replay == 1)
			firstClass = true;
		else
			firstClass = false;
		
		return firstClass;
	}
	
	public static boolean changeClass(){
		String replay;
		boolean change;
		if(firstClassFull())
			System.out.println("First class is full would you like to take a seat in economy?");
		else
			System.out.println("Economy is full would you like to take a seat in first Class?");
		String play = scan.nextLine();
		replay = scan.nextLine();
		change = replay.contains("yes");
		
		return change;
	}
	
	public static void firstClass(){
		for(int counter = 0; counter < 5; counter++){
			if(seats[counter] == false){
				seats[counter]= true;
				System.out.printf("You have taken seat #%d.\n", counter);
				break;
			}//end if statement
			System.out.printf("Seat #%d is taken.\n",counter);
		}//end counter
	}//end firstClass 
	
	public static void economy(){
		for(int counter = 5; counter < seats.length; counter++){
			if(seats[counter] == false){
				seats[counter]= true;
				System.out.printf("You have taken seat #%d.\n", counter);
				break;
			}//end if statement
			System.out.printf("Seat #%d is taken.\n",counter);
		}//end counter
	}//end firstClass 
	
	public static boolean fullPlane(){
		boolean full = false;
		for(int counter = 0; counter < seats.length; counter++){
			if(!seats[counter]){
				full = false;
				break;
			}
			else if(seats[9])
				full = true;
		}
		
		return full;
	}
	
	public static boolean firstClassFull(){
		boolean full = false;
		for(int counter = 0; counter < 5; counter++){
			if(!seats[counter]){
				full = false;
				break;
			}
			else if(seats[4])
				full = true;
		}
		
		return full;
	}
	
	public static boolean economyFull(){
		boolean full = false;
		for(int counter = 5; counter < seats.length; counter++){
			if(!seats[counter]){
				full = false;
				break;
			}
			else if(seats[9])
				full = true;
		}
		
		return full;
	}

}
