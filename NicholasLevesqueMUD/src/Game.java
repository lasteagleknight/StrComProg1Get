
public class Game {
	
	public static void game(){//set up player and world 
		Player gamer = new Player();
		Text.intro();
		do{
		gamer.action(Text.input());
		}while(gamer.isAlive && !Text.cheackwin());
	}

}
 