package finalProject;

/*
 * This enum class holds all the suits in a standard deck or cards plus a color for a joker.
 * the ranking system goes with our game 500. In 500 value of suits goes from lowest to highest (Spades, Clubs, Diamonds, Hearts) 
 * A joker is like a trump card which holds the highest value
 */


public enum Suit
{
	SPADES(0),
	CLUBS(1),
	DIAMONDS(2),
	HEARTS(3),
	BLACK(4);
  
  private final int suit;// enum variable or value
	 
  private Suit (int value)
  {
    this.suit = value;
  }
 
  public int getCardValue() {
    return suit;
  }
  public  int getSuitValue(int suitdata) {
	    return  suit;//This is needed to transfer the enum to a int value from the Betting500 class
	  }



}