import java.util.Scanner;

public class Problem2_17 {
public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		int x, y, z;
		
		System.out.print( "Enter first integer: " );// calling for the first number
		x = input.nextInt();// read first number from user
		
		System.out.print( "Enter second integer: " ); // calling for second number.
	    y = input.nextInt(); // read second number from user
	    
	    System.out.print( "Enter third integer: " ); // calling for third number.
	    z = input.nextInt(); // read third number from user
	    
	    System.out.printf("The sum of %d, %d, %d is %d\n", x, y, z, ( x + y + z));
	    
	    System.out.printf("The average is %d.\n", ( (x + y + z )/3) );
	    
	    if(x <= y)
	    	if(x < z)
	    		System.out.printf("%d is the smallest number.\n", x);// x is the smallest.
	    
	    if(y < x)
	    	if(y < z)
	    		System.out.printf("%d is the smallest number.\n", z);// y is the smallest.
	    
	    if(z < y)
	    	if(z < x)
	    		System.out.printf("%d is the smallest number.\n", x);// z is the smallest.
	    
	    if(x >= y)
	    	if(x > z)
	    		System.out.printf("%d is the largest number.\n", x);// x is the largest.
	    
	    if(y > x)
	    	if(y > z)
	    		System.out.printf("%d is the largest number.\n", y);// y is the largest.
	    
	    if(z > y)
	    	if(z > x)
	    		System.out.printf("%d is the largest number.\n", z);// z is the largest.
	    	
	}
}
