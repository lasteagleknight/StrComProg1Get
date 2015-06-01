package knightsTour;

public class ChessBoard {
	static int[][] board = new int[8][8]; //chess board
	static int[] memory = new int[64]; //memory of the moves made on the board
	static int rowLoc = 0, colLoc = 0; // location of the chess peace
	static int moves = 0;// canMove is marker to go back if chess peace runs out of moves
	// moves is a counter for moves taken
	static boolean backCheck = false;
	
	public static void chess(){
		int cheak = 1;// counter for boards printed
		board[rowLoc][colLoc]=100;//starting point
		do{
			move();// moves made by chess peace\
			marker();// memory set.
			place();// marker to tell where the chess peace is
			System.out.printf("this is board #%d\n\n",cheak);// call for board
			for(int[] column: board){// prints board
				for(int cell: column){
					System.out.print(cell+"\t");
					}
				System.out.println();
				System.out.println();
			}//end print
			Counter.count(moves);
			cheak++;
		}while(!compleate() || moves == 0); // Checks if all spaces are covered
	}
	
	public static void move(){//set up of the moving of the peace
		moves++;
		switch(memory[moves]){
			
		case 0:
			move2Right();
			move1Up();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move2Left();
				move1Down();
			}
			else{
				movePlacer();
				memory[moves] = 1;
				break;
				}
		case 1:
			move1Right();
			move2Up();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move1Left();
				move2Down();
			}
			else{
				movePlacer();
				memory[moves] = 2;
				break;
			}
		case 2:
			move1Left();
			move2Up();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move1Right();
				move2Down();
			}
			else{
				movePlacer();
				memory[moves] = 3;
				break;
			}
		case 3:
			move2Left();
			move1Up();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move2Right();
				move1Down();
			}
			else{
				movePlacer();
				memory[moves] = 4;
				break;
			}
		case 4:
			move2Left();
			move1Down();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move2Right();
				move1Up();
			}
			else{
				movePlacer();
				memory[moves] = 5;
				break;
			}
		case 5:
			move1Left();
			move2Down();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move1Right();
				move2Up();
			}
			else{
				movePlacer();
				memory[moves] = 6;
				break;
			}
		case 6:
			move1Right();
			move2Down();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move1Left();
				move2Up();
			}
			else{
				movePlacer();
				memory[moves] = 7;
				break;
			}
		case 7:
			move2Right();
			move1Down();
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				move2Left();
				move1Up();
				board[rowLoc][colLoc] = 0;
				moveBack();
				break;
			}
			else{
				movePlacer();
				memory[moves] = 8;
				break;
			}
			default:
				board[rowLoc][colLoc] = 0;
				moveBack();
				break;
		}
	}
	
	public static void moveBack(){//calls if peace has moved to all posable locations
		moves--;
		switch(memory[moves]){
		
		case 1:
			move2Left();
			move1Down();
			movebackSet();
			break;
		case 2:
			move1Left();
			move2Down();
			movebackSet();
			break;
		case 3:
			move1Right();
			move2Down();
			movebackSet();
			break;
		case 4:
			move2Right();
			move1Down();
			movebackSet();
			break;
		case 5:
			move2Right();
			move1Up();
			movebackSet();
			break;
		case 6:
			move1Right();
			move2Up();
			movebackSet();
			break;
		case 7:
			move1Left();
			move2Up();
			movebackSet();
			break;
		case 8:
			move2Left();
			move1Up();
			movebackSet();
			break;
		}//end switch statement
	}
	
	public static boolean checkOutOfBounds(int a, int b){// method for checking if peace is 
		//out of bounds
		
		boolean outBounds = true;
		if(a >= 0 && a < board.length){
			if(b >= 0 && b < board[a].length){
				outBounds = false;
			}
			else
				outBounds = true;				
		}
		else
			outBounds = true;
		
		return outBounds;
		
	}
	
	public static boolean alreadyThere(int a, int b){//method for checking if peace 
		//already landed there
		boolean landed = false;
		
		if(board[a][b] > 0 )
			landed = true;
		else 
			landed = false;
		
		return landed;
	}
	
	public static boolean compleate(){// checks if board is complete
		boolean allThere = true;
		int c = 0;
		for(int a = 0; a < board.length; a++){
			for(int b = 0; b < board[a].length; b++){
				if(board[a][b] == 0){
					allThere = false;
					c = b;
					break;
				}
			}
			if(board[a][c] == 0)
				break;
		}
		return allThere;
	}
	
	//general movements for chess
 	public static void move2Right(){
		colLoc += 2;
	}
	
	public static void move2Left(){
		colLoc -= 2;
	}
	
	public static void move2Up(){
		rowLoc -= 2; 
	}
	
	public static void move2Down(){
		rowLoc += 2;
	}
	
	public static void move1Right(){
		colLoc++;
	}
	
	public static void move1Left(){
		colLoc--;
	}
	
	public static void move1Up(){
		rowLoc--;
	}
	
	public static void move1Down(){
		rowLoc++;
	}

	public static void place(){
		System.out.printf("\nThe peace is at row %d and colem %d\n", rowLoc+1, colLoc+1);
	}
	
	public static void marker(){
		System.out.printf("\nMemory is at %d at %d\n", memory[moves],moves);
	}
	
	public static void movebackSet(){
		//memory[moves] = 0;
		moves--;
	}
	
	public static void movePlacer(){
		board[rowLoc][colLoc]= moves;
		int wipe = moves + 1;
		for(;wipe < memory.length; wipe++ ){
			memory[wipe] = 0;
		}
	}
}
