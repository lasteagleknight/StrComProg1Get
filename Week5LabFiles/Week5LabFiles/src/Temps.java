// **************************************************************
//   Temps.java
//
//   This program reads in a sequence of hourly temperature 
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it 
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **************************************************************

import java.util.Scanner;

public class Temps
{
    public static void main (String[] args)
    {
	final int HOURS_PER_DAY = 24;

	Scanner scan = new Scanner (System.in);

	int temp;              // a temperature reading
	int maxTemp = -1000;   // the max temp read so far
	int timeOfMax = 0;
	int minTemp = 1000;
	int timeOfMin = 0;
	
	// print program heading
	System.out.println ();
	System.out.println ("Temperature Readings for 24 Hour Period");
	System.out.println ();

	for (int hour = 0; hour < HOURS_PER_DAY; hour++)
	{
	    System.out.print("Eneter the temperature reading at" + hour +"hours:");
	    
	    if (temp > maxTemp)
	    {
	    	maxTemp = temp;

	}

	// Print the results
	System.out.println();
	System.out.println("The maximum temperature is " + maxTemp);
	System.out.println("It occurred at hour " + timeOfMax);
	System.out.println("The minimum temperature is " + minTemp);
	System.out.println("It occurred at hour " + timeOfMin);
	System.out.println();
    }   
    
       
    }
    
}
