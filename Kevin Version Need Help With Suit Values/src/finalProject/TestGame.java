package finalProject;

import javax.swing.JFrame;

public class TestGame {
	
	public static void main(String[] args){
		DeckOf500 deck = new DeckOf500();
		for(int i = 0; i < deck.getDeckSize(); i++){
			System.out.print(i +" ");
			System.out.print(deck.dealCard(i).toString());
			System.out.println();
		}
		GameOf500GUI myGUI= new GameOf500GUI();
		myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myGUI.setSize(1000, 800);
		myGUI.setVisible(true);
	}

}
