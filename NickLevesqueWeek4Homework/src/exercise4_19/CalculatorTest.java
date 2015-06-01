package exercise4_19;

public class CalculatorTest {
		
	public static void main( String[] args){
		
		SalesCommissionCalculator employee1 = new SalesCommissionCalculator( 4, 1, 239.99);
		
		System.out.printf("\nItem: %d cost: %.2f", employee1.getItem(),employee1.getValue());
		employee1.salesCalculator();
		System.out.printf("\npay: %.2f\n", employee1.getPay());
		
		employee1.setItem(2);
		employee1.setValue(129.75);
		
		System.out.printf("\nItem: %d cost: %.2f", employee1.getItem(),employee1.getValue());
		employee1.salesCalculator();
		System.out.printf("\npay: %.2f\n", employee1.getPay());
		
		employee1.setItem(3);
		employee1.setValue(99.95);
		
		System.out.printf("\nItem: %d cost: %.2f", employee1.getItem(),employee1.getValue());
		employee1.salesCalculator();
		System.out.printf("\npay: %.2f\n", employee1.getPay());
		
		employee1.setItem(4);
		employee1.setValue(350.89);
		
		System.out.printf("\nItem: %d cost: %.2f", employee1.getItem(),employee1.getValue());
		employee1.salesCalculator();
		System.out.printf("\npay: %.2f\n", employee1.getPay());
		
		System.out.printf("Your pay is %.2f", employee1.getPay());
		
		
	}

}
