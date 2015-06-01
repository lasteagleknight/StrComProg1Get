// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
  public static void main (String[] args)
  {
      String phrase;    // a string of characters
      int countBlank;   // the number of blanks (spaces) in the phrase 
      int countA;       // the number of As in the phrase 
      int countE;       // the number of Es in the phrase 
      int countS;       // the number of Ss in the phrase 
      int countT;       // the number of Ts in the phrase 
      int length;       // the length of the phrase
      char ch;          // an individual character in the string

      Scanner scan = new Scanner (System.in);

      // Print a program header
      System.out.println ();
      System.out.println ("Character Counter");
      System.out.println ();

      // Read in a string and find its length
      System.out.print ("Enter a sentence or phrase, quit to end: ");
      phrase = scan.nextLine();

      while ()
	  {
	      
	      
	      // Initialize counts
	      

	      // a for loop to go through the string character by character
	      // and count the blank spaces
	      
	      
	      // Print the results
	      System.out.println ();
	      System.out.println ("Number of blank spaces: " + countBlank);
	      System.out.println ("Number of As: " + countA);
	      System.out.println ("Number of Es: " + countE);
	      System.out.println ("Number of Ss: " + countS);
	      System.out.println ("Number of Ts: " + countT);
	      System.out.println ();

	      //Get phrase for next time
	      
	  }
    }
}
