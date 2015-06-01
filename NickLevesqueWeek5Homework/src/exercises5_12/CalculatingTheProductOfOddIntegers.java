/*
 * Write an application that calculates the product of the odd integers 
 * from 1 to 15.
 */
package exercises5_12;

public class CalculatingTheProductOfOddIntegers {

		public static void main(String[] args){
			for(int number = 1; number <= 15; number++){
				System.out.print(number);
				if(number%2 == 1)
					System.out.print(" is odd\n");
				else
					System.out.print(" is even\n");
		}
	}
}
