package lectureFiles;

import java.util.Scanner;

public class UserInputIndex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] twoDimArray={{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}};
		int row, column;
		
		//Use variables to retrieve data from the array
		System.out.println("Which index would you like to retrieve?");
		System.out.println("please enter the row:");
		row=scan.nextInt();
		System.out.println("please enter the column:");
		column=scan.nextInt();
		
		System.out.printf("the value at [%s],[%s] is: %s", row, column, twoDimArray[row][column]);

	}

}
