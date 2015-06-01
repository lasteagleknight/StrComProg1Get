package finalProject;

import javax.swing.JTextField;


public class GameOf500 {
	
	Player player1 = new Player("Player 1");
	Player player2 = new Player("Player 2");
	Player player3 = new Player("Player 3");
	Player player4 = new Player("Player 4");
	Player wagedCards = new Player("");
	
	
	public GameOf500(){
		
	}
		
	public void setPlayers(String name1, String name2, String name3, String name4){
		
		player1.setName(name1);
		player2.setName(name2);
		player3.setName(name3);
		player4.setName(name4);
		
		
	}

	
	public void dealHands(){
		DeckOf500 deck = new DeckOf500();
		deck.shuffle();
		
		int i;
		for( i = 0; i < 10; i++){
			player1.addCard(deck.dealCard(i));
		}
		for(; i < 20; i++){
			player2.addCard(deck.dealCard(i));
		}
		for(; i < 30; i++){
			player3.addCard(deck.dealCard(i));
		}
		for(; i < 40; i++){
			player4.addCard(deck.dealCard(i));
		}
		for(; i < deck.getDeckSize(); i++){
			wagedCards.addCard(deck.dealCard(i));
		}
	}
	
	public int stage1(int points, int suit, int player){
		
		
		return suit;
		
	}

}
	
