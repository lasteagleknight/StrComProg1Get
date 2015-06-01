/*
 * Write an application that displays the following patterns separately, one below
 * the other. Use for loops to generate the patterns. All asterisks (*) should be 
 * printed by a single statement of the form System.out.print('*'); which causes
 * the asterisks to print side by side. A statement of the form System.out.println();
 * can be used to move to the next line. A statement of the form System.out.print(' ');
 * can be used to display a space for the last two patterns. There should be no other
 * output statements in the program.[Hint: The last two patterns require that each line
 * begin with an appropriate number of blank spaces.]
 */
package exercises5_15;

public class TranglePrintingProgram {
	
	public static void main(String[] args){
		// set for (a)
		for(int a = 1; a <= 10; a++){
			for(int row = 0; row < a; row++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//set for (b)
		for(int a = 10; a >= 1; a--){
			for(int row = 0; row < a; row++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//set for (c)
		for(int a = 1; a <= 10; a++){
			for(int row = 1; row < a; row++){
				System.out.print(' ');
			}
			for(int row2 = 10; row2 >= a; row2--){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		//set for (c)
		for(int a = 1; a <= 10; a++){
			for(int row = 10; row > a; row--){
				System.out.print(' ');
			}
			for(int row2 = 1; row2 <= a; row2++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		
	}
}


