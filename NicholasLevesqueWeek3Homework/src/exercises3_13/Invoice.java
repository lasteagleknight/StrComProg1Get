package exercises3_13;

public class Invoice {
	
	private String partNum, descript;
	private int quantity;
	private double cost, amount;
	
	public Invoice(String partNumber, String description, int amount, double price )
	{
		partNum = partNumber;
		descript = description;
		quantity = amount;
		cost = price;
		
	}
	//writing all the set and gets for each Invoice varable
	public void setPartNum( String partNumber )
	{
		partNum = partNumber;
	}
	
	public void setDescipt( String description )
	{
		descript = description;
	}
	
	public void setQuantity( int amount )
	{
		quantity = amount;
	}
	
	public void setCost( double price )
	{
		cost = price;
	}
	
	public String getPartNum()
	{
		return partNum;
	}
	
	public String getDescipt()
	{
		return descript;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public void getInvoiceAmount()
	{
		// giving the cost for everything in inventory, negating if the quantity is less then 0
		amount = cost * quantity;
		if(amount >= 0)
		System.out.printf("The total cost of all the %s is $%.2f", descript, (cost*quantity ) );
		else if( amount < 0)
		{
			amount = 0;
			System.out.printf("The total cost of the %s is $%.2f", descript, amount);
		}
	}

}
