/*
 * this is the action for random fighting. or intended fighting if finished.
 * 
 */
import java.util.Random;


public class fight {
	
	String animal;//calls fighter.
	int power;
	Random rand=new Random();

	public int battle(int bullets){//battle choice.
		attacker fighter = new attacker();//calls attacker method. 
		fighter.randomAttack();//used if attack is a random fight.
		int life = 20;//life used.
		
		System.out.printf("you have come across a %s", fighter.animal());
		do{
			int ran = 0;//given choice to run
		switch(text.input()){
		case "help"://give user his options.
			text.helpBattle();
			break;
			
		case "use gun"://gun if user has bullets.
			if(bullets > 0)
			{
				System.out.println("You fire your weppon.");
				bullets--;
				int shot = rand.nextInt(2);//chances of hitting.
				if(shot == 0)
					fighter.hit();
				else
					System.out.println("you missed.");
			}
			else
				System.out.println("You have no ammo");
			break;
			
		case "use knife"://knife if user has no bullets.
			int shot = rand.nextInt(4);
			if(shot == 0)
				fighter.hit();
			else
				System.out.println("you missed.");
			break;
			
		case "run away"://chance to run from encounter.
			int run = rand.nextInt(8);
			if(run == 0){
				fighter.hit();
				ran = 1;
			}
			else;
				System.out.println("Not possable");
			break;
			
		default:
			System.out.println("Action unknown type help for guide.");
		}
		if (ran == 1)//if run was able lets user flee.
			break;
		
		int defend = rand.nextInt(12);//give attacker the chance to fight back.
		if(defend == 0)
			life -= fighter.attack();
		
		if(life < 1){//gives the chance of users death.
			bullets = -10;
			break;
		}
		
		}while(fighter.gethealth() > 0);
		
		System.out.println("You killed it!");	//if user kills attacker
		return bullets;
	}
	

}
