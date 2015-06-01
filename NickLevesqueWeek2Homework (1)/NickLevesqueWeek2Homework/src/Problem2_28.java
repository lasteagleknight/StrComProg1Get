import java.util.Scanner;

public class Problem2_28 {
	public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		double r;
		
		System.out.print("Enter your radius length:");
		r = input.nextInt();
		
		System.out.printf("The diameter is %.3f.\n", ( 2 * r ) );
		
		System.out.printf("The circumference of the circle is %.3f.\n", (2 * ( 3.14159 * r ) ) );
		
		System.out.printf("The area of the circle is %.3f.\n", (3.14159 *( r * r ) ) );
		
	}

}
