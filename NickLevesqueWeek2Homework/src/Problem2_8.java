
import java.util.Scanner;

public class Problem2_8 {
public static void main(String[]args){
		
		Scanner input = new Scanner( System.in);
		
		int number1,number2,number3=4;
		System.out.print("Enter an integer: ");
		number2 = input.nextInt();
		number1=number2*number3;
		System.out.printf("$%d is four times $%d", number1, number2);
		
	}
}
