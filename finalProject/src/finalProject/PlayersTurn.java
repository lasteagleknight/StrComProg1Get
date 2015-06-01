package finalProject;

public class PlayersTurn {
	
	private int winner, playedTwice = 0, player, lastplayer;
	
	public PlayersTurn(int winner){
		
		this.winner = winner;
		lastplayer = winner;
		
	}
	
	public int turnCheck(){
		player = lastplayer;
		lastplayer++;
		if(lastplayer == 4){
			lastplayer = 0;
		}
		if(player == winner){
			playedTwice++;
			if(playedTwice == 2){
				player = -1;
			}
		 }
		return player;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}
	
	public int turnCheckRepeat(){
		player = lastplayer;
		lastplayer++;
		if(lastplayer == 4){
			lastplayer = 0;
		}
		
		return player;
	}

}
