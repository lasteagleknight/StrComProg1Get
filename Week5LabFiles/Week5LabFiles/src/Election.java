// ***************************************************************
//   Election.java
//
//   This file contains a program that tallies the results of
//   an election.  It reads in the number of votes for each of
//   two candidates in each of several precincts.  It determines
//   the total number of votes received by each candidate, the
//   percent of votes received by each candidate, the number of 
//   precincts each candidate carries, and the 
//   maximum winning margin in a precinct.
// **************************************************************

import java.util.Scanner;

public class Election
{
    public static void main (String[] args)
    {
	int votesForPolly;  // number of votes for Polly in each precinct
	int votesForErnest; // number of votes for Ernest in each precinct
	int totalPolly;     // running total of votes for Polly
	int totalErnest;    // running total of votes for Ernest
	int pollyPrecincts;  // number of precincts won by Polly
	int ernestPrecincts; // number of precincts won by Ernest
	int tiePrecincts;    // number of precincts that are tied
	String response;     // answer (y or n) to the "more precincts" question
	int won;

	Scanner scan = new Scanner (System.in);

	System.out.println ();
	System.out.println ("Election Day Vote Counting Program");
	System.out.println ();

	// Initializations
	totalPolly = 0;
	totalErnest = 0;
	pollyPrecincts = 0;
	ernestPrecincts = 0;
        tiePrecincts = 0;

	System.out.print("Are there any precincts to process? (y/n) ");
	response = scan.next();
	
	response = response.toLowerCase();
	

	// Loop to "process" the votes in each precinct

	while (response.equalsIgnoreCase("y"))
	    {
			System.out.print("How many votes did polly get?");
			votesForPolly = scan.nextInt();
			System.out.println();
			
			System.out.print("How many votes did Ernest get?");
			votesForErnest = scan.nextInt();
			System.out.println();
			
			totalPolly += votesForPolly;
			totalErnest += votesForErnest;
			
			if(votesForPolly > votesForErnest)
				pollyPrecincts++;
			else if(votesForErnest > votesForPolly)
				ernestPrecincts++;
			else
				tiePrecincts++;
			
			System.out.print("Are there any precincts to process? (y/n) ");
			response = scan.next();
			
			response = response.toLowerCase();
		}

	System.out.println();
	System.out.println("Polly got " + totalPolly + " votes or " + (100*totalPolly/(double)(totalPolly + totalErnest)) + "%.");
	System.out.println("Ernest got " + totalErnest + " votes or " + (100*totalErnest/(double)(totalPolly + totalErnest)) + "%.");
	System.out.println("Polly won " + pollyPrecincts + " precincts.");
	System.out.println("Ernest won " + ernestPrecincts + " precincts.");
	System.out.println(tiePrecincts + " precincts were tied.");
	System.out.println();
    }
}
