package labs;

public abstract class Polygon {
	
	segment[] sides;

	public Polygon(segment[] sides) {
		this.sides = sides;
	}

	public abstract double area();
	public abstract double perimeter();	
	
	public int sides() {
		return sides.length;
	}

}
