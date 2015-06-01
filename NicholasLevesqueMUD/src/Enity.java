
public abstract class Enity {//set up for all NPCs
	
	protected String name;
	protected boolean isAlive = true;
	private static Location loc;
	protected int lifePoints;
	Inventory pockets = new Inventory();
	
	public Enity(String name, int locX, int locY, int lifePoints){
		
		this.name = name;
		loc= new Location(locX, locY);
		this.lifePoints = lifePoints;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public static Location getLoc(){
		return loc;
	}
	
	public int getLifePoints() {
		return lifePoints;
	}

	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}
	
	public void damage(int hit){
		lifePoints -= hit;
		if(lifePoints < 0)
			isAlive = false;
	}


}
