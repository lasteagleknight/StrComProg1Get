
public class DataAndAssignment {
	
	//The main method will run the program.  All Java applications need a main method
	public static void main(String[] args) {
		//When choosing your data type, think about what is supposed to represent.  
		/*E.g. if you are going to count the number of people entering or exiting a stadium, 
		 * you might use short because you will never exceed the max value of short.  
		 * You should always thing about the platform for which you will be developing.  If you 
		 * plan on making software for small machines with very limited memory, you should use short.
		 * if memory is not that much of a concern, int is just fine.*/
		int a, b, c;//ints are counting numbers they are 32 bit numbers
		long count1, count2;//long are integers as well but are 64 bit so you have many more values available
		short min, max;//Short is a 16 bit number.
		
		//floating point types are decimal numbers
		/*The range of values in float and double is enormous!  These are good for most scientific applications.
		 * When you need more precise values, for currency for example, there are other means such as BigDecimal
		 * We will not cover BigDecimal class today but here is some info: http://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html
		 * */
		float f1, f2, f3;//32bit
		double x, y, z;//64bit
		
		//Char is a character. 16bit unicode characters
		char firstChar, lastChar;
		
		//Boolean holds true of false values.  These are used for decision making structures
		boolean isEmpty;
		
		
		//String is not primitive data!  
		/*
		 * String is often declared and assigned like primitive data, but is still object type
		 * String has methods, it behaves like other objects when passed to a parameter, 
		 * its variable holds a reference to the object data not the data itself.  
		 * */
		String myName="Charlie";
		String otherName=new String("Charles");
		
		
		//Basic assignment
		x=1;  y=2;  x=y;  x=x+y;//you can assign values directly into a variable or use other variables to make assignemnt
		z=12*9+5/3%6;//you can make calculations and assign the result into a variable
		firstChar=myName.charAt(0); lastChar=myName.charAt(myName.length()-1);//You can make method calls and assign the returned values into variables
		
		
		

	}

}
