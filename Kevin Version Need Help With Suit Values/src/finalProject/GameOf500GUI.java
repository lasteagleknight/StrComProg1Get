package finalProject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSpinner;


public class GameOf500GUI extends JFrame {
	
	private BorderLayout border=new BorderLayout();
	private GridLayout grid=new GridLayout(6,2);
	private JTextField textAreaPlayer1, textAreaPlayer2, textAreaPlayer3, textAreaPlayer4, txtTrickCount,txtSuit;
	private JLabel team1Label, team2Label, player1Label, 
		player2Label, player3Label, player4Label, currentPlayer;
	private JButton submit;
	private JButton[] card;
	private JPanel lay, lay2, lay3, cardHand, hand1, hand2, hand3, hand4;
	GameOf500 game = new GameOf500();
	
	public GameOf500GUI(){
		
		super("500");
		
		setLayout(new FlowLayout());
		
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
		add(lay);
		
		
		//*****************************************
		
	
		
		txtTrickCount = new JTextField(12);
		txtSuit = new JTextField(12);
		
		txtTrickCount.setText("Trick Count --->");
		add(txtTrickCount);
		txtTrickCount.setEditable(false);//Makes the card value uneditable
		txtTrickCount.setColumns(10);
		
		final JSpinner TrickSpinner = new JSpinner();
		TrickSpinner.setModel(new SpinnerNumberModel(7, 7, 10, 1));
		
		txtSuit.setText("Suit --->");
		txtSuit.setEditable(false);//Makes the card value uneditable
		txtSuit.setColumns(10);
		
		
		
		lay3 = new JPanel(new FlowLayout());
		add(txtTrickCount);
		add(TrickSpinner);
		add(txtSuit);
		
		
		final JSpinner SuitSpinner = new JSpinner();
		SuitSpinner.setModel(new SpinnerListModel(Suit.values()));
		add(SuitSpinner);
		

		JButton btnNewButton = new JButton("Pass");
		btnNewButton.setActionCommand("Pass");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("This is a test of my button PAss");
				//Put a method to go to next player here
			}
		});
		add(btnNewButton);
		
		JButton WagerButton = new JButton("Wager");
		WagerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Wagerdata = Integer.parseInt(TrickSpinner.getValue().toString());
				wageListener.wager(Wagerdata);
				wageListener.suitspin(SuitSpinner.getValue());
				
				System.out.println(game.player1.getName());
				System.out.println(game.player2.getName());
				System.out.println(game.player3.getName());
				System.out.println(game.player4.getName());
			}
		});
		add(WagerButton);
		
		
		//add wage display *********************************************
		
		GUIHandler handler=new GUIHandler();
		submit.addActionListener(handler);
		textAreaPlayer1.addActionListener(handler);
		textAreaPlayer2.addActionListener(handler);
		textAreaPlayer3.addActionListener(handler);
		textAreaPlayer4.addActionListener(handler);
		
		lay2 = new JPanel(new FlowLayout());
		currentPlayer = new JLabel("");
		//lay2.add();
		lay2.add(currentPlayer);
		add(lay2);
		
		game.dealHands();
		
		hand1 = new JPanel(new FlowLayout());
		hand1 = cardHandDisplay(game.player1);
		hand1.setVisible(true);
		
		add(hand1);
		
		hand2 = new JPanel(new FlowLayout());
		hand2 = cardHandDisplay(game.player2);
		hand2.setVisible(true);
		add(hand2);
		
		hand3 = new JPanel(new FlowLayout());
		hand3 = cardHandDisplay(game.player3);
		hand3.setVisible(true);
		add(hand3);
		
		hand4 = new JPanel(new FlowLayout());
		hand4 = cardHandDisplay(game.player4);
		hand4.setVisible(true);
		add(hand4);
		
	
			
	}
	
	private class GUIHandler implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			game.setPlayers(textAreaPlayer1.getText(), textAreaPlayer2.getText(), textAreaPlayer3.getText(), textAreaPlayer4.getText());
			lay.setVisible(true);
			currentPlayer.setText(game.player1.getName());
			lay2.setVisible(true);
		
			
		}
	}
	
	public JPanel cardHandDisplay(Player cardHolder){
		cardHand = new JPanel(new FlowLayout());
		
		JButton[] card = new JButton[cardHolder.getHandSize()];
		
		for(int i = 0; i < cardHolder.getHandSize(); i++){
			card[i] = new JButton(cardHolder.getCard(i).getImage());
			cardHand.add(card[i]);
		}
		return cardHand;
		
	}
	
	//Put spinner in here

}
