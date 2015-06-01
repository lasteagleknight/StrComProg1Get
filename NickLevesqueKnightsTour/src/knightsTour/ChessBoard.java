package knightsTour;

public class ChessBoard {
	static int[][] board = new int[8][8]; //chess board
	static int[] memory = new int[65]; //memory of the moves made on the board
	static int[] horizontal = {2 ,1 ,-1 ,-2, -2, -1, 1, 2, 20};// move choices horizontal
	static int[] vertical = {-1 ,-2 ,-2 ,-1, 1, 2, 2, 1, 20};//move choices vertical
	static int rowLoc = 0, colLoc = 0; // location of the chess peace
	static int moves = 0;// canMove is marker to go back if chess peace runs out of moves
	// moves is a counter for moves taken
	static boolean noMoreMoves = false;
	static int cheak = 1;// counter for boards printed
	
	public static boolean chess(int number){// runs the board till there are no more moves left 
		noMoreMoves = false;
		boolean done = false;
		startPlace(number);
		board[rowLoc][colLoc]=100;//starting point
		
		do{
			move();// moves made by chess peace\
			//printBoard();

		}while(!noMoreMoves);
		done = complete();
		printBoard();
		/*if(done){
			printBoard();
		}*/
		movePlacer();
		return done;
	}
	
	public static void printBoard(){//prints current board.
		System.out.printf("this is board #%d\n\n",cheak);// call for board
		for(int[] column: board){// prints board
			for(int cell: column){
				System.out.print(cell+"\t");
				}
			System.out.println();
			System.out.println();
		}//end print
		//Counter.count(moves);
		cheak++;
	}
	
	public static void move(){//set up of the moving of the peace
		moves++;
		int direction = bestStep();
			
		for(;direction <= 8; direction++){
			rowLoc += vertical[direction];
			colLoc += horizontal[direction];
			if(checkOutOfBounds(rowLoc,colLoc) || alreadyThere(rowLoc,colLoc)){
				rowLoc -= vertical[direction];
				colLoc -= horizontal[direction];
				if(direction >= 7){
				//board[rowLoc][colLoc] = 0;
				noMoreMoves = true;
				break;
				}
			}
			else {
				board[rowLoc][colLoc]= moves;
				memory[moves] = direction+1;
				break;
				}
		}
	}
	
	public static void startPlace(int number){
		//based on loops before places the start in a different place and then 
		//changes the the moves of the next worst steps then before.
		int a = 0;
		for(int count = 0; count < number; count++){
			colLoc++;
			if(colLoc == 8){
				colLoc = 0;
				rowLoc++;
				if(rowLoc == 8){
					colLoc = 0;
					rowLoc = 0;
					memory[a]++;
					if(memory[a] == 8){
						memory[a] = 0;
						a++;
					}
				}
			}
		}
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
	
	public static boolean complete(){// checks if board is complete
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
	
	public static void place(){// tells where the peace is debugging reasons.
		System.out.printf("\nThe peace is at row %d and colem %d\n", rowLoc+1, colLoc+1);
	}
	
	public static void marker(){// memory to keep track of memory, debugging reasons.
		System.out.printf("\nMemory is at %d at %d\n", memory[moves],moves);
	}
	
	public static int bestStep(){
		int rowLoc2, colLoc2, bestMove = 10,bestMove2 = 0, actualMove = 0, temp = 0, temp2 = 0;
		int[] moveChoice = {10,10,10,10,10,10,10};//array for the easy board to keep track of moves
		int[] actualArray = new int[7];// actual array of choice moves.
		int[][] easyBoard ={{2, 3, 4, 4, 4, 4, 3, 2},// board of the best moves.
							{3, 4, 6, 6, 6, 6, 4, 3},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{4, 6, 8, 8, 8, 8, 6, 4},
							{3, 4, 6, 6, 6, 6, 4, 3},
							{2, 3, 4, 4, 4, 4, 3, 2}};
		rowLoc2 =rowLoc;//adding a second variable so you don't have to change the first.
		colLoc2 = colLoc;
		
		//those loops look for the best option sets it in array of best choices
		//and picks the best choice based on past failures.
		for(int direction = 0;direction < 8; direction++){
			rowLoc2 += vertical[direction];
			colLoc2 += horizontal[direction];
			if(checkOutOfBounds(rowLoc2,colLoc2)){
				rowLoc2 -= vertical[direction];
				colLoc2 -= horizontal[direction];
				}//out of bounds closed
			else{
				if(easyBoard[rowLoc2][colLoc2] < bestMove){
					if(board[rowLoc2][colLoc2] == 0){
						bestMove = easyBoard[rowLoc2][colLoc2];
						bestMove2 = direction;
						for(int i= 0; i<moveChoice.length; i++){//this sets the array for the best move, then the second best, ect..
							if(bestMove < moveChoice[i]){
								//sets the array for easyboards best moves in the current spot.
								temp=moveChoice[i];
								moveChoice[i]=bestMove;//assign the value of a random index into i overwriting the original value
								bestMove=temp;//put the value held in temp into the random index, thus completing the swap
								
								temp2=actualArray[i]; //mimics the top trader but for the actual move.
								actualArray[i]=bestMove2;
								bestMove2=temp2;
							}
						}//end for	
						//actualMove = direction;
					}//board choice closed
				}//bestMove row closed
				rowLoc2 =rowLoc;
				colLoc2 = colLoc;
			}// else statement closed	
		}// direction loop closed
		actualMove = actualArray[memory[moves]];// places the best move in the actual move.
		return actualMove;
	}
	
	public static void movePlacer(){// this cleans up the board for the next loop
		colLoc = 0;
		rowLoc = 0;
		moves = 0;
		for(int wipe = 0;wipe < memory.length; wipe++ ){
			memory[wipe] = 0;
		}
		for(int a = 0; a < 8; a++){
			for(int b = 0; b < 8; b++){
				board[a][b] = 0;
			}
		}
	}
}