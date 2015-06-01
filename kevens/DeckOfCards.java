package finalProject;
// Deck class represent a deck of playing cards.

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

public class DeckOfCards {
	

	ArrayList<Card> deck = new ArrayList<Card>(); //array of Card objects
	private int currentCard; // index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52; //constant # of Cards
	
	//constructor fill deck of Cards
	public DeckOfCards() {
			
		currentCard = 0; //set currentCard so first Card dealt is deck[0]
		
		//populate deck with Card object
		for( int count = 0; count < NUMBER_OF_CARDS; count++ ){	
			
			deck.add(new Card( CardValue.values()[(count %13)], Suit.values()[ (count / 13) ], 
					new ImageIcon(getClass().getResource("b" + ((count%13)+1) + "-" + ((count / 13)+1) + ".gif" ))));
					
		}//end for loop
	}//end DeckOfCards constructor
	
	//shuffle deck of Cards with one-pass algorithm
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public int points(){
		int value = deck.get(currentCard).getCardValue().getCardValue();
		return value;
	}
	
	//deal one Card
	public Card dealCard(int currentCard) {
		
		//determine whether Cards remain to be dealt
		if( currentCard < deck.size() ){
			return deck.get(currentCard); //return current Card in array
		}
		else
			return null; // return null to indicate that all Cards were dealt
	}//end method dealCard
	
	public int getDeckSize(){
		return deck.size();
	}
	
}// end class DeckOfCards
