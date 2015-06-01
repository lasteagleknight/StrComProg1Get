import java.awt.geom.Arc2D.Double;
import java.util.Scanner;

public class Problem2_15 {
	public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		int number1, number2, sum, rem;// set up ints
		
		System.out.print( "Enter first integer: " );// calling for the first number
		number1 = input.nextInt();
		System.out.print( "Enter second integer: " ); // calling for second number.
	    number2 = input.nextInt(); // read second number from user

	    sum = number1 + number2; // add numbers, then store total in sum
	    
	    rem = number1 % number2;

	    System.out.printf( "%d plus %d is %d\n", number1, number2, sum ); // display sum
		
	    System.out.printf( "%d times %d is %d\n",number1, number2, (number1 * number2) );// display times
	    
	    System.out.printf( "the difference of %d and %d is %d\n",number1, number2, (number1 - number2) );//display difference
	    
	    System.out.printf( "%d devided by %d is %d\n with a remander of %d\n",number1, number2,
	    		(number1 / number2), rem );// display division
	   }

	
}
