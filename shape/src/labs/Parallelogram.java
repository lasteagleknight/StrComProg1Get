package labs;

public class Parallelogram extends Quadrilateral {

	public Parallelogram(segment[] sides) {
		super(sides);
		// TODO Auto-generated constructor stub
	}
	public int findArea(){
		int area;
		int length1 = 0;
		int length2 = 0;
		for(int a = 0;a < sides.length; a++){
			if(sides[a].getLength() > 0 && length1 == 0)
				length1 = sides[a].getLength();
			if(sides[a].getLength() != length2)
				length2 = sides[a].getLength();
		}
		area = length1* length2;
		return area;
	}
	 

}
