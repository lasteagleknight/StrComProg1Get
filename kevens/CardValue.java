package finalProject;


	
	public enum CardValue
	{
	
	  ACE(1),
	  TWO(2),
	  THREE(3),
	  FOUR(4),
	  FIVE(5),
	  SIX(6),
	  SEVEN(7),
	  EIGHT(8),
	  NINE(9),
	  TEN(10),
	  JACK(13),
	  QUEEN(11),
	  KING(12),
	  JOKER(14);
	  

	  private int cardValue;
	 
	  private CardValue (int value)
	  {
	    this.cardValue = value;
	  }
	 
	  public int getCardValue() {
	    return cardValue;
	  }
	  
	}

