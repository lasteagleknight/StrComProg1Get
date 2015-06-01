package week11Lecture;

public class Dog extends Animal{

	public Dog(String name, int move){
		super(name);
		setMoveLength(move);
		setModeOfMovement(" ran ");
	}
	
	@Override
	public void move(){
		super.getLoc().setX(super.getLoc().getX());
		super.getLoc().setY(super.getLoc().getY()-getMoveLength());//this one will move up move spaces
		System.out.println(this.toString());
	}
	
}
