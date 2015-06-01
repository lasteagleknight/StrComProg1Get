package Blackjack;


import java.util.Scanner;

public class Game {
	static Scanner scan=new Scanner(System.in);
	static int playersPoints, dealersPoints;
	static int aceInHandPlayer, aceInHandDealer;
	static int win;// if 1 player loses. if 2 player wins if 3 player gets blackjack.

	public static int play(){
		win = 0;
		aceInHandPlayer = 0;
		aceInHandDealer = 0;
		
		String dealersHiddenCard;//String for the hidden dealer card.
		
		//sets a new deck.
		System.out.println("Shuffling deck...");
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		//keeps track of players and dealers hands
		playersPoints = 0;
		dealersPoints = 0;
		
		//notes players first two cards
		playersPoints = playersPoints + acePointPlayer(myDeckOfCards.points());
		System.out.printf("\n player has a %s ", myDeckOfCards.dealCard());
		playersPoints = playersPoints + acePointPlayer(myDeckOfCards.points());
		System.out.printf("and a %s for %d.", myDeckOfCards.dealCard(), playersPoints);
		if(playersPoints == 21){
			System.out.println("\nBlackjack!");
			win = 3;
			return win;
		}
			
		//notes dealers first two cards
		dealersPoints = dealersPoints + acePointDealer(myDeckOfCards.points());
		System.out.printf("\nThe dealer is showing a %s\n", myDeckOfCards.dealCard());
		dealersPoints = dealersPoints + acePointDealer(myDeckOfCards.points());
		dealersHiddenCard = "The dealer hidden card is a " +myDeckOfCards.dealCard();
		if(dealersPoints == 21){
			System.out.printf("\n%s for %d",dealersHiddenCard ,dealersPoints);
			win = 1;
			return win;
		}
		//ask player if they want to hit or stay.
		while(playerShouldHit()){
			playersPoints = playersPoints + acePointPlayer(myDeckOfCards.points());
			aceInHandCheckPlayer();
			System.out.printf("\n player has a %s for %d", myDeckOfCards.dealCard(), playersPoints);
			if(bust()){
				win = 1;
				return win;
			}
		}
		
		System.out.printf("\n%s for %d",dealersHiddenCard ,dealersPoints);
		
		//figures the dealers hand and stays on a soft 17.
		while(dealerShouldHit(dealersPoints)){
			dealersPoints = dealersPoints + acePointDealer(myDeckOfCards.points());
			aceInHandCheckDealer();
			System.out.printf("\n dealer has a %s for %d\n", myDeckOfCards.dealCard(), dealersPoints);
		}
		
		//figures the winner dealer or player.
		if(dealersPoints > playersPoints && dealersPoints < 22){
			System.out.println("\n dealer wins");
			win = 1;
			}
		else if(playersPoints > dealersPoints){
			System.out.println("\n player wins");
			win = 2;
		}
		else if(playersPoints == dealersPoints){
			System.out.println("\n Break Even. ");
			win = 0;
		}
		return win;
	}
	
	//figures if dealer should hit
	public static boolean dealerShouldHit(int points){
		boolean hit;
		
		if(points <= 16)
			hit = true;
		else
			hit = false;
		
		if(dealersPoints > 21){
			System.out.println("Dealer Bust!");
			win = 2;
		}
		return hit;
	}
	
	//asking if player should hit.
	public static boolean playerShouldHit(){
		boolean hit;
		System.out.println("\nDo you want to hit or stay?");
		String question = scan.nextLine();
		question = question.toLowerCase();
		hit = question.contains("hit");
		return hit;
	}
	
	//checking method to see if a ace is dealt for the player.
	public static int acePointPlayer(int card){
		if(card == 11)
			aceInHandPlayer++;
		return card;
	}
	
	//checking method to see if a ace is dealt for the dealer.
	public static int acePointDealer(int card){
		if(card == 11)
			aceInHandDealer++;
		return card;
	}
	
	//checks to see if ace needs to be high or low for player
	public static void aceInHandCheckPlayer(){
		if(playersPoints > 21 && aceInHandPlayer > 0){
			playersPoints -= 10;
			aceInHandPlayer--;
		}
	}
	
	//cheacks to see if ace needs to be high or low for dealer
	public static void aceInHandCheckDealer(){
		if(dealersPoints > 21 && aceInHandDealer > 0){
			dealersPoints -= 10;
			aceInHandDealer--;
		}
	}
	
	//checks to see if player busts.
	public static boolean bust(){
		boolean goOver = false;
		if(playersPoints > 21){
			System.out.println("\nPlayer bust!");
			goOver = true;
		}
		return goOver;
	}

}
