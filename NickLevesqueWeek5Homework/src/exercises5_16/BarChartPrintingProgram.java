/*
 * One interesting application of computers is to display graphs and bar charts.
 * Write an application that reads five numbers between 1 and 30. For each number
 * that's read, your program should display the same number of adjacent asterisks.
 * For example, if your program reads the number 7, it should display *******. 
 * Display the bars of asterisk after you read all five numbers
 */
package exercises5_16;

import java.util.Random;

public class BarChartPrintingProgram {
	
	static int randNum;
	
	public static void main(String[] args){
		
		Random rand=new Random();
		
		for(int numbers = 0; numbers <= 5;numbers++){
			
			randNum=rand.nextInt(30)+1;
			
			System.out.print(randNum);
			for(;randNum >0;randNum--){
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
