/*
 * Write an application that uses repetition and switch statements to
 * print the song "The Twelve Days of Christmas." One switch statement should
 * be used to print the day ("first," "second," and so on). A separate switch
 * statement should be used to print the remainder of each verse. Visit the 
 * website en.wikipedia.org/wiki/The_Twelve_Days_of_Christmas_(song) for the lyrics
 * of the song.
 */
package exercises5_29;

public class The12DaysOfChristmas {
	
	public static void main(String[]args){
	
		int days = 1;
	
		do{
			christmas(days);
			System.out.println("my true love gave to me");
			gifts(days);
			System.out.println();
			days++;
			
		}while(days <= 12);
	}
	
	public static void gifts(int days){
		
		switch(days){
		
		case 12:
			System.out.println("Twelve drummers drumming,");
		case 11:
			System.out.println("Eleven pipers piping,");
		case 10:
			System.out.println("Ten lords a-leaping,");
		case 9:
			System.out.println("Nine ladies dancing,");
		case 8:
			System.out.println("Eight maids a-milking,");
		case 7:
			System.out.println("Seven swans a-swimming,");
		case 6:
			System.out.println("Six geese a-laying,");
		case 5:
			System.out.println("Five golden rings,");
		case 4:
			System.out.println("Four calling birds,");
		case 3:
			System.out.println("Three French hens,");
		case 2:
			System.out.println("Two turtle doves, and");
		case 1:
			System.out.println("a partridge in a pear tree.");
		}
		
	}
	
	public static void christmas(int days){
		switch(days){
		
		case 12:
			System.out.println("On the twelth day of Christmas");
			break;
		case 11:
			System.out.println("On the eleventh day of Christmas");
			break;
		case 10:
			System.out.println("On the tenth day of Christmas");
			break;
		case 9:
			System.out.println("On the ninth day of Christmas");
			break;
		case 8:
			System.out.println("On the eighth day of Christmas");
			break;
		case 7:
			System.out.println("On the seventh day of Christmas");
			break;
		case 6:
			System.out.println("On the sixth day of Christmas");
			break;
		case 5:
			System.out.println("On the fifth day of Christmas");
			break;
		case 4:
			System.out.println("On the fourth day of Christmas");
			break;
		case 3:
			System.out.println("On the third day of Christmas");
			break;
		case 2:
			System.out.println("On the second day of Christmas");
			break;
		case 1:
			System.out.println("On the first day of Christmas");
			break;
		}
		
	}

}
