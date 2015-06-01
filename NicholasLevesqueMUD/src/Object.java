
public abstract class Object {
	
	String name;

	public Object(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

	public abstract void examine();
}
