/*
 * In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !. De Morgan's 
 * law can sometimes make it more convenient for us to express a logical expression. These 
 * laws state that the expression !(condition1 && condition2) is logically equivalent to the
 * expression (!condition1 || !condition2). Also the expression !(condition1 || condition2) is
 * logically equivalent to the expression ( !condition1 && !condition2). Use DeMorgan's laws to 
 * write equivalent expression for each of the following, then write an application to show that
 * both the original expression and the new expression in each case produce the same value:
 * a) !( x < 5 ) && !( y >= 7 )
 * b) !( a == b ) || !(g != 5 )
 * c) !(( x <= 8 ) && (y > 4 ))
 * d) !(( i > 4 ) || (j <= 6 ))
 */
package exercises5_23;

import java.util.Scanner;

public class DeMorgansLaws {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		String response = "";
		int x = 0, y =0, a = 0, b = 0, i = 0, j = 0, g = 0;
		
		//question for a
		System.out.println("Do you want to make statement one true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			x = 0;
		else
			x = 10;
		System.out.println("Do you want to make statement true true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			y = 10;
		else
			y = 0;
		
		// set for a
		if(!( x < 5 ) && !( y >= 7 ))
			System.out.println("!( x < 5 ) && !( y >= 7 ) is true");
		else
			System.out.println("!( x < 5 ) && !( y >= 7 ) is false");
		
		if(!(( x < 5 ) || ( y >= 7 )))
			System.out.println("!(( x < 5 ) || ( y >= 7 )) is true");
		else
			System.out.println("!(( x < 5 ) || ( y >= 7 )) is false");
		
		System.out.println();
		// question for b
		System.out.println("Do you want to make statement one true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true")){
			a = 5;
			b = 5;
		}
		else{
			a = 10;
			b = 0;
		}
		System.out.println("Do you want to make statement true true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			g = 10;
		else
			g = 5;
		
		// set for b
		if(!( a == b ) || !(g != 5 ))
			System.out.println("!( a == b ) || !(g != 5 ) is true");
		else
			System.out.println("!( a == b ) || !(g != 5 ) is false");
		
		if(!(( a == b ) && (g != 5 )))
			System.out.println("!(( a == b ) && (g != 5 )) is true");
		else
			System.out.println("!(( a == b ) && (g != 5 )) is false");
		
		System.out.println();
		
		// question for c
		System.out.println("Do you want to make statement one true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			x = 0;
		else
			x = 10;
		System.out.println("Do you want to make statement true true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			y = 10;
		else
			y = 0;
		
		//set for c
		if(!(( x <= 8 ) && (y > 4 )))
			System.out.println("!(( x <= 8 ) && (y > 4 )) is true");
		else
			System.out.println("!(( x <= 8 ) && (y > 4 )) is false");
		
		if(!( x <= 8 ) || !(y > 4 ))
			System.out.println("!( x <= 8 ) || !(y > 4 ) is true");
		else
			System.out.println("!( x <= 8 ) || !(y > 4 ) is false");
		
		System.out.println();
		
		System.out.println("Do you want to make statement one true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			i = 0;
		else
			i = 10;
		System.out.println("Do you want to make statement true true or false.");
		response=scan.next();
		if(response.equalsIgnoreCase("true"))
			j = 0;
		else
			j = 10;
		
		//set for d
		if(!(( i > 4 ) || (j <= 6 )))
			System.out.println("!(( i > 4 ) || (j <= 6 )) is true");
		else
			System.out.println("!(( i > 4 ) || (j <= 6 )) is false");
		
		if(!( i > 4 ) && !(j <= 6 ))
			System.out.println("!( i > 4 ) && !(j <= 6 ) is true");
		else
			System.out.println("!( i > 4 ) && !(j <= 6 ) is false");
	}

}
