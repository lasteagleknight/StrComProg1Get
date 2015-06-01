import java.util.Scanner;

public class Problem2_17 {
public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		int number1, number2, number3;
		
		System.out.print( "Enter first integer: " );// calling for the first number
		number1 = input.nextInt();// read first number from user
		
		System.out.print( "Enter second integer: " ); // calling for second number.
	    number2 = input.nextInt(); // read second number from user
	    
	    System.out.print( "Enter third integer: " ); // calling for third number.
	    number3 = input.nextInt(); // read third number from user
	    
	    System.out.printf("The sum of %d, %d, %d is %d\n", number1, number2, number3, ( number1 + number2 + number3));
	    
	    System.out.printf("The average is %d.\n", ( (number1 + number2 + number3 )/3) );
	    
	    if(number1 <= number2)
	    	if(number1 <= number3)
	    		System.out.printf("%d is the smallest number.\n", number1);// number1 is the smallest.
	    
	    if(number2 <= number1)
	    	if(number2 <= number3)
	    		System.out.printf("%d is the smallest number.\n", number2);// number2 is the smallest.
	    
	    if(number3 <= number2)
	    	if(number3 <= number1)
	    		System.out.printf("%d is the smallest number.\n", number3);// number3 is the smallest.
	    
	    if(number1 >= number2)
	    	if(number1 >= number3)
	    		System.out.printf("%d is the largest number.\n", number1);// number1 is the largest.
	    
	    if(number2 >= number1)
	    	if(number2 >= number3)
	    		System.out.printf("%d is the largest number.\n", number2);// number2 is the largest.
	    
	    if(number3 >= number2)
	    	if(number3 >= number1)
	    		System.out.printf("%d is the largest number.\n", number3);// number3 is the largest.
	    	
	}
}
