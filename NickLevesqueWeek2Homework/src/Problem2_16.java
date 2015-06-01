import java.util.Scanner;

public class Problem2_16 {
public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		int number1, number2;
		
		System.out.print( "Enter first integer: " );// calling for the first number
		number1 = input.nextInt();// read first number from user
		System.out.print( "Enter second integer: " ); // calling for second number.
	    number2 = input.nextInt(); // read second number from user
	    
	    if( number1 < number2)
	    	System.out.printf("%d is larger", number2);// if statement if number2 is larger
	    
	    if(number1 > number2)
	    	System.out.printf("%d is larger", number1);//if statement if number1 is larger
	    
	    if(number1 == number2)
	    	System.out.printf("%d and %d are the same" ,number1 ,number2 );// if statement if they are the same number
	}
}
