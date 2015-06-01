package labs;

public abstract class Quadrilateral extends Polygon {

	segment[] sides = null;
	
	public Quadrilateral(segment[] sides) {
		super(sides);
		this.sides = sides;
	}

	public boolean isQuadrilateral() {
		return (sides.length == 4);
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
