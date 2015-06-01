package finalProject;



public class GameOf500 {
	
	Player[] player = new Player[4];
	Player wagedCards = new Player("");
	int highCard = 0, HighestPlayer = -1, trickcards = 0;
	
	
	public GameOf500(){
		
		for(int i = 0; i < 4; i++){
			player[i] = new Player("Player ");
		}
		
	}
		
	/*
	 * takes names from JTextField in GUI and under each player array is a player object where we can call setname method
	 */
	public void setPlayers(String name1, String name2, String name3, String name4){
		
		player[0].setName(name1);
		player[1].setName(name2);
		player[2].setName(name3);
		player[3].setName(name4);
		
		
	}

	/*
	 *  Deckof500 removes some unnecessary cards from a standard deck.
	 *  This method instantiates a new deck and shuffles the cards.
	 *  After shuffling it deals each player from player[] 10 cards.
	 *  You can find the dealCard in DeckofCards which pulls the top card off an arraylist of cards.
	 *  All remaining cards are put into the waged cards deck for users to access later.
	 */
	
	
	public void dealHands(){
		DeckOf500 deck = new DeckOf500();
		deck.shuffle();
		
		int i;
		for( i = 0; i < 10; i++){
			player[0].addCard(deck.dealCard(i));
		}
		for(; i < 20; i++){
			player[1].addCard(deck.dealCard(i));
		}
		for(; i < 30; i++){
			player[2].addCard(deck.dealCard(i));
		}
		for(; i < 40; i++){
			player[3].addCard(deck.dealCard(i));
		}
		for(; i < deck.getDeckSize(); i++){
			wagedCards.addCard(deck.dealCard(i));
		}
	}
	
	/*
	 * takes selected cards and puts them into the array
	 */
	
	public void stage2(int highestWager){
		
		for(int i = 0; i < wagedCards.getHandSize();i++){
			player[highestWager].addCard(wagedCards.getCard(i));
			
		}
		
		for(int i = 0; i < player[highestWager].getHandSize(); i++){
			System.out.print(i +" ");
			System.out.print(player[highestWager].getCard(i).toString());
			System.out.println();
		}
		
	}
	public void startTrick(){
		trickcards = 0;
		 highCard = 0;
		 HighestPlayer = -1;
	}
	
	public void stageTrick(int card, int currentPlayer, int wagedcard){
		if(HighestPlayer == -1){
			HighestPlayer = currentPlayer;
			highCard = card;
		}
		else{
			if(player[currentPlayer].getCard(card).compareTo(player[HighestPlayer].getCard(highCard), wagedcard) == 1){
				HighestPlayer = currentPlayer;
				highCard = card;
			}
		}
		trickcards++;
	}

	public int getTrickcards() {
		return trickcards;
	}

	public int getHighCard() {
		return highCard;
	}

	public void setHighCard(int highCard) {
		this.highCard = highCard;
	}

	public int getHighestPlayer() {
		return HighestPlayer;
	}

	public void setHighestPlayer(int highestPlayer) {
		HighestPlayer = highestPlayer;
	}

}

	
