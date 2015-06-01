/*
 * A class is a collection of data and servcies that simulate some real-world conditions. 
 * Think of a class as a blueprint
 * We derive objects from classes.  An object is an instance of a class.
 * */
package classAndDriver;

public class ClassAnatomy {
	//Instance data, also called class data, are the variables that can be used by the whole class
	//It is common practice to put instance data at the top of the class
	private String name;
	private int age, weight, heightInches;
	
	//constructor will create an instance of a class, it will set the initial state
	public ClassAnatomy(String name1, int age1){
		int lastName;//local data, not accessible outside of the class
		
		name=name1;//initialize the data using the parameter
		age=age1;
		weight=0;
		heightInches=74;		
	}
	
	//Creating methods:  A method is a set of statements that will execute in order
	//Setter and Getter methods:
	
	public void setWeight(int weight){
		this.weight=weight;
	}
	
	public int getWeight(){
		return weight;
	}
	
	
	public String toString(){
		return "Name:"+ name + "\nAge:"+age+"\nHeight:"+heightInches+"\nWeight:"+weight;		
	}
	
}
