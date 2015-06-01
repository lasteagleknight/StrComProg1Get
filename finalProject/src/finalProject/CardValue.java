package finalProject;

/*
 * Class CardValue is an enum class with lays out all cards from Ace(Lowest = 1) to Joker(Highest = 14).
 * It is great to use enums for card values because they will never change.
 * In the parameters are the enums variables or values
 */
	
	public enum CardValue
	{
	
	  ACE(12),
	  TWO(1),
	  THREE(2),
	  FOUR(3),
	  FIVE(4),
	  SIX(5),
	  SEVEN(6),
	  EIGHT(7),
	  NINE(8),
	  TEN(9),
	  JACK(13),
	  QUEEN(10),
	  KING(11),
	  JOKER(14);
	  

	  private int cardValue; // this is the enums variable or value
	 
	  private CardValue (int value)
	  {
	    this.cardValue = value;
	  }
	 
	  public int getCardValue() {//This allows us to call for the value of a certain card
	    return cardValue;
	  }
	  
	}

