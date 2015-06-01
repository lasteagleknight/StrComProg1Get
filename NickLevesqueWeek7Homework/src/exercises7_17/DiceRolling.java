/*
 * Write an application to simulate the rolling of two dice. The application 
 * should use an object of class Random once to roll the first die and again
 * to roll the second die. The sum of the two values should then be calculated.
 * Each die can show an integer value form 1 to 6, so the sum of the values will
 * vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the least frequent
 * Figure 7.28 shows the 36 possible combinations of the two dice. Your application should 
 * roll the dice 36,000,000 times. Use a one-dimensional array to tally the numbers of times each
 * possible sum appears. Display the results in tabular format.
 */
package exercises7_17;

import java.util.Random;

public class DiceRolling {
	
	static Random rand = new Random();
	private static final int NUMBER_OF_ROLLS = 36000000;
	static int[] frequency = new int[11];
	
	
	public static void main(String[]args){
		
		for(int counter = 0; counter < NUMBER_OF_ROLLS; counter++ ){
			int roll = twoDieRoll();
			++frequency[roll-2]; 
		}
		
		
		barChart();
	
	}
	
	public static int dice(){
		int dice = 1+ rand.nextInt(6);
		return dice;
	}
	
	public static int twoDieRoll(){
		int die1 = dice();
		int die2 = dice();
		int twoDie = die1 + die2;
		return twoDie;
	}
	
	public static void barChart(){
		
		for(int count = 0; count < frequency.length; count++){
			System.out.printf("Number %2d: %4d\n", count+2, frequency[count]);
			
		}
		
	}

}
