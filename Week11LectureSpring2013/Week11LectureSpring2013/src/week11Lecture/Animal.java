package week11Lecture;

public class Animal {
	//these are private so the subclasses still need to access them through getter()
	private String name, modeOfMovement;
	private int moveLength;
	private Location loc;
	
	public Animal(String name){
		this.name=name;
		setMoveLength(0);	
		loc=new Location(5, 5);
		modeOfMovement=" moved ";
	}
	//animal will move diagonally down to the right move spaces
	public void move(){
		loc.setX(loc.getX()+getMoveLength());
		loc.setY(loc.getY()+getMoveLength());
		System.out.println(this.toString());
	}
	
	@Override
	public String toString(){
		return name+ modeOfMovement+getMoveLength()+" spaces to location ("+loc.getX()+","+loc.getY()+")";
	}
	
	//Getters and setters=====================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModeOfMovement() {
		return modeOfMovement;
	}

	public void setModeOfMovement(String modeOfMovement) {
		this.modeOfMovement = modeOfMovement;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}


	public int getMoveLength() {
		return moveLength;
	}

	public void setMoveLength(int moveLength) {
		this.moveLength = moveLength;
	}

}
