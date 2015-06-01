import java.util.Scanner;


public class Game {
	
	static Scanner input = new Scanner( System.in );
	
	public static void game(){
		
		Player gamer = new Player();//calls new player.
		gamer.player();//set up inventory.
		Action move = new Action();//calls action method.
		text.intro();//introduces the story.
		
		do{

			int action = move.action(text.input());//action user takes
			gamer.action(move.result());//result of that action
			gamer.inventory(action);//adds inventory if needed.
			
			
		}while(gamer.isAlive() && !text.cheackwin());//game is played untill player dies or figures out the killer.
		
	}

}
