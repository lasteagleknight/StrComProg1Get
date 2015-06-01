package exercises3_13;



public class InvoiceTest {
	
	public static void main( String[] args){
		// giving all invoices for each object and telling user what is in stock.
		Invoice invoice1 = new Invoice(
				"P374Z8", "Hammer", 24, 34.27);
		
		System.out.printf("\nPart number: %s", invoice1.getPartNum() );
		
		System.out.printf("\nItem Disription: %s", invoice1.getDescipt() );
		
		System.out.printf("\nQuantity in supply: %d", invoice1.getQuantity() );
		
		System.out.printf("\nPrice: %.2f\n", invoice1.getCost() );
		
		invoice1.getInvoiceAmount();
		
		Invoice invoice2 = new Invoice(
				"P374Z1", "Screwdriver", 0, 11.99);
		
		System.out.printf("\n\nPart number: %s", invoice2.getPartNum() );
		
		System.out.printf("\nItem Disription: %s", invoice2.getDescipt() );
		
		System.out.printf("\nQuantity in supply: %d", invoice2.getQuantity() );
		
		System.out.printf("\nPrice: %.2f\n", invoice2.getCost() );
		
		invoice2.getInvoiceAmount();
		
		Invoice invoice3 = new Invoice(
				"P374Z4", "nail package", -22, 5.30);
		
		System.out.printf("\n\nPart number: %s", invoice3.getPartNum() );
		
		System.out.printf("\nItem Disription: %s", invoice3.getDescipt() );
		
		System.out.printf("\nQuantity in supply: %d", invoice3.getQuantity() );
		
		System.out.printf("\nPrice: %.2f\n", invoice3.getCost() );
		
		invoice3.getInvoiceAmount();
		
	}

}
