package finalProject;

public class wageListener {

	private static int trickInteger;
	
	
	public static void wager(int trickInt) {
		
		System.out.println("\nThe trick integer is " +  trickInt);
		trickInteger = trickInt;
		
	}

	public static void suitspin(Object suitData) {
		System.out.println("\nThis suit integer is "+ suitData); 
	}

	
	
	
}
