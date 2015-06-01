package exercises3_12;
// Lab 1: AccountTest.java
// Create and manipulate an Account object.
import java.util.Scanner;

public class AccountTest
{
   // main method begins execution of Java application
   public static void main( String args[] ) 
   {
      Account account1 = new Account( 50.00 ); // create Account object
      Account account2 = new Account( -7.53 ); // create Account object

      // display initial balance of each object
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );
      
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );
      double withdrawalAmount; // withdrawal amount read from user

      System.out.print( "Enter withdrawal amount for account1: " );
      withdrawalAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nsubtracting %.2f from account1 balance\n", 
         withdrawalAmount );
      
      account1.debit(withdrawalAmount);
      /* write code to withdraw money from account */

      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n\n", 
         account2.getBalance() );

      System.out.print( "Enter withdrawal amount for account2: " ); 
      withdrawalAmount = input.nextDouble(); // obtain user input
      System.out.printf( "\nsubtracting %.2f from account2 balance\n", 
         withdrawalAmount );
      /* write code to withdraw from account */
      
      account2.debit(withdrawalAmount);
      
      // display balances
      System.out.printf( "account1 balance: $%.2f\n", 
         account1.getBalance() );
      System.out.printf( "account2 balance: $%.2f\n", 
         account2.getBalance() );
   } // end main

} // end class AccountTest

