package exercise4_35;

import java.util.Scanner;

public class Triangle {
	
	static Scanner input = new Scanner( System.in );
	
	static int length1, length2, length3;
	static boolean triangle;
	
	public static void main(String[] args){
		
		System.out.print("Enter the first lenght in inches.");
		length1 = input.nextInt();
		
		System.out.println("Enter the second lenght in inches.");
		length2 = input.nextInt();
		
		System.out.println("Enter the third lenght in inches.");
		length3 = input.nextInt();
		
		
		triangleCompute();
		
		System.out.println(triangle?"This is a triangle":"This is not a triangle.");
		
	}
	
	public static void triangleCompute(){
		
		int sum1 = length2 + length3;
		int sum2 = length1 + length3;
		int sum3 = length1 + length2;
		
		
		if(length1 > length2 && length1 > length3){
			if(length1 < sum1)
				triangle = true;
		}
		else if(length2 > length1 && length2 > length3){
			if(length2 < sum2)
				triangle = true;
		}
		else if(length3 > length1 && length3 > length2){
			if(length3 < sum3)
				triangle = true;
		}
		else
			triangle = false;
	}

}
