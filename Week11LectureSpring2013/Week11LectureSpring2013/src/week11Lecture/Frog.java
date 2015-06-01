package week11Lecture;

public class Frog extends Animal{

	public Frog(String name, int move){
		super(name);
		setMoveLength(move);
		setModeOfMovement(" hopped ");
	}
	
	@Override 
	public void move(){
		super.getLoc().setX(super.getLoc().getX()-getMoveLength());//this one will move left move spaces
		super.getLoc().setY(super.getLoc().getY());
		System.out.println(this.toString());
	}
	
}
