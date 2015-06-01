/*
 * encounter
 * traps
 * monsters
 * tresures
 * shops
 * helpful entity
 * random int
 * -use by map.
 */
public class Action {
	
	Partner james = new Partner();//makes partner
	map forest = new map();//makes map
	int event;//value for action taken.
	
	public int action(String responce){
		int inventory = 0;
		event = 0;
		
		switch(responce){//this is the basic movement though the whole game.
		case "talk to james":
			System.out.println("As you look at James he asks\"what do you want?\"");
			james.james();
			event = james.murder;
			break;
		case "talk to person":
			james.person();
			break;
		case "search yourself.":
			inventory = -1;
			break;
		case "move right":
			event = forest.moveLocalMap(1);
			break;
		case "move left":
			event = forest.moveLocalMap(3);
			break;
		case "move forward":
			event = forest.moveLocalMap(2);
			break;
		case "move back":
			event = forest.moveLocalMap(4);
			break;
		default:
				text.defalt();
				break;
	
		}
		
		return inventory;		
	}
	 
	public int result(){//returns the results of the action taken.
		return event;
	}

}
