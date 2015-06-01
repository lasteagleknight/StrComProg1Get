/*
 * Write statements that performs the following one-dimensional-array operations:
 * a) Set the 10 elements of integer array counts to zero.
 * b) Add one to each of the 15 elements of integer array bonus.
 * c) Display the five values of integer array bestScores in column format.
 */
package exercises7_11;

public class Statement1 {
	
	private static int[] count = new int[10];
	
	public static void main(String[] args){
		
		for(int counter = 9; counter >= 0; counter--){
			count[ counter]= counter;
			System.out.println(count[counter]);
		}
		System.out.println();
		statement2();
		
		statement3();
	}
	
	public static void statement2(){
		
		int[] bonus = new int[15];
		
		System.out.println("Statement2 line:");
		
		for(int counter = 0; counter < 15; counter++){
			bonus[counter] = counter;
			System.out.println(bonus[counter]);
		}
		
		add(bonus);
		
		System.out.println("Statement2 line changed:");
		for(int counter = 0; counter < bonus.length; counter++){
			System.out.println(bonus[counter]);
		}
		
	}
	
	public static void statement3(){
		
		int[] bestScores = {400, 375, 200, 199, 0};
		
		System.out.println("Players top scores");
		
		for( int count = 0; count < bestScores.length; count++){
			System.out.printf("Player %d Score: %d \n", count + 1, bestScores[ count ]);
		}
			
	}
	
	public static void add(int[] array){
		for (int counter = 0; counter < array.length; counter++)
			array[counter] += 2;
	}
	

}
