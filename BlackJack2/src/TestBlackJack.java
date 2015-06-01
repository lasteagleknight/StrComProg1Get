import java.util.*;

public class TestBlackJack {
	//declaring instance variables
	ArrayList<Integer> dealtCards;
	ArrayList<Integer> pCards;
	ArrayList<Integer> dCards;
	boolean gameOver;
	private static int playerWins;// 1 - player wins, 2 dealer wins, 3 push
	int rand;
	int pValue; //player point value
	int dValue; //dealer point value
	String message;
	Card c;

	double money;
	int bet;

	public TestBlackJack() {
		dealtCards = new ArrayList<Integer>();
		pCards = new ArrayList<Integer>();
		dCards = new ArrayList<Integer>();
		gameOver = false;
		playerWins = 0;// 1 - player wins, 2 dealer wins, 3 push
		rand = 0;
		pValue = 0;
		dValue = 0;
		message = "";
		c = new Card();

		money = 100.00; //start off with $100
		bet = 0;
	}

	public void restart() {
		dealtCards = new ArrayList<Integer>();
		pCards = new ArrayList<Integer>();
		dCards = new ArrayList<Integer>();
		gameOver = false;
		playerWins = 0; //1 player wins, 2 dealer wins, 3 push, 4 blackjack
		rand = 0;
		pValue = 0;
		dValue = 0;
		message = "";
		c = new Card();
		bet = 0;
	}

	public void initDeal() {
		int y = 0;
		while (y < 4) {
			dealtCards.add(dealCard());
			y++;
		}

	}

	public int dealCard() {
		rand = getRandom();
		while (exist(rand))
			rand = getRandom();
		return rand;
	}

	public int getRandom() {
		return (int) (Math.random() * (52));
	}

	public boolean exist(int num){
		for (int i = 0; i < dealtCards.size(); i++) {
			if (dealtCards.get(i) == num)
				return true;
		}
		return false;
	}

	public void setArrays() {
		pCards.add(dealtCards.get(0));
		pCards.add(dealtCards.get(2));
		dCards.add(dealtCards.get(1));
		dCards.add(dealtCards.get(3));
	}

	public void calculateValue() {
		pValue = 0;
		//add up player card value
		for (int i = 0; i < pCards.size(); i++)
			pValue += c.cardValue(pCards.get(i));
		
		//add up dealer card values
		dValue = 0;
		for (int i = 0; i < dCards.size(); i++)
			dValue += c.cardValue(dCards.get(i));

		//if player busted
		if (pValue > 21) {
			gameOver = true;
			playerWins = 2;
		}

		//if dealer busted
		if (dValue > 21) {
			gameOver = true;
			playerWins = 1;
		}
		//if blackjack
		if (pValue == 21){
			gameOver = true;
			playerWins = 4;
		}
	}

	public int whoWins() {

		if (gameOver == false) {
			//if dealer value is higher
		    if (dValue > pValue)
				playerWins = 2;
			//if player value is higher
			else if (dValue < pValue)
				playerWins = 1;
			//if push
			else
				playerWins = 3;

			gameOver = true;
		}

		if (playerWins == 1) {
			message = "Player WINS!!! Congrats ";
			money = bet + money;
		} else if (playerWins == 2) {
			message = "Dealer Wins! Try again! ";
			money = money - bet;
		} else if (playerWins == 4) {
			message = "    You got a BlackJack!";
			money = money + (bet * 1.5);
		} else
			message = "PUSH";
		return playerWins;
	}

	public void playerHit() {
		dealtCards.add(dealCard());
		pCards.add(rand);
		calculateValue();
	}

	public void dealerHit() {
		while (gameOver == false && dValue < 17) {
			dealtCards.add(dealCard());
			dCards.add(rand);
			calculateValue();
			if (dValue > 21) {
				gameOver = true;
				playerWins = 1;
			}
		}
		whoWins();
	}
	
	public static int getPlayerWins() {
		return playerWins;
	}

	public void setPlayerWins(int playerWins) {
		TestBlackJack.playerWins = playerWins;
	}
}//end class