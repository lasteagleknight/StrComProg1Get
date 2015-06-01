
public class Partner extends Enity {
	static String killer = "you are the killer";//set up for random killer. set up now for james to be the killer.
	public static int murder;
	
	public Partner(int locX, int locY){
		super("James", locX, locY, 20);
	}

	
	public static int action(String a) {
		boolean done = false;
		murder = 0;
		do{
			Text.intaragate();
			switch(Text.input()){
			case "nothing.":
				System.out.println("You just roll your eyes." );
				System.out.println("He wouldn't know he isn't as great a dictective as you.");
				done = true;
				break;
			case "i am done talking to you.":
				System.out.println("Ok.");
				done = true;
				break;
			case "i know who the killer is"://statement for user to win the game or dies.
				System.out.println("Who is it?");
				if(Text.input().equals(killer)){
					Text.win();
					done = true;
				}
				else
				{
					murder = -1;
					done = true;
				}
					
				break;
			case "who are you?"://if asked James is revealed as your partner.
				System.out.println("\"My name is james. I am your partner.\"");
				System.out.println("don't you remember?");
				break;
			case "who am i?"://set up quest.
				System.out.println("He must of hit you harder then I thought.");
				System.out.println("You are the detective Smith. We are chasing the great spoon killer");
				break;
			case "help":
				Text.help();
				break;
			default:
				Text.defalt();
				break;
				
			}
		}while(!done);//repeats until user is done asking questions.
	return murder;
	}

}
