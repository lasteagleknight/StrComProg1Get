/*
 * This is standard text that is repeated throughout the game
 */
import java.util.Scanner;


public class Text {
	
	static Scanner input = new Scanner( System.in );
	private static boolean win = false;

	public static void intro(){// set up for the the game. Instructions for when you need it.
		
		System.out.println("\"Wha...\"");
		System.out.println("\"What happend?\"");
		
		System.out.println("You wake up laying on the floor.There is someone standing over you.");
		System.out.println("The person says,\"Sir the murderer knocked you out\"");
		System.out.println("\"Lucky for you I interupted him before he continued the job.\"");
		System.out.println("Type help if you need it");
	}
	
	public static String input(){//input for user to give commands
		String instruction;
		for(int a = 0; a < 20; a++){
			System.out.print("*");
		}
		System.out.println();
		instruction = input.nextLine();
		instruction = instruction.toLowerCase();
		
		return instruction;
	}
	
	public static void outOfBounds(){//out of bounds for user if he steps off the map.
		
		System.out.println("There is a huge cliff");
		System.out.println("There is no way to get past it!");
	}
	
	public static void intaragate(){//method for asking a question.
		System.out.println("\n what do you want to know?\n");
	}
	
	public static void help(){//help asking questions
		System.out.println("There are several general things you can ask");
		System.out.println("I am done talking to you.");
		System.out.println("who are you?");
		System.out.println("search yourself.");
		System.out.println("move right");
		System.out.println("move left");
		System.out.println("move forward");
		System.out.println("move back");
		System.out.println("talk to someone in my group");
		
	}
	
	public static void defalt(){// if the user doesn't enter any of the options
		System.out.println("Ya I don't know what you mean by that. Are you asking for help?");
		System.out.println("Or just type: \"I am done talking to you\" if your done");
	}
	
	public static void win(){//test for winning.
		win = true;
		System.out.println("Nice going detective I guess my killing days are over...");
	}
	
	public static boolean cheackwin(){//statement if player wins.
		return win;
	}
	
	public static void helpBattle(){//battle words used in help.
		System.out.println("use gun");
		System.out.println("use knife");
		System.out.println("run away");
		System.out.println("You have 20 life use it wisely.");
	}
	
	public static String note(){//clue for user. it is a will to a long lost son of the victom.
		return "You found a will that stays something about giving the victom estate\n "
				+ "to a unknown son that has disapeared.\n\"I wonder who that could be?\", James asks.";
		
	}
	
}
