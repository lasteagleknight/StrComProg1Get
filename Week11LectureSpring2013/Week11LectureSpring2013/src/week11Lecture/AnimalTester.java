package week11Lecture;

import java.util.ArrayList;

public class AnimalTester {
	public static void main(String[] args){
	
	//In Java, each object knows how to do the right thing in response to the same method call.
	//All three animal types inherit methods and data members from Animal
	//All three animal types override the move method from the superclass
		
	//assign a subclass reference to a superclass variable
	Animal myFrog=new Frog("Hoppy", 3);
	Animal myFish=new Fish("Steve", 7);
	Animal myDog=new Dog("Stella", 6);
	//dynamic binding allows Java to choose which class method to invoke
	myDog.move();//call the dog move
	myFish.move();//call the fish move
	myFrog.move();//call the frog move
	
	
	//I cannot treat a superclass as a subclass
	//Dog myAnimal=new Animal("Animal");
	
	System.out.println();//This could be useful for an inventory for a player in a game.
	System.out.println("Using an arraylist of type Animal");
	ArrayList<Animal> menagerie=new ArrayList<Animal>();
	menagerie.add(new Dog("Frank", 2));
	menagerie.add(new Dog("Yello Dog", 27));
	menagerie.add(new Fish("Fishstick", 1));
	menagerie.add(new Frog("Frog the frog", 6));
	menagerie.add(new Fish("Moby Dick", 8));
	
	
	
	//use a loop to get em and move em
	for(int i=0; i<menagerie.size();i++){
		menagerie.get(i).move();		
	}
	
	//Check to see what class these objects are
	for(int i=0; i<menagerie.size();i++){
		System.out.printf("Animal %d is a %s\n", i, menagerie.get(i).getClass().getName());
		//getClass() is from Object and returns a class object
		//getName() is from Class and returns a String representation of the class name
	}
	
	}

}
