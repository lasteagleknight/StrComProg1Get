package finalProject;

import java.util.ArrayList;

/*
 * Each player has a name and a hand of cards that only they can see
 *  The Player class allows use to manage each player 
 */

public class Player {
	
	ArrayList<Card> deck = new ArrayList<Card>(); //array of Card objects
	String name;//players name they enter from the GUI
	
	public Player(String name){
		this.name = name;
		
	}

	public ArrayList<Card> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCard(Card card){
		deck.add(card);
	}
	
	public int getHandSize(){
		return deck.size();
	}
	
	public void removeCard(int card){
		deck.remove(card);
	}
	
	public Card getCard(int card){
		return deck.get(card);
	}

}
