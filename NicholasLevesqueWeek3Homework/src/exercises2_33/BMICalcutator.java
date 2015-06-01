package exercises2_33;
import java.util.Scanner;


public class BMICalcutator {
	
	public static void main( String[] args ){
		
		Scanner input = new Scanner( System.in );
		
		double pounds, inches, bmi;
		
		//asking the user for his height and weight 
		System.out.println("Please put in your height in inches: ");
		inches = input.nextInt();
		
		System.out.println("Please put in your weight in pounds: ");
		pounds = input.nextInt();
		
		// equation for the bmi and telling user there bmi
		bmi = (pounds * 703) / (inches * inches);
		
		System.out.printf("Your bmi is %.2f\n", bmi);
		
		// telling user if they are UnderWeight, healthy, Overweight, or obese.
		if(bmi <= 18.5)
			System.out.println("You are UnderWeight.");
		if(bmi >= 18.5 && bmi <= 24.9)
			System.out.println("You are healthy.");
		if(bmi >= 25 && bmi <= 29.9)
			System.out.println("You are Overweight.");
		if(bmi >= 30)
			System.out.println("You are Obese.");
		
	}
}
