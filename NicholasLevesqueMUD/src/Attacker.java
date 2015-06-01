


public class Attacker extends Enity{
	int hitPoints;
	
	public Attacker(String name,int locX, int locY, int lifePoints, int hitPoints){
		super(name, locX, locY, lifePoints);
		this.hitPoints = hitPoints;
	}

	public int action(String a) {
		return 0;
	}
	
	public void hit(int power){//drained life.
		lifePoints-= power;
		System.out.printf("you hit the %s. \n", name);
	}
	
	public int gethealth(){//return life of attacker
		return lifePoints;
	}
	
	public int attack(){//points for attackers attack.
		return hitPoints;
	}

}

