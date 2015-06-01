/*
 * randoms attackers for user to fend off.
 */
import java.util.Random;


public class attacker {
	
	String animal;
	int power;
	Random rand=new Random();
	
	String[] type ={ //the attacker
			"cat",
			"dog",
			"rat",
			"crazy person",
			"monkey",
			"ninja",
			"moose",
			"masked man"
			};
	
	int[][] life = {//there life and attack points.
			{1,2},
			{2,2},
			{1,1},
			{4,4},
			{3,3},
			{7,7},
			{12,4},
			{6,6}};
	
	public void randomAttack(){//sets up random attacker.
		power = rand.nextInt(7);
		animal = type[power];
	}
	
	public String animal(){//names attacker.
		return animal;
	}
	
	public void hit(){//drained life.
		life[power][0]--;
		System.out.printf("you hit the %s. \n", type[power]);
	}
	
	public int gethealth(){//return life of attacker
		return life[power][0];
	}
	
	public int attack(){//points for attackers attack.
		return life[power][1];
	}
	
}
