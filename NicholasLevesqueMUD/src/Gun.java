
public class Gun extends Object {
	
	static int bullets;
	
	public Gun(String name, int bullets){//gun that the user can use at anytime.
		super(name);
		Gun.bullets = bullets;
	}

	public static int getBullets() {
		return bullets;
	}

	public static void setBullets(int bullet) {
		bullets = bullet;
	}
	
	public static void addBullets(int bullet){
		bullets += bullet;
	}

	@Override
	public void examine() {
		
	}

}
