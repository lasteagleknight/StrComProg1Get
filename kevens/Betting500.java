package finalProject;

public class Betting500 {
	
	private int amount, team1, team2;
	
	
	public Betting500(){
		
		team1 = 0;
		team2 = 0;
		
	}
	
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

	public int getTeam1() {
		return team1;
	}

	public void setTeam1(int team1) {
		this.team1 = team1;
	}

	public int getTeam2() {
		return team2;
	}

	public void setTeam2(int team2) {
		this.team2 = team2;
	}
	
	public void trickWon(int team){
		if(team == 1){
			team1 += amount;
		}
		if(team == 2){
			team2 += amount;
		}
	}
	
	public void tricklost(int team){
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

}
