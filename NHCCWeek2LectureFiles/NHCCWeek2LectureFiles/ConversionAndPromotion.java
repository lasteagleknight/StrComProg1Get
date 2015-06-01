package operators;

public class ConversionAndPromotion {
	public static void main(String[]args){
		int iresult, a=10, b=5, c=100;
		double fresult, x=5.5, y=25.5;
		//There are three types of data conversion
		//assignment promotion, arithmetic promotion, and cast
		
		//Assignment promotion
		fresult=a+b;
		System.out.printf("Assignment promotion: %.2f", fresult);
		System.out.println();
		//Arimetic promotion
		fresult = a/x;
		System.out.printf("Arithmetic promotion: %.2f", fresult);
		System.out.println();
		//cast
		fresult = (double)a*b/c;
		System.out.printf("Cast: %.2f", fresult);
		System.out.println();
	}
}
