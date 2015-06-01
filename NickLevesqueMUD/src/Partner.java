/*
 * This is your partner when this is done he should help you on quest be a sounding board and ends up being the killer if I haven't set up
 * a random killer yet.
 */
public class Partner {
	
	int murder = 0; //check if the user is killed.
	boolean named = false;//check if james is named.
	String killer = "you are the killer";//set up for random killer. set up now for james to be the killer.
	
	public void james(){//talking augment for james.
		boolean done = false;
		do{
			text.intaragate();
			switch(text.input()){
			case "nothing.":
				System.out.println("You just roll your eyes." );
				System.out.println("He wouldn't know he isn't as great a dictective as you.");
				done = true;
				break;
			case "i am done talking to you.":
				System.out.println("Ok.");
				done = true;
				break;
			case "i know who the killer is"://statement for useer to win the game or dies.
				System.out.println("Who is it?");
				if(text.input().equals(killer)){
					text.win();
					done = true;
				}
				else
				{
					murder = -1;
					done = true;
				}
					
				break;
			case "help":
				text.help();
				break;
			default:
				text.defalt();
				break;
				
			}
		}while(!done);//repeats until user is done asking questions.
		
	}
	
	public boolean isNamed(){//asks if killer is named.
		return named;
	}
	
	public void person(){//used if you haven't asked who james is yet.
		boolean done = false;
		System.out.println("You turn to the person who found you.");
		do{
			text.intaragate();
		switch(text.input()){
		case "who are you?"://if asked james is revealed as your partner.
			System.out.println("\"My name is james. I am your partner.\"");
			System.out.println("don't you remember?");
			named = true;
			break;
		case "i am done talking to you."://ends interegation.
			System.out.println("\"Ok.\"");
			done = true;
			break;
		case "who am i?"://set up quest.
			System.out.println("He must of hit you harder then I thought.");
			System.out.println("You are the detective Smith. We are chasing the great spoon killer");
			break;
		case "help":
			text.help();
			break;
		default:
			text.defalt();
			break;
			
		}
		}while(!done);//repeats until user is done asking questions
	}

}
