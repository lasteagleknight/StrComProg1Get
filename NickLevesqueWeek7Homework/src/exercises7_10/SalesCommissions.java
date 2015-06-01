/*
 * Use a one-dimensional array to solve the following problem: a company
 * pays its salespeople on a commission basis. The salespeople receive $200
 * per week plus 9% of their gross sales for that week. For example, a salesperson
 * who grosses $5000 in sales in a week receives $200 plus 9% of $5000, or a total
 * of $650. Write an application (using an array of counters) that determines how 
 * many of the salespeople earned salaries in each of the following ranges(assume 
 * that each salesperson's salary is truncated to an integer amount):
 * 200-299
 * 300-
 * 400-
 * 500
 * 600
 * 700
 * 800
 * 900
 * 1000+
 * Summarize the results in tabular format.
 */
package exercises7_10;

public class SalesCommissions {
	
	private double[] sales;
	
	public SalesCommissions( double[] salesArray)
	{
		sales = salesArray;
		salary(sales);
	}
	
	public void processSales()
	{
		
		outputGrades();
		
		outputBarChart();
		
	}
	
	public void outputBarChart(){
		
		System.out.println("\n\nSales distribution:");
		
		int[] frequency = new int[ 9 ];
		
		for(double sale : sales ){
			++frequency[ (int) ((sale-200)/100) ];
		}
		
		for (int count = 0; count < frequency.length; count++ ){
			
			if(count == 8)
				System.out.printf("%5d:", 1000);
			else
				System.out.printf("%02d-%02d: ", (count + 2)*100, (count + 2) * 100 + 99);
			
			for (int stars = 0; stars < frequency[ count ]; stars++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	public void outputGrades()
	{
		System.out.println("The salarys are:\n");
		
		for(int salesperson = 0; salesperson < sales.length; salesperson++)
			System.out.printf("Salesperson %2d: %3.2f\n", salesperson + 1, sales[ salesperson ]);
	}
	
	public static void salary(double[] array){
		for (int counter = 0; counter < array.length; counter++)
			array[counter]= array[counter]*.09 + 200;
	}
	

}
