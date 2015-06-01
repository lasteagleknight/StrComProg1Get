package finalProject;


import javax.swing.ImageIcon;

/*
 * Each card consists of a suit, value and an image.
 * These cards are built into the deck of cards but pull from Class Suit and Class CardValue
 */

public class Card
{
	  private Suit suit;
	  private CardValue cardValue;
	  private ImageIcon face;
	 
	  public Card (CardValue cardValue, Suit suit, ImageIcon card)
	  {
	    this.cardValue = cardValue;
	    this.suit = suit;
	    this.face = card;
	  }
	 
	  public Suit getSuit()
	  {
	    return suit;
	  }
	 
	  public void setSuit(Suit suit)
	  {
	    this.suit = suit;
	  }
	 
	  public CardValue getCardValue()
	  {
	    return cardValue;
	  }
	 
	  public void setCardValue(CardValue cardValue)
	  {
	    this.cardValue = cardValue;
	  }
	    
	  public String toString(){
			return  cardValue + " of " + suit;
		}// end method toString
	  
	  public ImageIcon getImage(){
		  return face;
	  }
	  
	  public int compareTo(Card card, int wagedsuit){
		int currentCard = this.cardValue.getCardValue();
		int opponentCard = card.cardValue.getCardValue();
		int currentSuit = this.suit.getCardValue();
		int opponentSuit = card.suit.getCardValue();
		
		if(currentSuit == wagedsuit){
			currentSuit = 4;
		}
		
		if(opponentSuit == wagedsuit){
			opponentSuit = 4;
		}
		//if the cards are the same return 0
		if(this.suit==card.suit&&this.suit.getCardValue()==card.suit.getCardValue()&&this.cardValue.getCardValue()==card.cardValue.getCardValue()){
		return 0;
		}
		
		//suits are the same, we need to check ranks
		else if(this.suit==card.suit){
		//if this has a higher faceRank return 1
		if(this.cardValue.getCardValue()>card.cardValue.getCardValue()){
		return 1;
		}
		else
		return -1;
		}
		//if this rank is higher return 1 else return -1
		if(currentSuit>opponentSuit)
		return 1;
		else
		return -1;
		}
		
	}

