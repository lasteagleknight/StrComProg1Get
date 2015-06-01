package finalProject;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;


public class GameOf500GUI extends JFrame {
	
	private JTextField textAreaPlayer1, textAreaPlayer2, textAreaPlayer3, textAreaPlayer4, txtTrickCount,txtSuit;
	private JLabel team1Label, team2Label, player1Label, 
		player2Label, player3Label, player4Label, name, trickCard, trick1, trick2, trick3, trick4,wager1,wager2,wager3,wager4,showWinner;
	private JButton submit, PassButton, WagerButton;
	private JButton[] card = new JButton[52];
	private Memory[] cardMemory = new Memory[52];
	private JPanel lay, wagerPanel, cardHand, trickHand, hand1, hand2, hand3, hand4,displayWager;
	JSpinner TrickSpinner, SuitSpinner;
	GameOf500 game = new GameOf500();
	GUIHandler handler = new GUIHandler();
	int stage = 0, currentPlayer = 0, buttoncount, buttonclicks, tricksets, suitwinner;
	PlayersTurn turn, dealersturn;
	
	public GameOf500GUI(){
		
		super("500");
		
		setLayout(new FlowLayout());
		add(enterPlayers());
		add(wager());
		dealersturn = new PlayersTurn(0);	
	}
	
	private class GUIHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource()== submit){
			
			game.dealHands();
			wagerPanel.setVisible(true);	
			game.setPlayers(textAreaPlayer1.getText(), textAreaPlayer2.getText(), textAreaPlayer3.getText(), textAreaPlayer4.getText());
			lay.setVisible(false);
			if(dealersturn.turnCheck() != -1){
				setUpHands(dealersturn.getPlayer());
			}
			//set up else statement later	
			
			
			
			stage = 1;
			}
			
			if(stage ==1){
				
				if(event.getSource() == PassButton){
					System.out.println("This is a test of my button PAss");
					//Put a method to go to next player here
					if(dealersturn.turnCheck() == -1){
						stage = 2;
						buttonclicks = 0;
						wagerPanel.setVisible(false);
						removeHands();
						game.stage2(Betting500.getTrickWinner());
						setUpHands(Betting500.getTrickWinner());
						
						add(trickTable());
					}
					else{
					currentPlayer(dealersturn.getPlayer());
					}
				}
			
				if(event.getSource() == WagerButton){
					Betting500.suitIntSetter((Suit) SuitSpinner.getValue(), dealersturn.getPlayer());
					Betting500.trickIntSetter(Integer.parseInt(TrickSpinner.getValue().toString()));
					showWager(dealersturn.getPlayer(),TrickSpinner.getValue().hashCode(),(Suit) SuitSpinner.getValue());
					currentPlayer(dealersturn.getPlayer());
					if(dealersturn.turnCheck() == -1){
						stage = 2;
						buttonclicks = 0;
						wagerPanel.setVisible(false);
						removeHands();
						game.stage2(Betting500.getTrickWinner());
						setUpHands(Betting500.getTrickWinner());
						suitwinner = Betting500.getHighSuitInteger();
						add(trickTable());
					}
					
					else{
					currentPlayer(dealersturn.getPlayer());
					}//end of change player
				}//end of wagerButton
			}//end of stage 1 events
			
			for(int a = 0; a < buttoncount; a++){
				if(event.getSource() == card[a]){
					if(stage == 2){
						card[a].setVisible(false);
						buttonclicks++;
						if(buttonclicks == 5){
							tricksets = 0;
							turn = new PlayersTurn(Betting500.getTrickWinner());
							currentPlayer(turn.turnCheck());
							trickHand.setVisible(true);
							stage = 3;
							
						}
					}
					else if(stage == 3){
						System.out.println("This is a test of stage3");
						card[a].setVisible(false);
						addCardToTrick(game.player[cardMemory[a].getCardHolder()].getCard(cardMemory[a].getCard()),cardMemory[a].getCardHolder());
						game.stageTrick(cardMemory[a].getCard(), cardMemory[a].getCardHolder(),suitwinner);
						if(game.getTrickcards() == 4){
							Betting500.playerwins(game.HighestPlayer);
							game.startTrick();
							resettrick();
							tricksets++;
							if(tricksets == 10){
								add(winner());
							}
							
						}
						currentPlayer(turn.turnCheckRepeat());
						
					}
					else{
						//something happens if it isn't stage2 or stage3
					}
				}
				
			}//end of for loop
		}// end of action performed
	}//end of action listener
	
	public JPanel cardHandDisplay(Player cardHolder,int player){
		cardHand = new JPanel( new GridLayout( 2, 8)); 
		
		name = new JLabel(cardHolder.getName());
		cardHand.add(name);
		
		
		for(int i = 0; i < cardHolder.getHandSize(); i++){
			card[buttoncount] = new JButton(cardHolder.getCard(i).getImage());
			cardHand.add(card[buttoncount]);
			cardMemory[buttoncount] = new Memory(player, i);
			card[buttoncount].addActionListener(handler);
			buttoncount++;
		}
		return cardHand;
		
	}
	
	public JPanel trickTable(){//this should use the trick array
		
		trickHand = new JPanel(new FlowLayout());
		//trickHand.add(trickCard);
		
		
		//trickCard = new JLabel(/*Currentcard.getImage()*/);
		
		JTextPane trickScore = new JTextPane();
		
		trick1 = new JLabel(game.player[0].getName());//set a variable to replace "trick1"
		trickHand.add(trick1);
		
		trick2 = new JLabel(game.player[1].getName());
		trickHand.add(trick2);
		
		trick3 = new JLabel(game.player[2].getName());
		trickHand.add(trick3);
		
		trick4 = new JLabel(game.player[3].getName());
		trickHand.add(trick4);
		trickHand.setVisible(false);
		
		//call current card and put it in own JPanel
		//Make the JPanels an array
		//array will hold the card images,  the card values will be passed to GameOf500
		//Have player with each card
		//somehow clear it when everyone plays a card
		//
		
		return trickHand; 
	}
	
	public void addCardToTrick(Card Currentcard, int player){
		switch(player){
		case 0:
			trick1.setIcon(Currentcard.getImage());
			break;
		case 1:
			trick2.setIcon(Currentcard.getImage());
			break;
		case 2:
			trick3.setIcon(Currentcard.getImage());
			break;
		case 3:
			trick4.setIcon(Currentcard.getImage());
			break;
		}
	}
	
	public void showWager(int player, int tricks, Suit suit ){
		switch(player){
		case 0:
			wager1.setText(game.player[0].getName() +" has bet " +tricks +" "+ suit);
			break;
		case 1:
			wager2.setText(game.player[1].getName() +" has bet " +tricks +" "+ suit);
			break;
		case 2:
			wager3.setText(game.player[2].getName() +" has bet " +tricks +" "+ suit);
			break;
		case 3:
			wager4.setText(game.player[3].getName() +" has bet " +tricks +" "+ suit);
			break;
		}
	}
	
	private void currentPlayer(int playablePlayer){
		
		
		if(playablePlayer < 4){
			switch(playablePlayer){
			case 0: //Player 1
				System.out.println("TestBOB1");
				hand1.setVisible(true);
				hand2.setVisible(false);
				hand3.setVisible(false);
				hand4.setVisible(false);
				break;
			case 1:
				System.out.println("TestBOB2");
				hand1.setVisible(false);
				hand2.setVisible(true);
				hand3.setVisible(false);
				hand4.setVisible(false);
				break;
			case 2:
				System.out.println("TestBOB3");
				hand1.setVisible(false);
				hand2.setVisible(false);
				hand3.setVisible(true);
				hand4.setVisible(false);
				break;
			case 3:
				System.out.println("TestBOB4");
				hand1.setVisible(false);
				hand2.setVisible(false);
				hand3.setVisible(false);
				hand4.setVisible(true);
				break;	
		}
		}else{
			//playercyc = 0;	
	}
		
	}
	
	public JPanel enterPlayers(){ // enter players names
		team1Label = new JLabel("Team 1:");
		player1Label = new JLabel("Player 1:");
		player2Label = new JLabel("Player 2:");
		team2Label = new JLabel("Team 2:");
		player3Label = new JLabel("Player 3:");
		player4Label = new JLabel("Player 4:");
		
		textAreaPlayer1 =new JTextField(12);
		textAreaPlayer2 =new JTextField(12);
		textAreaPlayer3 =new JTextField(12);
		textAreaPlayer4 =new JTextField(12);
		
		lay = new JPanel(new FlowLayout() );
		lay.add(team1Label);
		lay.add(player1Label);
		lay.add(textAreaPlayer1);
		lay.add(player2Label);
		lay.add(textAreaPlayer2);
		lay.add(team2Label);
		lay.add(player3Label);
		lay.add(textAreaPlayer3);
		lay.add(player4Label);
		lay.add(textAreaPlayer4);
		
		submit=new JButton("Submit");
		lay.add(submit);
		
		submit.addActionListener(handler);
		textAreaPlayer1.addActionListener(handler);
		textAreaPlayer2.addActionListener(handler);
		textAreaPlayer3.addActionListener(handler);
		textAreaPlayer4.addActionListener(handler);
		
		return lay;
	}
	
	public JPanel wager(){
		
		txtTrickCount = new JTextField(12);
		txtTrickCount.setText("Trick Count --->");
		txtTrickCount.setEditable(false);//Makes the card value uneditable
		txtTrickCount.setColumns(8);
		
		txtSuit = new JTextField(12);
		txtSuit.setText("Suit --->");
		txtSuit.setEditable(false);//Makes the card value uneditable
		txtSuit.setColumns(4);
			
		TrickSpinner = new JSpinner();
		TrickSpinner.setModel(new SpinnerNumberModel(7, 7, 10, 1));
		
		SuitSpinner = new JSpinner();
		SuitSpinner.setModel(new SpinnerListModel(Suit.values()));
		
		PassButton = new JButton("Pass");
		PassButton.setActionCommand("Pass");
		PassButton.addActionListener(handler);
		
		WagerButton = new JButton("Wager");
		WagerButton.addActionListener(handler);
		displayWager = new JPanel(new GridLayout( 4, 1));
		wager1 = new JLabel(game.player[0].getName());
		wager2 = new JLabel(game.player[0].getName());
		wager3 = new JLabel(game.player[0].getName());
		wager4 = new JLabel(game.player[0].getName());
		displayWager.add(wager1);
		displayWager.add(wager2);
		displayWager.add(wager3);
		displayWager.add(wager4);
		
		wagerPanel = new JPanel(new FlowLayout() );
		wagerPanel.add(txtTrickCount);
		wagerPanel.add(txtTrickCount);
		wagerPanel.add(TrickSpinner);
		wagerPanel.add(txtSuit);
		wagerPanel.add(SuitSpinner);
		wagerPanel.add(PassButton);
		wagerPanel.add(WagerButton);
		wagerPanel.add(displayWager);
		wagerPanel.setVisible(false);
		return wagerPanel;
	}
	
	public void setUpHands(int viewedPlayer){
		buttoncount = 0;
		hand1 = new JPanel(new FlowLayout());
		hand1 = cardHandDisplay(game.player[0], 0);
		add(hand1);
		
		hand2 = new JPanel(new FlowLayout());
		hand2 = cardHandDisplay(game.player[1], 1);
		add(hand2);
		
		hand3 = new JPanel(new FlowLayout());
		hand3 = cardHandDisplay(game.player[2], 2);
		add(hand3);
		
		hand4 = new JPanel(new FlowLayout());
		hand4 = cardHandDisplay(game.player[3], 3);
		add(hand4);
		
		currentPlayer(viewedPlayer);
	}
	
	public void removeHands(){
		remove(hand1);
		remove(hand2);
		remove(hand3);
		remove(hand4);
	}
	//Put spinner in here

	public JLabel winner(){
		
		showWinner = new JLabel(Betting500.endGameCon());
		return showWinner;
	}
	
	public void resettrick(){
		trick1.setIcon(null);
		trick2.setIcon(null);
		trick3.setIcon(null);
		trick4.setIcon(null);
	
	}
}



