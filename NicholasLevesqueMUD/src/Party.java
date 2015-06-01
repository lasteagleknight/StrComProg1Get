import java.util.ArrayList;


public class Party {
	
	ArrayList<Enity> group = new ArrayList<Enity>();
	
	public Party(int x, int y){
		group.add(new Partner(x,y));
		
	}
	
	public int action(String a){
		try{
			switch(a){
			case "talk to james":
				Partner.action(Text.input());
				break;
			case "help":
				Text.help();
				break;
			default:
				Text.defalt();
			}
			
		}
		finally{
			System.out.println("Unable to do so.");
		}
		
		return 0;
	}
	
	public void addPerson(Enity person){
		group.add(person);
	}
	

}
