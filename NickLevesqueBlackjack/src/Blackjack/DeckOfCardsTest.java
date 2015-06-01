//test for Cards and DeckOfCards class.
package Blackjack;

public class DeckOfCardsTest {
	
	static int total = 0;
	//execute application
	public static void main( String[] args){
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		//print all 52 Cards in the order in which they are dealt
		for (int i = 1; i <= 4; i++ )
		{
			total = total + myDeckOfCards.points();
			//deal and display a Card
			System.out.printf("%-19s", myDeckOfCards.dealCard() );
			
			if( i % 4 == 0 )// output a newline after every fourth card
				System.out.println();
		}//end for
		
		System.out.printf("\nTotal points: %d", total);
	}//end main
}//end class DeckOfCardsTest
