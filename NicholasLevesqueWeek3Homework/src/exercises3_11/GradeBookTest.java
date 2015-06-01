package exercises3_11;
import java.util.Scanner;

// Lab 2: GradeBookTest.java
// GradeBook constructor used to specify the course name at the 
// time each GradeBook object is created.

public class GradeBookTest
{
	static String name;
	static Scanner input = new Scanner( System.in );
	
   // main method begins program execution
   public static void main( String args[] )
   { 
	   //asking user for the name variable
	  System.out.println("Who is your instructor?");
	  name = input.nextLine();
	  
      // create GradeBook object
      GradeBook gradeBook1 = new GradeBook(         
         "CS101 Introduction to Java Programming", name );

      gradeBook1.displayMessage(); // display welcome message

      /* write code to change instructor’s name and output changes */

   } // end main

} // end class GradeBookTest

