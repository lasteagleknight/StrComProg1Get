package exercises5_21;
/*
 * A right triangle can have sides whose length are all integers. The set
 * of three integer values for the lengths of the sides of a right triangle
 * is called a Pythagorean triple. The lengths of three sides must satisfy the
 * relationship that sum of the squares of two of the sides is equal to the square of the
 * hypotenuse. Write an application that displays a table of the Pythagorean triples for
 * side1, side2 and the hypotenuse, all no larger than 500. Use a triple-nested for loop
 * that tries all possibilites. This method is an example of "brute-force" computing.
 * You'll learn in more advanced computer science course that for many interesting problems
 * there's no known algorithmic approach other than using sheer brute force.
 */

public class PythagoreanTriples {
	
	static int side1, side2;
	static double hypotenuse;
	
	public static void main(String[] args){
		
		System.out.printf("%s%20s%20s\n", "Side1", "Side2", "Hypotenuse");
		
		for(side2 = 1; side2 <= 500; side2++){
	
			for(side1 = 1; hypotenuse <= 500; side1++){
				hypotenuse = Math.sqrt((side1 *side1) + (side2 *side2));
				System.out.printf("%d%20d%20.6f\n", side1, side2, hypotenuse);
			}
			side1 = 1;
			hypotenuse = 0;
			
		}
		System.out.println("End of result");
	}

}
