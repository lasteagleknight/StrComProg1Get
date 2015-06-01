/*
 * Write an application that uses an enhanced for statement to sum the
 * double values passed by the command-line argument[Hint: Use the static
 * method parseDouble of class Double to convert a String to a double value.]
 */
package exercises7_16;

public class UseingForStatement {
	
	private static double[] numbers =
		{200.34, 34.22, 27.14, 54, 90 };
	
	public static void main(String[]args){
		
		double sum = 0;
		
		for(int counter = 0; counter < numbers.length; counter++)
			System.out.printf("Number %d is %.02f\n", counter, numbers[counter]);
		
		for(double count : numbers)
			sum += count;

			System.out.printf("The sum of all the numbers are %.02f ", sum);
		
	}

}
