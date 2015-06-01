import java.applet.*;
import java.awt.*;
import java.net.*;
import java.text.DecimalFormat;

public class Game extends Applet implements Runnable {

	private static final long serialVersionUID = 1L;
	
	//declarations
	TestBlackJack test = new TestBlackJack(); //connect to the TestBlackJack class
	private volatile Thread thread;
	
	Image[] card = new Image[52]; //array of the 52 card images in a deck
	Image table;
	
	MediaTracker mt; //for creating image
	URL base; //used for creating image
	
	private Image dbImage; //used for drawing image to screen
	
	private Graphics dbg; //used for drawing all graphics to screen
	
	int z = 0; //counter variable
	String msg = "";
	int stage = 0; //stage level

	public void init() {
		//size of the screen that matches the size of the background image
		this.setSize(1440, 812);
		
		//try and catch to get the image files
		try {
			base = getDocumentBase(); // getDocumentbase gets the applet path.
		} catch (Exception e) {
		}

		mt = new MediaTracker(this); // initialize the MediaTracker

		//load the card images to the card[] array
		for (int i = 2; i < 15; i++) {
			for (int y = 1; y < 5; y++) {
				card[z] = getImage(base, "b" + i + "-" + y + ".gif"); //the standard names given to the card files
				z++;
			}//end inner for
		}//end outer for
		
		//add the background image to the mediatracker
		table = getImage(base, "blackjack_table.jpg");
		mt.addImage(table, 1);

		for (int i = 0; i < 52; i++) {
			mt.addImage(card[i], 1);// add each card to media tracker
		}//end for
	}//end init

	public boolean mouseDown(Event e, int x, int y){
		
		msg = " " + x + " " + y;
		
		//0 is the betting stage
		if (stage == 0){
			
			if ( ( x > 1136 && x < 1195) && (y > 752 && y < 797 ) ){
				// The audio that is played when action is performed
				AudioClip noCashSound = getAudioClip(getDocumentBase(), "nocash.wav"); 
				noCashSound.play();
				test.bet = 0;//Clear current bet
			}

			if ( ( x > 1200 && x < 1268) && (y > 735 && y < 786 ) ){
				AudioClip cashSound = getAudioClip(getDocumentBase(), "cash.wav"); 
				cashSound.play();
				test.bet += 1;//add 1 to the bet
			}
			
			if ( ( x > 1276 && x < 1334) && (y > 749 && y < 799 ) ) {
				AudioClip cashSound = getAudioClip(getDocumentBase(), "cash.wav"); 
				cashSound.play();
				test.bet += 5;
			}
			
			if ( ( x > 1346 && x < 1407) && (y > 748 && y < 796 ) ) {
				AudioClip cashSound = getAudioClip(getDocumentBase(), "cash.wav"); 
				cashSound.play();
				test.bet += 10;
			}

			//if you click on place bet
			if ( ( x > 427 && x < 567) && (y > 655 && y < 770 ) )
			{
				if(test.bet>0){
				openDeal(); //deal cards
				stage++; //Stage increments
				AudioClip betSound = getAudioClip(getDocumentBase(), "bet.wav"); 
				betSound.play();
				}
				else{
					AudioClip errorSound = getAudioClip(getDocumentBase(), "error.wav"); 
					errorSound.play();
				}
			}
		} //end betting stage
		
		
		if (stage == 1) {
			
			//if player hits
			if ( ( x > 592 && x < 733) && (y > 655 && y < 770 ) ){
				test.playerHit(); //player hits
				AudioClip betSound = getAudioClip(getDocumentBase(), "bet.wav"); 
				betSound.play();
			}

			//if player stays
			if ( ( x > 758 && x < 899 ) && ( y > 655 && y < 770 ) ) {
				stage++;
				test.dealerHit(); //dealer hits
				msg = test.message; //sets message whether win, lose, or push
			}
		} //end stage 1

		//if dealer wins stage
		if (stage == 2) {
			//if player clicks restart
			if ((x > 924 && x < 1065) && (y > 655 && y < 770)) {
				test.restart(); //player restarts
				stage = 0; //stage is back to betting stage
			}
		} //end stage 2
		
		//music button
		if ((x > 20 && x < 76) && (y > 783 && y < 810)) {
			AudioClip themeSound = getAudioClip(getDocumentBase(), "theme.wav"); 
			themeSound.loop();
		}
		
		//music button
		if ((x > 94 && x < 149) && (y > 783 && y < 810)) {
			AudioClip themeSound = getAudioClip(getDocumentBase(), "theme.wav"); 
			themeSound.stop();
		}
		
		//if player wins hand
		if( TestBlackJack.getPlayerWins() == 1){
			AudioClip stopSound = getAudioClip(getDocumentBase(), "win.wav"); 
			stopSound.play();
		}
		
		//if dealer wins hand
		if( TestBlackJack.getPlayerWins() == 2){
			AudioClip stopSound = getAudioClip(getDocumentBase(), "lose.wav"); 
			stopSound.play();
		}
		
		//if dealer wins hand
		if( TestBlackJack.getPlayerWins() == 4){
			AudioClip blackjackSound = getAudioClip(getDocumentBase(), "blackjack.wav"); 
			blackjackSound.play();
		}
		
		return true;
	}//end mouse event

	public void start() {
		//start the thread
		thread = new Thread(this);
		thread.start();
	}

	public void stop() {
		thread = null;
	}

	public void destroy() {
		thread = null;
	}

	public void run() //sets everything in motion
	{
		//Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

		while (true) {
			//repaint applet
			repaint();

			try {
				Thread.sleep(15);
			} catch (InterruptedException ex) {
				// do nothing
			}

			//Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		}
	}

	public void update(Graphics g) {
		
		if (dbImage == null) {
			dbImage = createImage(this.getSize().width, this.getSize().height);
			dbg = dbImage.getGraphics();
		}

		dbg.setColor(getBackground());
		dbg.fillRect(0, 0, this.getSize().width, this.getSize().height);

		dbg.setColor(getForeground());
		paint(dbg);

		g.drawImage(dbImage, 0, 0, this);
	}

	public void openDeal() {// deal out cards and set arrays and calculate views

		test.initDeal();
		test.setArrays();
		test.calculateValue();
		// open=true;
		// stage++;
	}

	public void paint(Graphics g)
	{	
		g.drawImage( table, 0, 0, this );
		
		Font font;
		int font_size = 11;// fond size for text on screen
		font = new Font("SansSerif", Font.BOLD, font_size);
		g.setFont(font);
		g.setColor(Color.WHITE);
		
		if (stage == 0) {
			g.drawString("Place Bet ", 474, 760);
		}

		if (stage == 1){
			if (test.pValue > 21) {
				stage = 2;
				test.whoWins();
				msg = test.message;
			}
			g.drawString("Hit", 638, 760);
			g.drawString("Stay", 788, 760);
		}//end if
		
		if (stage == 2){
			Font font2;
			int font_size2 = 9;// fond size for text on screen
			font2 = new Font("SansSerif", Font.BOLD, font_size2);
			g.setFont(font2);
			g.setColor(Color.WHITE);
			g.drawString("Play Again ", 928, 760);
		}

		if (stage > 0) {
			Font font3;
			int font_size3 = 30;// fond size for text on screen
			font3 = new Font("SansSerif", Font.BOLD, font_size3);
			g.setFont(font3);
			g.setColor(Color.WHITE);
			//card total of player & dealer
			g.drawString("Player: " + test.pValue, 100, 150);
			g.drawString("Dealer: " + test.dValue, 100, 200);
		}
		
		if (stage > 0) {
			int p = 657; //initial x-axis location
			//draw the players cards
			for (int i = 0; i < test.pCards.size(); i++) {
				g.drawImage(card[test.pCards.get(i)], p, 497, this);
				p += 40;
			}
			
			int d = 657;
			//draw the dealers cards
			for (int i = 0; i < test.dCards.size(); i++) {
				g.drawImage(card[test.dCards.get(i)], d, 100, this);
				d += 40;
			}
		} //end if
		
		Font font4;
		int font_size4 = 50;// fond size for text on screen
		font4 = new Font("SansSerif", Font.BOLD, font_size4);
		g.setFont(font4);
		g.setColor(Color.WHITE);
		g.drawString(test.message, 400, 400);//displays who wins message
		
		Font font5;
		int font_size5 = 18;// fond size for text on screen
		font5 = new Font("SansSerif", Font.BOLD, font_size5);
		g.setFont(font5);
		g.setColor(Color.WHITE);
		DecimalFormat df = new DecimalFormat("#.##");
		g.drawString("Money Left: $" + df.format(test.money)+ "                   Current Bet: $" + test.bet, 520, 805);	
	}//end paint
}//end class
