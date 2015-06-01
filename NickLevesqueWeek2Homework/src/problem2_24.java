import java.util.Scanner;

public class problem2_24 {
public static void main( String[] args ){
	
	Scanner input = new Scanner( System.in );
	
	int number1, number2, number3, number4, number5, smallest = 0, largest = 0;
	
	System.out.print( "Enter first integer: " ); // calling for the first number
	number1 = input.nextInt();// read first number from user
	
	System.out.print( "Enter second integer: " ); // calling for second number.
    number2 = input.nextInt(); // read second number from user
    
    System.out.print( "Enter third integer: " ); // calling for third number.
    number3 = input.nextInt(); // read third number from user
    
    System.out.print( "Enter second integer: " ); // calling for second number.
    number4 = input.nextInt(); // read second number from user
    
    System.out.print( "Enter third integer: " ); // calling for third number.
    number5 = input.nextInt(); // read third number from user
    
    if( number1 <= number2 && number1 <= number3 && number1 <= number4 && number1 <= number5)
    	smallest = number1;
    
     if( number2 <= number1 && number2 <= number3 && number2 <= number4 && number2 <= number5)
    	smallest = number2;
     
     if( number3 <= number1 && number3 <= number2 && number3 <= number4 && number3 <= number5 )
    	smallest = number3;
     
     if( number4 <= number1 && number4 <= number2 && number4 <= number3 && number4 <= number5)
    	smallest = number4;
     
     if( number5 <= number1 && number5 <= number2 && number5 <= number3 && number5 <= number4)
     	smallest = number5;
     
     if( number1 >= number2 && number1 >= number3 && number1 >= number4 && number1 >= number5)
    	largest = number1;
     
      if( number2 >= number1 && number2 >= number3 && number2 >= number4 && number2 >= number5 )
    	largest = number2;
      
      if( number3 >= number1 && number3 >= number2 && number3 >= number4 && number3 >= number5 )
    	largest = number3;
      
      if( number4 >= number1 && number4 >= number2 && number4 >= number3 && number4 >= number5 )
    	largest = number4;
      
      if( number5 >= number1 && number5 >= number2 && number5 >= number3 && number5 >= number4 )
    	 largest = number5;
      	
   System.out.printf("%d is the smallest number\n", smallest);	  
   System.out.printf("%d is the largest number\n", largest);

	}
}
