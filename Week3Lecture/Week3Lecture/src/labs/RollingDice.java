package labs;
import java.util.Random;
/*
 * Write a complete Java program that simulates the rolling of a pair of dice. 
 * For each die in the pair, the program should generate a random number between 
 * 1 and 6 (inclusive). It should print out the result of the roll for each die 
 * and the total roll (the sum of the two dice), all appropriately labeled. 
 * You must use the Random class. 
 * */
public class RollingDice {
	public static void main(String[]args){
		
		Random rand=new Random();
		
		int dice1, dice2, sum;
		
//		int[] frequency1 = new int[6], frequency2= new int[6], totals=new int[12];
		
		dice1 = rand.nextInt(6)+1;
		
		dice2 = rand.nextInt(6)+1;
		
		sum = dice1 + dice2;
		
		System.out.printf("First dice rolled a %d the second dice rolled a %d\n" ,  dice1, dice2);
		System.out.printf("You got a %d", sum);
		
//		for(int i=0; i<5000000; i++){
//			die1=rand.nextInt(6)+1;
//			die2=rand.nextInt(6)+1;
//		}
			
	}

}
