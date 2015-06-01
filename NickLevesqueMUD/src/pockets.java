/*
 * inventory. is used for clues, guns, knife.
 * 
 * list of items setters and getters
 * 
 * items - needs to be extended
 * wepons/ armer/suport	
 * 					spells, med kit
 * swords/club
 * 			
 */

import java.util.ArrayList;


public class pockets {
	
	ArrayList< String > items = new ArrayList< String >();
	int bullets = 20;
	
	
	public void inventory(){//set up for general inventory.
		items.add("gun");
		items.add("knife");
		
	}
	
	public void gun(int bullets){//gives user more bullets.
		
		this.bullets += bullets;
	}
	
	public int getBullets(){
		return bullets;
	}
	
	public void list(){//tells user what they have.
		System.out.println("You have ");
		for(int a = 0; a < items.size(); a++){
			System.out.printf("a %s ", items.get(a));
		}
	}
	
	public void note(){//clue for user. it is a will to a long lost son of the victom.
		items.add("will");
		System.out.println("You found a will that stays something about giving the victom estate");
		System.out.println("to a unknown son that has disapeared.");
		System.out.println("\"I wonder who that could be?\", James asks.");
	}
	

}
