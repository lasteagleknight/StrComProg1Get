package knightsTour;

public class Counter {
	static int[] myArray = new int [64];
	public static void count(int number){
			myArray[number]++;
			
		System.out.printf("%s%12s\n","Number", "Frequency");
			
		for(int i=0;i<myArray.length;i++)
			System.out.printf("%6d%12d\n", i+1, myArray[i]);
		}
			
	}

