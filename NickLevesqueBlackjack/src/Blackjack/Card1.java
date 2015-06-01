package Blackjack;

public class Card1
{
	  private Suit suit;
	  private CardValue cardValue;
	  private int value;
	 
	  public Card1 (CardValue cardValue, Suit suit, int cardValue1)
	  {
	    this.cardValue = cardValue;
	    this.suit = suit;
	    if(cardValue1 >= 10)
			value = 10;
		else if(cardValue1 == 1)
			value = 11;
		else
			value = cardValue1;
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
	  
	  public int points(){
			return value;
		}
	  public String toString(){
			return  cardValue + " of " + suit;
		}// end method toString
	}