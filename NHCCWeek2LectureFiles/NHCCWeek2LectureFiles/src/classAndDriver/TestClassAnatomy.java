package classAndDriver;

public class TestClassAnatomy {

	public static void main(String[] args) {
		ClassAnatomy tester=new ClassAnatomy("Charlie", 38);
		
		tester.setWeight(190);
		
		System.out.printf("Weight %d\n", tester.getWeight());
		System.out.println();
		System.out.println(tester.toString());

	}

}
