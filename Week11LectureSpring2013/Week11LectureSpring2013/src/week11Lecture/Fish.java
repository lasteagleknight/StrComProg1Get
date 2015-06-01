package week11Lecture;

public class Fish extends Animal{

	public Fish(String name, int move){
		super(name);
		setMoveLength(move);
		setModeOfMovement(" swam ");
	}
	
	@Override
	public void move(){
		super.getLoc().setX(super.getLoc().getX());
		super.getLoc().setY(super.getLoc().getY()+getMoveLength());//this one will move right move spaces
		System.out.println(this.toString());
	}
	
}
