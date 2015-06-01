package exercises7_18;
// Lab 2: Craps.java
// Program plays 1000 games of craps and displays winning
// and losing statistics.
import java.util.Random;

public class Craps 
{
   // create random number generator for use in method rollDice
   private static Random randomNumbers = new Random(); 

   // enumeration with constants that represent the game status
   private enum Status { CONTINUE, WON, LOST };

   //constants that represent common rolls of the dice
   private static final int SNAKE_EYES = 2;
   private static final int TREY = 3;
   private static final int SEVEN = 7;
   private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;
   
   int winSum = 0; // total number of wins
   int loseSum = 0; // total number of losses
   int[] gamesWon = new int[21];
   int[] gamesLost = new int[21];
   // plays one game of craps
   public void play()
   {
      int sumOfDice = 0; // sum of the dice
      int myPoint = 0; // point if no win or loss on first roll
      
      Status gameStatus; // can contain CONTINUE, WON or LOST

      int roll; // number of rolls for the current game      

      //int[] gamesWon = new int[20];
      //int[] gamesLost = new int[20];

      for ( int i = 1; i <= 1000; i++ )
      {
         sumOfDice = rollDice(); // first roll of the dice
         roll = 0;

         // determine game status and point based on sumOfDice
         switch ( sumOfDice ) 
         {
            case SEVEN:  // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
               gameStatus = Status.WON;
               break;
            case SNAKE_EYES:  // lose with 2 on first roll
            case TREY:  // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
               gameStatus = Status.LOST;
               break;
            default: // did not win or lose, so remember point
               gameStatus = Status.CONTINUE; // game is not over
               myPoint = sumOfDice; // store the point
               break; // optional for default case at end of switch
         } // end switch 

         // while game is not complete ...
         while ( gameStatus == Status.CONTINUE ) 
         { 
            sumOfDice = rollDice(); // roll dice again
            roll++;

            // determine game status
            if ( sumOfDice == myPoint ) // win by making point
               gameStatus = Status.WON;
            else if ( sumOfDice == SEVEN ) // lose by rolling 7 
               gameStatus = Status.LOST;
         } // end while 
         
         // all roll results after 20th roll placed in last element
         if(roll > 20)
        	 roll = 20;
         
         // increment number of wins in that roll
         if ( gameStatus == Status.WON )
         {
            ++gamesWon[roll];
            ++winSum;
         } // end if
         else // increment number of losses in that roll
         {
           ++gamesLost[roll];
            ++loseSum;
         } // end else
      } // end for
      
      printStats();
   } // end method play

   // print win/loss statistics
   public void printStats()
   {
      int totalGames = winSum + loseSum; // total number of games
      int length = 0; // total length of the games
      
      // display number of wins and losses on all rolls
      for ( int i = 0; i <= 19; i++ )
      {
    	  System.out.printf("won roll %3d: %5d\n", i+1, gamesWon[i]);
    	  System.out.printf("lost roll %d: %6d\n", i+1, gamesLost[i]);
         
         

         // calculate total number of rolls to win/lose all games
         // add number of wins by number of rolls needed to win
         // add number of losses by number of rolls needed to lose
    	length += gamesWon[i];
        length += gamesLost[i];
      } // end for

      // calculate chances of winning
      System.out.printf( "\n%s %d / %d = %.2f%%\n",
         "The chances of winning are", winSum, totalGames,
         ( 100.0 * winSum / totalGames ) );


      System.out.printf( "The average game length is %.2f rolls.\n",
         ( ( double ) length / totalGames ) );
   } // end method printStats
   
   // roll dice, calculate sum and display results
   public int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt( 6 );  
      int die2 = 1 + randomNumbers.nextInt( 6 );  
      int sum = die1 + die2; // sum die values
      
      //System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

      return sum; // return sum of dice
   } // end method rollDice
} // end class Craps

