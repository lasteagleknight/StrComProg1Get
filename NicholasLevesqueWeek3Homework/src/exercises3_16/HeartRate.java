package exercises3_16;
import java.util.Calendar;


public class HeartRate {
	
	private String firstN, lastN;
	private int day, month, year, age, maxHeartRate;
	
	
public HeartRate(String firstName, String lastName, int day1, int month1, int year1){
		
		firstN = firstName;
		lastN = lastName;
		if( day1 > 0 )
			day = day1;
		if( month1 > 0 )
			month = month1;
		if(year1 > 0 )
			year = year1;
		
	}
//setup for sets and gets
	public void setFirstN( String firstName){
		firstN = firstName;	
	}

	public void setLastN( String lastName ){
		lastN = lastName;
	}
	
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
	
	public String getFirstN(){
		return firstN;
	}
	
	public String getLastN(){
		return lastN;
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
	//display for birthday.
	public void displayBirthDate(){
		System.out.printf("\n%d/%d/%d", month, day, year);
	}
	// calling for current year and then caculating for age
	public void yearsOld(){
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int currentMonth = Calendar.getInstance().get(Calendar.MONTH);
		int currentDay = Calendar.getInstance().get(Calendar.DATE);
		
		age = currentYear - year;
		if(currentMonth < month)
			age = age - 1;
		
		if(currentMonth == month)
			if(currentDay < day)
				age = age - 1;
		
		System.out.printf("\nYou are %d years old.\n", age);
	}
	//useing age to get max heart rate.
	public void maxHeartRate(){
		
		yearsOld();
		maxHeartRate = 220 - age;
		
		System.out.printf("\n%s %s your max heart rate is %d\n", firstN, lastN, maxHeartRate);
	}
	//figuring out target range for the lower end rate and the higher end rate
	public void targetHeartRate(){
		maxHeartRate();
		
		double lowEnd = maxHeartRate * 0.5;
		double highEnd = maxHeartRate * 0.85;
		
		System.out.printf("\n%s %s your target heart rate is %.2f and %.2f beats per min\n", firstN, lastN, lowEnd, highEnd );
	}

}
