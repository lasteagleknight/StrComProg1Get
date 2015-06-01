package Blackjack;
// Deck class represent a deck of playing cards.

import java.util.Random;

public class DeckOfCards {
	
	private Card1[] deck; //array of Card objects
	private int currentCard; // index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52; //constant # of Cards
	// random number generator
	private static final Random randomNumbers = new Random();
	
	
	//constructor fill deck of Cards
	public DeckOfCards() {
			
		deck = new Card1[ NUMBER_OF_CARDS ]; // create array of Card objects
		currentCard = 0; //set currentCard so first Card dealt is deck[0]
		
		//populate deck with Card object
		for( int count = 0; count < deck.length; count++ ){
			deck[ count ] =
					new Card1( CardValue.values()[count %13], Suit.values()[ count / 13 ] , (count % 13)+1 );
		}//end for loop
	}//end DeckOfCards constructor
	
	//shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		//after shuffling dealing should start at deck[ 0 ] again
		currentCard = 0; // reinitialize currentCard
		
		// for each Card, pick another random Card (0-51) and swap them
		for ( int first = 0; first < deck.length; first++ ){
			
			// select a random number between 0 and 51
			int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
			
			// swap current Card with randomly selected Card
			Card1 temp = deck[ first ];
			deck[ first ] = deck[ second ];
			deck[ second ] = temp;
		}// end for
	}// end method shuffle
	
	public int points(){
		int value = deck[currentCard].points();
		return value;
	}
	
	//deal one Card
	public Card1 dealCard() {
		
		//determine whether Cards remain to be dealt
		if( currentCard < deck.length ){
			return deck[ currentCard++]; //return current Card in array
		}
		else
			return null; // return null to indicate that all Cards were dealt
	}//end method dealCard
}// end class DeckOfCards
