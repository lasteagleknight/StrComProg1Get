package exercises7_10;

public class SalesCommissionsTest {
	
	public static void main( String[] args){
		
		double[] salesArray = { 5000, 3000, 3750, 3550, 1400, 3000, 6000, 9000 };
		
		SalesCommissions mySales = new SalesCommissions(salesArray);
		mySales.processSales();
	}

}
