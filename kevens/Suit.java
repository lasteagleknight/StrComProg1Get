package finalProject;

public enum Suit
{
	CLUBS(1),
	DIAMONDS(2),
	HEARTS(3),
	SPADES(0),
	BLACK(4);
  
  private int suit;
	 
  private Suit (int value)
  {
    this.suit = value;
  }
 
  public int getCardValue() {
    return suit;
  }
  public  int getSuitValue(Object suitData) {
	    return  suit;
	  }
  
}