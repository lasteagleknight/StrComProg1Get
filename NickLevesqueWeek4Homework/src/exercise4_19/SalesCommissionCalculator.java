package exercise4_19;

public class SalesCommissionCalculator {
	
	int total;
	int item;
	double value;
	double pay;
	
	public SalesCommissionCalculator(int total, int item, double value){
		
		this.total = total;
		this.item = item;
		this.value = value;
		
	}	
	
	public void setTotal( int total){
		this.total = total;
	}
	
	public void setItem(int item){
		this.item = item;
	}
	
	public void setValue(double value){
		this.value = value;
	}
	
	public int getTotal(){
		return total;
	}
	
	public int getItem(){
		return item;
	}
	
	public double getValue(){
		return value;
	}
	
	public void salesCalculator(){
		
		if(total>=item){
			pay = value + pay;
		}
		if(total == item)
			pay = 200 + (pay * .09);
			
		
	}
	
	public double getPay(){
		return pay;
	}
}
