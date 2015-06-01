package finalProject;


import javax.swing.ImageIcon;

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
	  
	  public int compareTo(Card card){
		//if the cards are the same return 0
		if(this.suit==card.suit&&this.suit.getCardValue()==card.suit.getCardValue()&&this.cardValue.getCardValue()==card.cardValue.getCardValue()){
		return 0;
		}
		//suits are the same, we need to check ranks
		else if(this.suit==card.suit){
		//if both are 10 or face cards
		if(this.suit.getCardValue()==10&&card.suit.getCardValue()==10){
		//if this has a higer faceRank return 1
		if(this.cardValue.getCardValue()>card.cardValue.getCardValue()){
		return 1;
		}
		else
		return -1;
		}
		//if this rank is higher return 1 else return -1
		else if(this.suit.getCardValue()>card.suit.getCardValue())
		return 1;
		else
		return -1;
		}
		//if suit is higher return 1
		else if(this.suit.getValue()>card.suit.getValue()){
		return 1;
		}
		//if suit is lower return -1
		else 
		return -1;
		}//end compareTo()
	}

