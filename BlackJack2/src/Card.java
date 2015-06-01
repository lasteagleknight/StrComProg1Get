
public class Card {
	//card names
	String[] cardNames = { 
			"2 of Spades", "2 of Clubs", "2 of Hearts", "2 of Diamonds", 
			"3 of Spades", "3 of Clubs", "3 of Hearts", "3 of Diamonds", 
			"4 of Spades", "4 of Clubs", "4 of Hearts", "4 of Diamonds", 
			"5 of Spades", "5 of Clubs", "5 of Hearts", "5 of Diamonds", 
			"6 of Spades", "6 of Clubs", "6 of Hearts", "6 of Diamonds", 
			"7 of Spades", "7 of Clubs", "7 of Hearts", "7 of Diamonds", 
			"8 of Spades", "8 of Clubs", "8 of Hearts", "8 of Diamonds", 
			"9 of Spades", "9 of Clubs", "9 of Hearts", "9 of Diamonds", 
			"10 of Spades", "10 of Clubs", "10 of Hearts", "10 of Diamonds", 
			"Jack of Spades", "Jack of Clubs", "Jack of Hearts", "Jack of Diamonds", 
			"Queen of Spades", "Queen of Clubs", "Queen of Hearts", "Queen of Diamonds",
			"King of Spades", "King of Clubs", "King of Hearts", "King of Diamonds", 
			"Ace of Spades", "Ace of Clubs", "Ace of Hearts", "Ace of Diamonds" };
	//card values
	int[] cardNum = { 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6,
			6, 7, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10,
			10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11 };

	public Card() {
	}

	public String cardName(int i) {
		return cardNames[i];
	}

	public int cardValue(int i) {
		return cardNum[i];
	}

}//end class
