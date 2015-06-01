
public class Person {
	String name;
	private int age, weight, heightInches; // private allows to only though a method.
	private boolean isAlive=true, isAwake;
	
	public Person(String nameIn, int ageIn, int weightIn, int height){
		name=nameIn;
		age=ageIn;
		weight=weightIn;
		heightInches=height;
	}
	
	public void die(){
		isAlive=false;
	}
	
	public void resurrect(){
		isAlive=true;
	}
	
	public void printMessage(){
		System.out.printf("%s is %d years old, weighs %d pounds, is %d\' %d\" tall.\n", 
				name, age, weight, (heightInches/12), (heightInches%12));
		System.out.printf("%s is %s.", name, (isAlive?"alive":"dead\n"));
		
	}
}
