package labs;

public class segment {

	point one = null;
	point two = null;

	public segment(point one, point two) {
		this.one = one;
		this.two = two;
	}

	public int getLength() {
		return (int) Math
				.sqrt((double) (Math.pow((one.getX() - two.getX()), 2) + Math
						.pow((one.gety() - two.gety()), 2)));
	}

	public int getSlope() {
		return (one.gety() - two.gety()) / (one.getX() - two.getX());
	}

}
