/*
 * This is set up for a random attacker to attack the player at a random chance.
 */

import java.util.ArrayList;
import java.util.Random;


public class RandomFighter {
	
	String animal;
	static int power;
	static Random rand=new Random();
	static ArrayList<Attacker> fighter=new ArrayList<Attacker>();
	
	
	public static Attacker randomAttack(int locX, int locY){//sets up random attacker.
		fighter.add(new Attacker("cat", locX, locY,1 , 2));
		fighter.add(new Attacker("dog", locX, locY,2 , 2));
		fighter.add(new Attacker("rat", locX, locY,1 , 1));
		fighter.add(new Attacker("crazy person", locX, locY,4 , 4));
		fighter.add(new Attacker("Monkey", locX, locY,3 , 3));
		fighter.add(new Attacker("ninja", locX, locY,7 , 7));
		fighter.add(new Attacker("moose", locX, locY,12 , 4));
		fighter.add(new Attacker("masked man", locX, locY,6 , 6));
		power = rand.nextInt(7);
		return fighter.get(power);
	}
}

