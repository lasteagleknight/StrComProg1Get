package exercises3_14;

public class Employee {
	
	private String firstN, lastN;
	private double monthPay;
	
	public Employee(String firstName, String lastName, double monthlyPay){
		
		firstN = firstName;
		lastN = lastName;
		if(monthlyPay > 0)
		monthPay = monthlyPay;
		
	}
	//setup for all sets and gets.
	public void setFirstN( String firstName){
		firstN = firstName;	
	}
	
	public void setLastN( String lastName ){
		lastN = lastName;
	}
	
	public void setMonthPay( double monthlyPay ){
		monthPay = monthlyPay;
	}
	
	public String getFirstN(){
		return firstN;
	}
	
	public String getLastN(){
		return lastN;
	}
	
	public double getMonthPay(){
		return monthPay;
	}

}
