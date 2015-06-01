
import java.util.Scanner;

public class Problem2_25 {
public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		int x, sum;
		
		System.out.print( "Enter first integer: " );// calling for the first number
		x = input.nextInt();// read first number from user
	    
	    sum = x % 2;
	    
	    if(sum == 0)
	    	System.out.printf("%d is even", x);
	    
	    if(sum != 0)
	    	System.out.printf("%d is odd", x);
	    		
	}
}
