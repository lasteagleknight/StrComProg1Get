import java.util.Scanner;

public class Problem2_16 {
public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		int x, y;
		
		System.out.print( "Enter first integer: " );// calling for the first number
		x = input.nextInt();// read first number from user
		System.out.print( "Enter second integer: " ); // calling for second number.
	    y = input.nextInt(); // read second number from user
	    
	    if( x < y)
	    	System.out.printf("%d is larger", y);// if statement if y is larger
	    
	    if(x > y)
	    	System.out.printf("%d is larger", x);//if statement if x is larger
	    
	    if(x == y)
	    	System.out.printf("%d and %d are the same" ,x ,y );// if statement if they are the same number
	}
}
