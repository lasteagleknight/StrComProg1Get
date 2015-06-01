/*
 * could be abstract
 * hit points
 * exp
 * stats
 * must have inventory
 * hirearky
 * enity
 * gender
 * has to have location
 * roge/fighter/mage
 * 		swasbuclyer/bruit
 * ninja/theif pickpokets
 * 					sorserer/wizzards/enchanter
 */

public class Player {//is active player in the game
		
		boolean isAlive = true;
		pockets stuff = new pockets();

		public void player(){
			stuff.inventory();//sets up inventory.
		}
		
		public void die(){
			isAlive = false;
		}
		
		public void bringBack(){
			isAlive = true;
		}
		
		public boolean isAlive(){
			return isAlive;
		}
		
		public void inventory(int object){//set up for useable items in inventory.
			
			switch(object){
			case 0:
				break;
			case -1:
				stuff.list();
				break;	
			default:
				stuff.gun(object);
			
			}
			
		}
		
		public void action(int a){//actions for users encounters. fighting, death, or clues and people.
			//this is called when the action class is used to see what you came across.
			if(a <= 0 && a <= 10 )
				a = 1;
			switch(a){
			case -1://statement for death.
				System.out.println("You were killed.");
				isAlive = false;
				break;
			case 1://stament if you have to fight.
				fight war = new fight();
				int b = war.battle(stuff.getBullets());
				if(b == -10)
					isAlive = false;
				stuff.gun(b);
				break;
			case 11://cluse found.
				stuff.note();
				break;
			case 12:
			default:// if no result happens you just end up traveling.
				System.out.println("You wonder though the forest.");
				
			}
		}
}
