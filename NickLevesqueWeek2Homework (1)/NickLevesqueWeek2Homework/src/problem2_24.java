import java.util.Scanner;

public class problem2_24 {
public static void main( String[] args ){
	
	Scanner input = new Scanner( System.in );
	
	int a, b, c, d, e, smallest = 0, largest = 0;
	
	System.out.print( "Enter first integer: " ); // calling for the first number
	a = input.nextInt();// read first number from user
	
	System.out.print( "Enter second integer: " ); // calling for second number.
    b = input.nextInt(); // read second number from user
    
    System.out.print( "Enter third integer: " ); // calling for third number.
    c = input.nextInt(); // read third number from user
    
    System.out.print( "Enter second integer: " ); // calling for second number.
    d = input.nextInt(); // read second number from user
    
    System.out.print( "Enter third integer: " ); // calling for third number.
    e = input.nextInt(); // read third number from user
    
    if( a <= b && a <= c && a <= d && a <= e)
    	smallest = a;
    
     if( b <= a && b <= c && b <= d && b <= e)
    	smallest = b;
     
     if( c <= a && c <= b && c <= d && c <= e )
    	smallest = c;
     
     if( d <= a && d <= b && d <= c && d <= e)
    	smallest = d;
     
     if( e <= a && e <= b && e <= c && e <= d)
     	smallest = e;
     
     if( a >= b && a >= c && a >= d && a >= e)
    	largest = a;
     
      if( b >= a && b >= c && b >= d && b >= e )
    	largest = b;
      
      if( c >= a && c >= b && c >= d && c >= e )
    	largest = c;
      
      if( d >= a && d >= b && d >= c && d >= e )
    	largest = d;
      
      if( e >= a && e >= b && e >= c && e >= d )
    	 largest = e;
      	
   System.out.printf("%d is the smallest number\n", smallest);	  
   System.out.printf("%d is the largest number\n", largest);

	}
}
