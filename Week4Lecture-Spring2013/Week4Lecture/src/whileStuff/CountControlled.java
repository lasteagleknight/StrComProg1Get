package whileStuff;

public class CountControlled {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0;
		
		String name = "Nick";
		while(count<=100){
			System.out.println("time to relax!!");
			count++;
		}
		
		count = 0;
		while(count<name.length()){
			System.out.println(name.charAt(count));
			count++;
		}

	}

}
