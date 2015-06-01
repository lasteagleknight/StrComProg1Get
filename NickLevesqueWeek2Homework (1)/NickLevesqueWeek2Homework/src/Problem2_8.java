
import java.util.Scanner;

public class Problem2_8 {
public static void main(String[]args){
		
		Scanner input = new Scanner( System.in);
		
		int a,b,c=4;
		System.out.print("Enter an integer: ");
		b = input.nextInt();
		a=b*c;
		System.out.printf("$%d is four times $%d", a, b);
		
	}
}
