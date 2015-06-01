


public class Player extends Enity{
	map forest = new map();// set up players map
	Party group = new Party(4,4);// set up for a party to add new npc to ask questions and get clues.
	private int event;

	
	public Player(){//set up for player
		super("detective Smith", 4, 4, 50);
		pockets.addItem(new Gun("Revolver", 20));
		pockets.addItem(new Knife("Knife"));
		group.addPerson(new Partner(4,4));
	}

	public int action(String a) {
		event = 0;
		
		switch(a){//this is the basic movement though the whole game.
		case "talk to someone in my group":
			System.out.println("As you look at James he asks\"what do you want?\"");
			group.action(Text.input());
			if(Partner.murder == -1)
				event = -1;
			break;
		case "search yourself.":
			pockets.inventoryList();
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
		case "look closer at an object":
			pockets.lookCloser();//look at your clues.
			break;
		case "help":
			Text.help();
			break;
		default:
				Text.defalt();
				break;
	
		}
		
		if(event > 0 && event <= 10 )
			event = 1;
		switch(event){
		case -1://statement for death.
			System.out.println("You were killed.");
			super.isAlive = false;
			break;
		case 0:
			break;
		case 1://statement if you have to fight.
			fight war = new fight();
			int b = war.battle(Gun.getBullets());
			if(b == -10)
				isAlive = false;
			Gun.setBullets(b);
			break;
		case 11://clue found.
			System.out.println("you found a note");
			pockets.addItem(new Clue("note", Text.note()));
			break;
		case 12:
			System.out.println("You found bullets!");
			Gun.addBullets(20);
			break;
		case 13:
			break;
		default:// if no result happens you just end up traveling.
			System.out.println("You wonder though the forest.");
			
		}
		
		return event;
	}
	
	

}
