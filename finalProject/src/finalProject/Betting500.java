package finalProject;


public class Betting500 {
	
	private int amount;
	private static int team1;
	private static int team2;
	private static int playerNow;
	private static int trickwinnerplayer;
	private static int trickInteger;
	private static int suitInteger;
	private static int highTrickInteger;
	private static int highSuitInteger;
	
	
	public Betting500(){
		
		team1 = 0;
		team2 = 0;
		
	}
	/*
	 * This is used by the wager method. It uses a series of switch statements to find the trick values entered by users from the GUI.
	 * This will be the points teams will receive after winning the trick.
	 * The suits are integer values that are noted in the Suit class which represents the ranking scale
	 */
	
	public int score(int points, int suit){
		amount = 0;
		
		if(points == 7){
			switch(suit){
			case 0:
				amount = 140;
				break;
			case 1:
				amount = 160;
				break;
			case 2:
				amount = 180;
				break;
			case 3:
				amount = 200;
				break;
			case 4:
				amount = 220;
				break;
			}
		}
		if(points == 8){
			switch(suit){
			case 0:
				amount = 240;
				break;
			case 1:
				amount = 260;
				break;
			case 2:
				amount = 280;
				break;
			case 3:
				amount = 300;
				break;
			case 4:
				amount = 320;
				break;
			}
		}
		if(points == 9){
			switch(suit){
			case 0:
				amount = 340;
				break;
			case 1:
				amount = 360;
				break;
			case 2:
				amount = 380;
				break;
			case 3:
				amount = 400;
				break;
			case 4:
				amount = 420;
				break;
			}
		}
		if(points == 10){
			switch(suit){
			case 0:
				amount = 440;
				break;
			case 1:
				amount = 460;
				break;
			case 2:
				amount = 480;
				break;
			case 3:
				amount = 500;
				break;
			case 4:
				amount = 520;
				break;
			}
		}
		return amount;
	}

	public int getTeam1() {//getter for team1's score
		return team1;
	}

	public void setTeam1(int team1) {//setter team1's score
		this.team1 = team1;
	}

	public int getTeam2() {//getter for team2's score
		return team2;
	}

	public void setTeam2(int team2) {//Setter team2's score
		this.team2 = team2;
	}
	
	public void trickWon(int team){//if the tick is one team value is passed in and appropriate team wins the points
		if(team == 1){
			team1 += amount;
		}
		if(team == 2){
			team2 += amount;
		}
	}
	
	public void tricklost(int team){//if a team sets the trick and loses it get negitive points
		if(team == 1){
			team1 -= amount;
		}
		if(team == 2){
			team2 -= amount;
		}
	}
	
	public void secondTeamsTricks(int team, int trick){
		if(team == 1){
			team1 += (trick*10);
		}
		if(team == 2){
			team2 += (trick*10);
		}
	}
	
	public static void playerwins(int player){
		if(player ==1 || player ==2)
			team1 += 10;
		if(player ==3 || player ==4)
			team2 += 10;
	}
	

	static Betting500 test = new Betting500();
	
	/*
	 * Once the tricks have been selected by users in GUI the results fall into methods trickIntSetter and suitIntSetter.
	 * These methods set user trick and suit values as wagers and tests to see if the current wager is higher than the previous wagers
	 * If it is higher wager it sets the wager to that value and the player who set the wager is set as first player to play
	 * This method also test if teams have reached the end game condition
	 */
	
	public static void trickIntSetter(int trickInt) {
		
		System.out.println("\nThe trick integer is " +  trickInt);
		System.out.println();
		trickInteger = trickInt;
		test.endGameCon();
		highTrickTester();
		int scoreprint = test.score(trickInteger, suitInteger);
		System.out.println("This score for this trick and suit is "+ scoreprint);
	}
	
	public static void suitIntSetter(Suit suitData, int currentPlayer) {
		
		playerNow = currentPlayer;
		suitInteger = suitData.getCardValue();
}

	/*
	 * This uses and/or to test if the current wager is highest than previous ones
	 */
	
	public static int getHighSuitInteger() {
		return highSuitInteger;
	}

	public static void setHighSuitInteger(int highSuitInteger) {
		Betting500.highSuitInteger = highSuitInteger;
	}

	public static void highTrickTester(){
		
		if( trickInteger>highTrickInteger || suitInteger > highSuitInteger || 0 == highTrickInteger && 0 == highSuitInteger){
			highTrickInteger = trickInteger;
			highSuitInteger = suitInteger;
			trickwinnerplayer = playerNow;
		} 
	    }
	
	public static int getTrickWinner(){
		
		return trickwinnerplayer;
		
	}
	
	/*
	 * When the endGameCon or condition is called, it tests both teams if they are >=500 or <=-500
	 */
	
	
	public static String endGameCon(){
		if(team1 > team2)
			return "Team1 Wins!";
		//if(team1>=500){
			//return "Team1 Wins!";
		//}else if(team1<=-500){
			//return"Team1 Loses";
		//}
		//if(team2>=500){
			//return"Team2 Wins!";
		//}else if(team2<=-500){
			//return "Team2 Loses";
		//}
		else
			return "Team2 Wins!";  
	}
}
