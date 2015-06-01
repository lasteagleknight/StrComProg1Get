package finalProject;

import javax.swing.ImageIcon;

/*
 * The DeckOf500 class extends DeckofCards and Inherits all decks from a standard deck and removes certain cards for a deck for the game 500
 * It also adds the joker to the deck
 * writing the program this way allows us to use this same deck if we decided to add different games
 */

public class DeckOf500 extends DeckOfCards{
	
	
	public DeckOf500(){
		super();
		super.deck.remove(1);
		super.deck.remove(1);
		super.deck.remove(12);
		super.deck.remove(12);
		super.deck.remove(22);
		super.deck.remove(22);
		super.deck.remove(33);
		super.deck.remove(33);
		super.deck.add(new Card(CardValue.JOKER,Suit.BLACK , new ImageIcon(getClass().getResource("b14-1.gif" ))));
			
	}	

}
