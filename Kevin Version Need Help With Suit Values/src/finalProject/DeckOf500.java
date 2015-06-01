package finalProject;

import javax.swing.ImageIcon;



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
