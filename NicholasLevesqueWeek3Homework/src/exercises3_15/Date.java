package exercises3_15;

public class Date {
	
	private int day, month, year;
	//setup for dates. avoiding anything negitive.
	public Date(int day1, int month1, int year1){
		if( day1 > 0 )
		day = day1;
		if( month1 > 0 )
		month = month1;
		if(year1 > 0 )
		year = year1;
	}
	//setup for sets and gets
	public void setDay( int day1 )
	{
		day = day1;
	}
	
	public void setMonth( int month1 )
	{
		month = month1;
	}
	
	public void setYear( int year1 )
	{
		year = year1;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	//simple output for displaying the date.
	public void displayDate(){
		System.out.printf("%d/%d/%d", month, day, year);
	}

}
