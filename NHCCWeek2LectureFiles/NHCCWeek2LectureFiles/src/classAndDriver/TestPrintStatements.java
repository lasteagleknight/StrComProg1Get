package classAndDriver;

public class TestPrintStatements {

	public static void main(String[] args) {
		ClassAnatomy tester=new ClassAnatomy("Charlie", 38);
		
		//print() statement prints a string.
		System.out.print("Printing data ");
		System.out.print("from a class!");
		
		//println() statement prints a string with a line break at the end of the string.
		System.out.println("Printing data ");
		System.out.println("from a class!");
		
		System.out.printf("You can print numbers like this: %d!\nand Strings like this: %s!", 74, "String here!");
		System.out.println();
		System.out.printf("Floting points: %.4f", 3.578346587);
		
		
	}

}
