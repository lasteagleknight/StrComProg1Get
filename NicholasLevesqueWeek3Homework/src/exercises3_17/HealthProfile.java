package exercises3_17;

import java.util.Calendar;

public class HealthProfile {
	
	private String firstN, lastN;
	private int day, month, year, age, maxHeartRate, heightInches, weightPounds;
	private boolean female;
	
public HealthProfile(String firstName, String lastName, int day1, int month1, int year1,
		int weight, int height, boolean sex){
		
		firstN = firstName;
		lastN = lastName;
		if( day1 > 0 )
			day = day1;
		if( month1 > 0 )
			month = month1;
		if(year1 > 0 )
			year = year1;
		
		weightPounds = weight;
		heightInches = height;
		female = sex;
		
	}
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

public void setHeightInches(int inches){
	heightInches = inches;
}

public void setWeightPounds(int weight){
	weightPounds = weight;
}

public int getHeightInches(){
	return heightInches;
}

public int getWeightPounds(){
	return weightPounds;
}

public void setFemale(boolean sex){
	female = sex;
}

public boolean getFemale(){
	return female;
}

public void displayBirthDate(){
	System.out.printf("\n%d/%d/%d", month, day, year);
}
//getting current age by current date and birth date.
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
	
	System.out.printf(firstN +lastN +" is %d years old.\n", age);
}
//same info as in heart rate program.
public void maxHeartRate(){
	
	yearsOld();
	maxHeartRate = 220 - age;
	
	System.out.printf("\n%s %s your max heart rate is %d\n", firstN, lastN, maxHeartRate);
}

public void targetHeartRate(){
	maxHeartRate();
	
	double lowEnd = maxHeartRate * 0.5;
	double highEnd = maxHeartRate * 0.85;
	
	System.out.printf("\n%s %s your target heart rate is %.2f and %.2f beats per min\n",
			firstN, lastN, lowEnd, highEnd );
}

public void bmi(){

	double bmi = (weightPounds * 703) / (heightInches * heightInches);

	System.out.printf(firstN +lastN +" bmi is %.2f\n", bmi);

	if(bmi <= 18.5)
		System.out.println(firstN +lastN +" is UnderWeight.");
	if(bmi >= 18.5 && bmi <= 24.9)
		System.out.println(firstN +lastN +" is healthy.");
	if(bmi >= 25 && bmi <= 29.9)
		System.out.println(firstN +lastN +" is Overweight.");
	if(bmi >= 30)
		System.out.println(firstN +lastN +" is Obese.");	
}

public void whatSex(){
	
	if(female == true)
		System.out.println(firstN +lastN +" female");
	if(female == false)
		System.out.println(firstN +lastN +" male");
		
		
	
}


}
