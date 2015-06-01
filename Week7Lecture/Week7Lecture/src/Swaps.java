import java.util.Random;


public class Swaps {

	
	public static void main(String[] args) {
		int[] myArray={1,2,3,4,5,6,7,8,9,10};
		System.out.println("before reverso:");
		for(int num: myArray)
			System.out.printf("%d, ", num);
				
		System.out.println();
				
		reverso(myArray);
				
		System.out.println("After reverso:");
		for(int num: myArray)
			System.out.printf("%d, ", num);
		System.out.println();
		System.out.println();
				
		System.out.println("Not yet randomized:");
		for(int num: myArray)
			System.out.printf("%d, ", num);
				
		randomize(myArray);
		System.out.println();
		System.out.println("Randomized:");
				
		for(int num: myArray)
			System.out.printf("%d, ", num);
		
		System.out.println();
		System.out.println();
				
		System.out.printf("Length of origianl array: %d\n", myArray.length);				
		myArray=embiggen(myArray);
		
		System.out.printf("Length of array after embiggen() is called: %d\n", myArray.length);

	}
	
	public static void randomize(int[] arr){
		/**
		 * This algorithm comes from the Deck of Cards Simulation from the text 
		 * See lines 41-44 in listing 7.9
		 */
		
		Random rand=new Random();
		int temp;
		int randIndex;
		for(int i=0; i<arr.length; i++){
			randIndex=rand.nextInt(arr.length);
			
			//temp will hold the value in index i
			//i will get overwritten so we need someplace to keep that data
			temp=arr[i];
			arr[i]=arr[randIndex];//assign the value of a random index into i overwriting the original value
			arr[randIndex]=temp;//put the value held in temp into the random index, thus completing the swap
			
		}//end for	
		
	}//end randomize()
	
	public static void reverso(int[] arr){
		int temp;//temp int to hold the value to be swapped
		
		for(int i=0;i<arr.length/2; i++){//you only need to iterate over half of the array
			temp=arr[i];//temp holds the i index
			arr[i]=arr[arr.length-1-i];//hold the last un-swapped value in the array
			arr[arr.length-1-i]=temp;//complete swap
		}
		
	}
	
	public static int[] embiggen(int[] arr){
		//make a new temp array that is twice the length of the original
		int[] tempArr =new int[arr.length*2];
		
		//assign all of the values from the original to the temp
		for(int i=0;i<arr.length; i++)
			tempArr[i]=arr[i];
		
		//point the reference for the original array to the data held in the tempArray
		arr=tempArr;
		
		return arr;
	}//end this cromulent method!

}
