/*
 * map that user uses to find items. come across traps, danger, and clues.
 * location
 * x and y
 * 2d array
 * 
 */
import java.util.Random;


public class map {
	
	int rowLoc = 2, colLoc = 2;
	int rowLoc1 = 2, colLoc1 = 2;
	int[][] currentmap = new int[10][10];
	boolean map = false;
	
	public int generalMap(int a){
		int localArea = 0;
		
		int[][] map ={{1, 2, 3, 4, 5},//larger map. if used should map out a house, yard, forest, graveyard. ect.
					  {6, 7, 8, 9, 10},
					  {11, 12, 13, 14, 15},
					  {16, 17, 18, 19, 20},
					  {21, 22, 23, 24, 25}};
		
		// large movement for the user to travel.
		switch(a){
		case -1:
			colLoc++;
			if(colLoc > 4){
				colLoc--;
				localArea = -1;
				Text.outOfBounds();
			}
			else
				generateLocalMap();
			break;
		case -2:
			rowLoc++;
			if(rowLoc > 4){
				rowLoc--;
				localArea = -1;
				Text.outOfBounds();
			}
			else
				generateLocalMap();
			break;
		case -3:
			colLoc--;
			if(colLoc < 0){
				colLoc++;
				localArea = -1;
				Text.outOfBounds();
			}
			else
				generateLocalMap();
			break;
		case -4:
			rowLoc--;
			if(colLoc < 0){
				colLoc++;
				localArea = -1;
				Text.outOfBounds();
			}
			else
				generateLocalMap();
			break;	
		}
		
		System.out.printf("%d %d",rowLoc, colLoc);
		System.out.println();
		
		return localArea;		
	}
	
	public void generateLocalMap(){//sets up random map.
		Random rand=new Random();
		int[][] focusedMap = new int[10][10];
		for(int a = 0; a < focusedMap.length; a++){
			for(int b = 0; b < focusedMap[a].length; b++){
				focusedMap[a][b] = rand.nextInt(100);
			}//end b
		}//end a
		currentmap = focusedMap;		
	}//end generator

	public int moveLocalMap(int a){//movement in local map. returns number for an encounter.
		if(!map)
			generateLocalMap();
		map = true;
		
		switch(a){
		case 1:
			colLoc1++;
			if(colLoc1 > 9){
				if(generalMap(-1) == -1)
					colLoc1--;
				else
					colLoc1 = 0;
			}
			break;
		case 2:
			rowLoc1++;
			if(rowLoc1 > 9){
				if(generalMap(-2) == -1)
					rowLoc1--;
				else
					rowLoc1 = 0;
			}
			break;
		case 3:
			colLoc--;
			if(colLoc1 < 0){
				if(generalMap(-3) == -1)
					colLoc1++;
				else 
					colLoc1 = 9;
			}
			break;
		case 4:
			rowLoc--;
			if(rowLoc1 < 0){
				if(generalMap(-4) == -1)
					rowLoc1++;
				else
					rowLoc1 = 9;
			}
			break;	
		}//end switch
		
		return currentmap[rowLoc1][colLoc1];
	}
	
}
