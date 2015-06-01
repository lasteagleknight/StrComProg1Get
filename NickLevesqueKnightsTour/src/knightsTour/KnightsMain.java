/***********************************************  
*- Exercises 7.22-7.24 A Knight's Tour         *
***********************************************/

package knightsTour;

public class KnightsMain {
	static int nextBoard = 0;
	public static void main(String[] args){ 
		for(int a = 0; a < 1000000; a++)
			//this runs knights tour several times until the timer runs out or
			// a complete tour is found.
			if(ChessBoard.chess(a)){
			nextBoard++;
			if(nextBoard == 4){// looking to see the next complete board if you choose to.
				break;			// just add 1
			}
		}
	}
}
