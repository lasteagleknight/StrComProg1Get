import java.util.*;

public class Deck {
	//declaring instance variables
	ArrayList<Integer> dealtCards; //array holding all the cards
	ArrayList<Integer> pCards; //player cards
	ArrayList<Integer> dCards; //dealer cards
	private static int playerWins; //Integer state where 1 player wins, 2 dealer wins, 3 push, 4 blackjack
	int pValue; //player point value
	int dValue; //dealer point value
	String message; //string message of who wins
	int rand;
	boolean gameOver;

	private double money;
	private int bet;

	Card c = new Card(); //connect to the Card class
	
	public Deck() {
		
		dealtCards = new ArrayList<Integer>();
		pCards = new ArrayList<Integer>();
		dCards = new ArrayList<Integer>();
		gameOver = false; 
		playerWins = 0; 
		rand = 0; 
		pValue = 0; 
		dValue = 0; 
		message = ""; 
		c = new Card(); 

		money = 100.00; //start off with $100
		bet = 0; //initial bet
	}
	
	public void initDeal() {
		int y = 0;
		
		//add 4 cards to array list dealtCards
		while (y < 4) {
			dealtCards.add( dealCard() ); 
			y++;
		}
	}
	
	public void restart() {
		dealtCards = new ArrayList<Integer>();
		pCards = new ArrayList<Integer>();
		dCards = new ArrayList<Integer>();
		gameOver = false;
		playerWins = 0;
		rand = 0;
		pValue = 0;
		dValue = 0;
		message = "";
		c = new Card();
		bet = 0;
	}

	public int dealCard() {
		
		do{
			//get a random number from method getRandom and assign to variable rand
			rand = getRandom(); 
		} 
		//run until the random number is true from exist method
		//used to make sure the random numbers are constrained to the 4 suits in a deck
		while( !exist( rand ) );
		
		//return the random value
		return rand;
	}

	//get random card from 0-inclusive and 52-exclusive
	public int getRandom() {
		return (int) ( Math.random() * (52) );
	}

	
	//method to test if card is dealt more than 4 times
	public boolean exist( int num ){
		
		int count = 0; //count of how many individual card values are present
		
		//run loop for each instance of the array list dealtCards
		for ( int i = 0; i < dealtCards.size(); i++ ) {
			
			//if the dealtCard value equals the current random number num
			if ( dealtCards.get( i ) == num )
				count++;
		}
		
		//if more than 4 cards of the same value are found, return false
		if ( count > 3 )
			return false; //card does not exist
		else
			return true; //card does exist
	}

	public void setArrays() {
		
		//adding the values from the dealt cards array list to player card array list pCards
		pCards.add( dealtCards.get( 0 ) );
		pCards.add( dealtCards.get( 1 ) );
		
		//adding the values from the dealt cards array list to dealer card array list dCards
		dCards.add( dealtCards.get( 2 ) );
		dCards.add( dealtCards.get( 3 ) );
	}

	public void calculateValue() {
		
		//add up player card value
		pValue = 0;
		for (int i = 0; i < pCards.size(); i++)
			//player point value equals points + cardValue of each integer from 0-51 stored in pCards array
			pValue += c.cardValue( pCards.get( i ) ); 
		
		//add up dealer card values
		dValue = 0;
		for (int i = 0; i < dCards.size(); i++)
			dValue += c.cardValue( dCards.get( i ) ); //	
	}

	//method that finds who wins
	public int whoWins() {
		
		//if dealer busted, player wins
		if ( dValue > 21 ) {
			gameOver = true;
			playerWins = 1;
		}
				
		//if player busted, dealer wins
		if ( pValue > 21 ) {
			gameOver = true;
			playerWins = 2;
		}
				
		//if player has blackjack
		if ( pValue == 21 ){
			gameOver = true;
			playerWins = 4;
		}	

		//if the game is not over
		if (gameOver == false) {
			
			//if dealer value is higher, dealer wins
		    if ( dValue > pValue )
				playerWins = 2;
			
		    //if player value is higher, player wins
			else if ( dValue < pValue )
				playerWins = 1;
		    
		    //if dealer = player, it's a push
			else
				playerWins = 3;

			gameOver = true; //end game state once winner is found
		}

		//if player wins
		if ( playerWins == 1 ) {
			message = "Player WINS!!! Congrats ";
			money = bet + money; //increase money by bet amount
		} 
		
		//if dealer wins
		else if ( playerWins == 2 ) {
			message = "Dealer Wins, Try again! ";
			money = money - bet; //decrease money by bet amount
		} 
		
		//if player has a blackjack
		else if ( playerWins == 4 ) {
			message = "    You got a BlackJack!";
			money = money + ( bet * 1.5 ); //increase money, blackjack pays 3 to 2
		} 
		
		//else if push
		else
			message = "PUSH";
		
		//return who wins
		return playerWins;
	}

	public void playerHit() {
		dealtCards.add( dealCard() ); //add a card to the dealtCards arrayList
		pCards.add( rand ); //
		calculateValue(); //call method that calculates the pValue
		//whoWins(); this messes up the game for some reason but lose sound works?
	}

	public void dealerHit() {
		
		//dealer must stay counts of 17 and over
		while ( dValue < 17 ) {
			dealtCards.add( dealCard() ); //add a card to the dealtCards array list
			dCards.add( rand ); //
			calculateValue(); //call method that calculates the dValue
		}
		
		whoWins(); //return who wins
	}
	
	//getters and setters
	public int getPlayerWins() {
		return playerWins;
	}
	public void setPlayerWins( int playerWins ) {
		Deck.playerWins = playerWins;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getBet() {
		return bet;
	}

	public void setBet(int bet) {
		this.bet = bet;
	}
}//end class