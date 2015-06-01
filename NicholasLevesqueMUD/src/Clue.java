
public class Clue extends Object {
	String lookCloser;
	
	public Clue(String name, String lookCloser){
		super(name);
		this.lookCloser = lookCloser;
		
	}
	
	public String ToString(){
		return name;
	}
	
	public void examine(){// this is so you can examine the clue closer.
		System.out.println(lookCloser);
	}

}
