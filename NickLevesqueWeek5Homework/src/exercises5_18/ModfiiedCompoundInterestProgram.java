/*
 * Modify the application in Fig 5.6 to use only integers to calculate the compound 
 * interest.[Hint: Treat all monetary amounts as integral numbers of pennies. Then
 * break the result into its dollars and cents portions by using the division and
 * remainder operations, respectively. Insert a period between the dollars and the
 * cents portions.]
 */
package exercises5_18;

public class ModfiiedCompoundInterestProgram {
	
	public static void main(String[]args){
		
		int amount; // amount on deposit at end of each year
		int principal = 100000; //initial amount before interest
		//double rate = 0.05; // interest rate
		
		//display headers
		System.out.printf("%s%20s\n", "Year", "Amount on deposit");
		
		// calculate amount on deposit for each of ten years
		for ( int year = 1; year <= 10; year++ ){
			
			//Calculate new amount for specified year
			amount = (int) (principal * Math.pow(1.05, year));
			
			int dollers = amount/100;
			int cents = amount%100;
			
			// display the year and the amount
			System.out.printf("%4d%,20d.%02d\n", year, dollers, cents );
		}//end for
	}//end main
}//end class Interest
